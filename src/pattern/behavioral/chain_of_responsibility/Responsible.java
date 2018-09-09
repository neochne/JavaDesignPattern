package pattern.behavioral.chain_of_responsibility;

/**
 * Created by sharp on 2018/9/8.
 */
public interface Responsible {

    public abstract void doSth(int node,Responsible responsible);

}
