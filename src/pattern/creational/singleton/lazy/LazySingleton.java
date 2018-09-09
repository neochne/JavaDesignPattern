package pattern.creational.singleton.lazy;

/**
 * Created by sharp on 2018/9/9.
 */
public final class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton(){}

    public static LazySingleton getInstance(){

        if (singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;

    }

    public void print(){
        System.out.println("Thread = " + Thread.currentThread().getName() + " [" + singleton + "]");
    }

}
