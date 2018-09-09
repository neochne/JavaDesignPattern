package pattern.behavioral.template_method;

/**
 * Created by sharp on 2018/9/8.
 */
public abstract class AbsTemplate {

    public void action(){
        doSth1();
        doSth2();
        doSth3();
    }

    public abstract void doSth1();
    public abstract void doSth2();
    public abstract void doSth3();

}
