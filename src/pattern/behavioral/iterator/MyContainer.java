package pattern.behavioral.iterator;

/**
 * Created by sharp on 2018/9/8.
 */
public interface MyContainer {

    void add(Object object);
    void delete(Object object);
    MyIterator iterate();

}
