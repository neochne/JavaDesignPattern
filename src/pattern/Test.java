package pattern;

import pattern.creational.factory.abs_factory.FuShiKangFactory;
import pattern.creational.factory.factory_method.SamsungFactory;
import pattern.creational.factory.simple_factory.PhoneFactory;

/**
 * Created by sharp on 2018/8/23.
 */
public class Test {

    public static void main(String[] args) {

        new FuShiKangFactory().createPhone().call();
        new FuShiKangFactory().createCPU().cpuInfo();

    }
}
