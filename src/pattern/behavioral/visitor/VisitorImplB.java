package pattern.behavioral.visitor;

public class VisitorImplB implements Visitor{

	@Override
	public void visitVisitableA(VisitableImplA implA) {
		implA.print();
	}

	@Override
	public void visitVisitableB(VisitableImplB implB) {
		implB.print();
	}

}
