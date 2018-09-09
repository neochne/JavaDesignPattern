package pattern.creational.builder.outer;


public interface IBuilder {
	void setName();
	void setColor();
	void setMemory();
	void setReleaseDate();
	Phone build();
}
