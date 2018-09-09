package pattern.behavioral.mediator;

/**
 * Created by sharp on 2018/9/8.
 */
public class B {


    private MediatorImp mediatorImp;

    public B(MediatorImp mediatorImp) {
        this.mediatorImp = mediatorImp;
    }

    public void action(){
        mediatorImp.b2a();
    }

    public void who(){
        System.out.println("I'm B");
    }

}
