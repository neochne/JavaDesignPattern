package pattern.structual.decorator;

public class Decorator implements ICommon{
	
	private ICommon i;
	
	
	public Decorator(ICommon i) {
		super();
		this.i = i;
	}

	@Override
	public void commonMehotd(String str) {
		String s1 = decMethod1(str);
		i.commonMehotd(s1);
		decMethod2();
	}
	
	private String decMethod1(String str){
		return str += "decMethod1";
	}
	
	private void decMethod2(){
		System.out.println("decMethod2");
	}

}
