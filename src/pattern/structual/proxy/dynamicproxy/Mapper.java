package pattern.structual.proxy.dynamicproxy;

import java.util.List;

public interface Mapper {

	void insertBatch(String name);

	void updateBatch(List<String> nameList);
	
}
