package pattern.structual.bridge;


public class RefinedAbstraction extends Abstraction{

	public RefinedAbstraction(Implementor mImplementor) {
		super(mImplementor);
	}
	
	@Override
	public void toDo() {
		
		System.out.println("RefinedAbstraction toDo...");
		getmImplementor().doSomething();
		getmImplementor().doSomething();
		
	}

}
