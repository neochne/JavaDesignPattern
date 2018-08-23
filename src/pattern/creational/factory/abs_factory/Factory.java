package pattern.creational.factory.abs_factory;

import pattern.creational.factory.simple_factory.Phone;

/**
 * Created by sharp on 2018/8/23.
 */
public interface Factory {

    Phone createPhone();
    CPU createCPU();
}
