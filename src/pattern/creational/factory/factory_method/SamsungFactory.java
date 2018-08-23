package pattern.creational.factory.factory_method;

import pattern.creational.factory.simple_factory.Phone;
import pattern.creational.factory.simple_factory.Samsung;

/**
 * Created by sharp on 2018/8/23.
 */
public class SamsungFactory implements Factory{

    @Override
    public Phone createPhone() {
        return new Samsung();
    }

}
