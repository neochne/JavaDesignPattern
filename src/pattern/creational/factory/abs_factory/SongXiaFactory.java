package pattern.creational.factory.abs_factory;

import pattern.creational.factory.simple_factory.Phone;
import pattern.creational.factory.simple_factory.Samsung;

/**
 * Created by sharp on 2018/8/23.
 */
public class SongXiaFactory implements Factory{
    @Override
    public Phone createPhone() {
        return new Samsung();
    }

    @Override
    public CPU createCPU() {
        return new CPU32();
    }
}
