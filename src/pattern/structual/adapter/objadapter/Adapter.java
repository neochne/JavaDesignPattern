package pattern.structual.adapter.objadapter;

public class Adapter implements INewBusiness{
	
	private Original mOriginal;
	
	
	public Adapter(Original mOriginal) {
		super();
		this.mOriginal = mOriginal;
	}

	@Override
	public void method1() {
		
		mOriginal.method1();
		
	}

	@Override
	public void method2() {
		System.out.println("Adapter method2...");
	}

}
