package pattern.behavioral.visitor;

public class VisitableImplA implements Visitable{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitVisitableA(this);
	}
	
	public void print(){
		System.out.println("VisitableImplA");
	}
}
