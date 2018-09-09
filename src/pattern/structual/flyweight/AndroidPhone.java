package pattern.structual.flyweight;

public class AndroidPhone implements Phone{
	
	private String brand;
	
	public AndroidPhone(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public void makePhone() {
		System.out.println("制造了一个" + brand + "牌子的手机");
	}

}
