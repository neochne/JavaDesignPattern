package pattern.structual.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyObj implements InvocationHandler{
	
	private RealObj mRealObj;
	
	
	public DynamicProxyObj(RealObj mRealObj) {
		this.mRealObj = mRealObj;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
		
		System.out.println("Before calling..."+method);
		method.invoke(mRealObj, args);
		System.out.println("After calling..."+method);
		
		return null;
		
	}


}
