package pattern.behavioral.visitor;

public class VisitableImplB implements Visitable{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitVisitableB(this);
	}
	
	public void print(){
		System.out.println("VisitableImplB");
	}
	
}
