package pattern.creational.builder.outer;

/**
 * 不同 Builder 对应不同的对象
 * 可以定义不同的 Builder 以创建出特色不同的对象
 */
public class I6Builder implements IBuilder{
	
	private Phone phone = new Phone();


	@Override
	public void setName() {
		phone.setName("Iphone 6");
	}


	@Override
	public void setColor() {
		phone.setColor("Black");
	}


	@Override
	public void setMemory() {
		phone.setMemory("32g");
	}


	@Override
	public void setReleaseDate() {
		phone.setReleaseDate(2015);
	}
	
	@Override
	public Phone build() {
		return phone;
	}

}
