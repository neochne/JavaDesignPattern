package pattern.behavioral.iterator;

/**
 * Created by sharp on 2018/9/8.
 */
public class BMyContainer implements MyContainer {

    int i;
    private Object[]datas = new Object[10];

    @Override
    public void add(Object object) {
        datas[i] = object;
    }

    @Override
    public void delete(Object object) {
        for (int i=0;i < datas.length;i++){
            Object obj = datas[i];
            if (object == obj){
                datas[i] = datas[i + 1];
            }
        }
    }

    public Object[] getDatas() {
        return datas;
    }

    @Override
    public MyIterator iterate() {
        return new BMyIterator(this);
    }

}
