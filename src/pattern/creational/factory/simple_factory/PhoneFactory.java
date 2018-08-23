package pattern.creational.factory.simple_factory;

/**
 * Created by sharp on 2018/8/23.
 */
public class PhoneFactory {

    public static Phone createPhone(String name) {

        switch (name) {
            case "Samsung":
                return new Samsung();
            case "HTC":
                return new HTC();
            default:
                return null;
        }

    }
}
