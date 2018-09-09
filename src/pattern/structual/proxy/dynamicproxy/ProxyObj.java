package pattern.structual.proxy.dynamicproxy;

public class ProxyObj implements IProxy{
	
	@Override
	public String operation(String str) {
		
		System.out.println("ProxyObj operation....");
		return str;
	
		
	}
	
	@Override
	public void operationArgs(String str) {
		
		System.out.println("ProxyObj operationArgs...." + "arg = " + str);
		
	}

}
