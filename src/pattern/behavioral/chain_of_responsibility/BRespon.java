package pattern.behavioral.chain_of_responsibility;

import com.sun.org.apache.bcel.internal.generic.IREM;

/**
 * Created by sharp on 2018/9/8.
 */
public class BRespon implements Responsible{
    @Override
    public void doSth(int node, Responsible responsible) {

        if (2 == node) {
            System.out.println("B disposed");
            return;
        }

        responsible.doSth(node,responsible);

    }
}
