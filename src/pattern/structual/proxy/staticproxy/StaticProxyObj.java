package pattern.structual.proxy.staticproxy;

public class StaticProxyObj extends AbsObj{
	
	private RealObj mRealObj;
	private void beforeOperation(){
		System.out.println("ProxyObj beforeOperation...");
	}
	
	@Override
	public void operation() {
		System.out.println("ProxyObj operation...");
		beforeOperation();
		if (mRealObj == null) {
			mRealObj = new RealObj();
		}
		mRealObj.operation();
		afterOperation();
	}
	
	private void afterOperation(){
		System.out.println("ProxyObj afterOperation...");
	}
	
}
