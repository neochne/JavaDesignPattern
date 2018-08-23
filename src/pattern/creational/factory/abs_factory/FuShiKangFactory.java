package pattern.creational.factory.abs_factory;

import pattern.creational.factory.simple_factory.HTC;
import pattern.creational.factory.simple_factory.Phone;

/**
 * Created by sharp on 2018/8/23.
 */
public class FuShiKangFactory implements Factory{
    @Override
    public Phone createPhone() {
        return new HTC();
    }

    @Override
    public CPU createCPU() {
        return new CPU64();
    }
}
