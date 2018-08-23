package pattern.creational.factory.abs_factory;

/**
 * Created by sharp on 2018/8/23.
 */
public class CPU32 implements CPU{
    @Override
    public void cpuInfo() {
        System.out.println("32位cpu");
    }
}
