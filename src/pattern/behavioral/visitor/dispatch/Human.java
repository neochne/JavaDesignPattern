package pattern.behavioral.visitor.dispatch;

public class Human {
	
	public void sale(Animal animal){
		System.out.println("Sale animal");
	}
	
	public void sale(Cat cat){
		System.out.println("Sale cat");
	}
	
	public void sale(Dog dog){
		System.out.println("Sale dog");
	}
}
