package pattern.structual.proxy.dynamicproxy;

import java.util.List;

public class ServiceImpl implements Service,Mapper{

    @Override
    public String getName(int age) {
        System.out.println("exec ServiceImpl.getName...");
        return "neo";
    }

    @Override
    public void insertName(String name) {
        System.out.println("exec ServiceImpl.insertName...");
    }

    @Override
    public void insertBatch(String name) {
        System.out.println("exec ServiceImpl.insertBatch...");
    }

    @Override
    public void updateBatch(List<String> nameList) {
        System.out.println("exec ServiceImpl.updateBatch...");
    }
}
