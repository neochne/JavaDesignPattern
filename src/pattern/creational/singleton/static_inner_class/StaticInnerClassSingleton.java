package pattern.creational.singleton.static_inner_class;

/**
 * Created by sharp on 2018/9/9.
 */
public final class StaticInnerClassSingleton {

    private static final class SingletoneHolder{
        private final static StaticInnerClassSingleton SINGLETON = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){}

    public static StaticInnerClassSingleton getInstance(){
        return SingletoneHolder.SINGLETON;
    }

    public void print(){
        System.out.println("Thread = " + Thread.currentThread().getName() + " [" + SingletoneHolder.SINGLETON + "]");
    }

}
