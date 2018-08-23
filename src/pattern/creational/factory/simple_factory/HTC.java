package pattern.creational.factory.simple_factory;

/**
 * Created by sharp on 2018/8/23.
 */
public class HTC implements Phone{
    @Override
    public void call() {
        System.out.println("用HTC手机打电话");
    }
}
