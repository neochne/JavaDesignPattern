package pattern.behavioral.chain_of_responsibility;

/**
 * Created by sharp on 2018/9/8.
 */
public class CRespon implements Responsible{
    @Override
    public void doSth(int node, Responsible responsible) {
        if (3 == node) {
            System.out.println("C disposed");
            return;
        }

        responsible.doSth(node,responsible);
    }
}
