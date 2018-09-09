package pattern.behavioral.mediator;

/**
 * Created by sharp on 2018/9/8.
 */
public class MediatorImp implements IMediator {

    private A a;
    private B b;

    @Override
    public void a2b() {
        System.out.println("a invoke b");
        b.who();
    }

    @Override
    public void b2a() {
        System.out.println("b invoke a");
        a.whos();
    }

    public void setA(A a) {
        this.a = a;
    }

    public void setB(B b) {
        this.b = b;
    }
}
