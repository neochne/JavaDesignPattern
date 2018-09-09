package pattern.behavioral.mediator;

/**
 * Created by sharp on 2018/9/8.
 */
public class A {

    private MediatorImp mediatorImp;

    public A(MediatorImp mediatorImp) {
        this.mediatorImp = mediatorImp;
    }

    public void action(){
        mediatorImp.a2b();
    }

    public void whos(){
        System.out.println("I'm A");
    }

}
