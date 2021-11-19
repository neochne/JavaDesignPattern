package pattern.structual.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 1. 动态代理代理的是接口，不是类，也不是抽象类，如果要代理类，需要用到其它框架，例：cglib
 *
 * 2. Proxy.newProxyInstance 返回的是一个 JVM 运行时动态生成的一个类，
 *    这个类默认实现了我们在调用这个方法传递的第二个参数的所有接口，命名格式为： com.sun.proxy.$Proxy0
 *
 * 3. Proxy.newProxyInstance 方法
 *    3.1 参数
 *        参数1（ClassLoader loader）:     只要用一个本项目的类的类加载器都可以
 *        参数2（Class<?>[] interfaces）： 类实现的所有接口的 Class 对象
 *        参数3（InvocationHandler h）：   InvocationHandler 对象
 *
 * 4. InvocationHandler.invoke 方法：
 *    4.1 参数及返回值
 *        参数1（Object proxy）：JVM 运行时动态生成的代理对象（格式为：$Proxy[X]），也是 newProxyInstance 返回的对象
 *                             invoke 方法里也不能再调用参数 proxy 对象的方法，否则会死循环，例：
 *                             System.out.println(proxy);
 *                             method.invoke(proxy,args);
 *        返回值：该方法返回值为调用方法后的返回值，一般为：return method.invoke(serviceImpl,args); 即可
 *               如果要返回一个固定的值，则有返回值的方法调用后返回的都是这个固定值
 *    4.2 如果 invoke 方法中不调用 method.invoke(serviceImpl,args); 方法，则使用 Proxy.newProxyInstance 返回的代理对象调用方法也无用
 *    4.3 只有 Proxy.newProxyInstance 返回的代理对象调用具体方法时，才回调 invoke 方法
 */
public class Test {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
         * ---- 调用方式1
         */
        System.out.println("调用方式2");
        Service serviceImpl = new ServiceImpl();                   // ok
        // Class<ServiceImpl> serviceImplClz = ServiceImpl.class;  // ok
        Object obj = Proxy.newProxyInstance(
                // Test.class.getClassLoader(),           // ok
                Service.class.getClassLoader(),           // ok
                // ServiceImpl.class.getInterfaces(),     // ok
                new Class[] {Service.class,Mapper.class}, // ok
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("do something 1...");
                        // Object ret = method.invoke(serviceImplClz.newInstance(),args);// ok
                        Object ret = method.invoke(serviceImpl,args);                    // ok
                        System.out.println("do something 2...");
                        return ret;
                    }
                }
        );

        /* obj 既是 Service 对象，也是 Mapper 对象 */
        Service service = (Service) obj;
        System.out.print(service.getName(1));
        service.insertName("");
        Mapper mapper = (Mapper) obj;
        mapper.insertBatch("");

        System.out.println();
        System.out.println();

        /*
         * ---- 调用方式2
         */
        System.out.println("调用方式2");
        Object obj2 = Proxy.getProxyClass(Test.class.getClassLoader(), Service.class,Mapper.class)
                .getConstructor(InvocationHandler.class)
                .newInstance(new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("do something start...");
                        Object ret = method.invoke(serviceImpl,args);
                        System.out.println("do something end...");
                        return ret;
                    }
                });

        Service service1 = (Service) obj2;
        System.out.print(service.getName(1));
        service.insertName("");
        Mapper mapper2 = (Mapper) obj2;
        mapper.insertBatch("");

        System.out.println();
        System.out.println();

        /*
         * 自己就是代理
         */
        System.out.println("自己就是代理");
        Service service2 = (Service) Proxy.newProxyInstance(
                Service.class.getClassLoader(),
                new Class[]{Service.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("self proxy...");
                        System.out.println("method DeclaringClass: " + method.getDeclaringClass());
                        if (method.getDeclaringClass() == Object.class) {
                            System.out.println("exec object method ...");
                            return method.invoke(this, args);
                        }
                        return null;
                    }
                });
        service2.toString();
        service2.insertName("");

        System.out.println();
        System.out.println();

        /*
         * 代理实体对象
         */
        System.out.println("代理实体对象");
        Object object = Proxy.newProxyInstance(
                NormalClass.class.getClassLoader(),
                new Class[] {NormalClass.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("proxy entity class");
                        return null;
                    }
                }
        );
        object.toString();
    }

}
