package pattern.creational.factory.factory_method;

import pattern.creational.factory.simple_factory.HTC;
import pattern.creational.factory.simple_factory.Phone;

/**
 * Created by sharp on 2018/8/23.
 */
public class HTCFactory implements Factory{

    @Override
    public Phone createPhone() {
        return new HTC();
    }

}
