package pattern.structual.adapter.classadapter;

public class Adapter extends Original implements INewBusiness{

	@Override
	public void method2() {
		System.out.println("Adapter method2...");
	}

}
