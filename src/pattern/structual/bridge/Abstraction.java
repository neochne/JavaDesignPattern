package pattern.structual.bridge;


/**
 * 
 * @author sharp
 * 抽象化角色
 * 可以是接口或抽象类
 * 定义了基于Implementor接口的更高层次的操作
 * 
 */
public abstract class Abstraction {
	
	// 抽象角色引用实现角色
	private Implementor mImplementor;
	
	// 强制约束子类必须实现该构造函数
	public Abstraction(Implementor mImplementor) {
		this.mImplementor = mImplementor;
	}
	
	public Implementor getmImplementor() {
		return mImplementor;
	}

	public abstract void toDo();
	
	
}
