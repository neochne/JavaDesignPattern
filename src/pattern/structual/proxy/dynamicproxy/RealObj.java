package pattern.structual.proxy.dynamicproxy;

/**
 * 
 * @author sharp
 * 可以实现多个接口，也就是说可以是多个被代理对象的代理对象
 */
public class RealObj implements IProxy{

	@Override
	public String operation(String str) {
		
		System.out.println("RealObj operation method invoking...");
		return str;
		
	}

	@Override
	public void operationArgs(String str) {
		
		System.out.println("RealObj operationArgs method invoking..." + "arg=" + str);
		
	}

}
