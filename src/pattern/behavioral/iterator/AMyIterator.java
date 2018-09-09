package pattern.behavioral.iterator;

/**
 * Created by sharp on 2018/9/8.
 */
public class AMyIterator implements MyIterator{

    int i;
    private AMyContainer myContainer;

    public AMyIterator(MyContainer myContainer) {
        this.myContainer = (AMyContainer) myContainer;
    }

    @Override
    public Object next() {
        return myContainer.getDatas()[i++];
    }

}
