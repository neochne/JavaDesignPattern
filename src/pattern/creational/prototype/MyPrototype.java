package pattern.creational.prototype;

public class MyPrototype implements Cloneable{
	
	private String name = "";
	
	// 方法为 protected 访问修饰符，只能在同一个包中使用，如果需要其它包也引用这个类，需要改为 public
	@Override
	protected MyPrototype clone() throws CloneNotSupportedException {
		MyPrototype prototype = null;
		prototype = (MyPrototype) super.clone();
		return prototype;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
