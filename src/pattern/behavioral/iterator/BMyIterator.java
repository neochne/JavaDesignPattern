package pattern.behavioral.iterator;

/**
 * Created by sharp on 2018/9/8.
 */
public class BMyIterator implements MyIterator{

    int lenth;
    private BMyContainer myContainer;

    public BMyIterator(MyContainer myContainer) {
        this.myContainer = (BMyContainer) myContainer;
        lenth = this.myContainer.getDatas().length;
    }

    @Override
    public Object next() {
        return myContainer.getDatas()[lenth-1];
    }
}
