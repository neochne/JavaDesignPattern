package pattern.structual.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式的核心在于享元工厂类，享元工厂类的作用在于提供一个用于存储享元对象的享元池，用户需要对象时，
 * 首先从享元池中获取，如果享元池中不存在，则创建一个新的享元对象返回给用户，并在享元池中保存该新增对象。
 */
public class AndroidPhoneFactory {
	private static Map<String, Phone> phones = new HashMap<String, Phone>();
	public static Phone getPhoneByBrand(String brand){
		Phone phone = phones.get(brand);
		if (phone == null) {
			phone = new AndroidPhone(brand);
			phones.put(brand, phone);
		}
		return phone;
	}
}
