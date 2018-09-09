package pattern.creational.builder.outer;

/**
 * 决定了创建对象的顺序
 * 可以定义多个 Director
 */
public class Director {
	
	private IBuilder builder;

	public Director(IBuilder builder) {
		super();
		this.builder = builder;
	}
	
	public void construct(){
		builder.setReleaseDate();
		builder.setName();
		builder.setMemory();
		builder.setColor();
	}
	
}
