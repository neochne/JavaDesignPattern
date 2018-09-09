package pattern.behavioral.template_method;

/**
 * Created by sharp on 2018/9/8.
 */
public class ATemplate extends AbsTemplate{

    @Override
    public void doSth1() {
        System.out.println("ATemplate doSth1");
    }

    @Override
    public void doSth2() {

        System.out.println("ATemplate doSth2");
    }

    @Override
    public void doSth3() {
        System.out.println("ATemplate doSth3");
    }

}
