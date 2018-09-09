package pattern.creational.singleton.eager;

/**
 * Created by sharp on 2018/9/9.
 */
public final class EagerSingleton {

    private final static EagerSingleton SINGLETON = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return SINGLETON;
    }

    public void print(){
        System.out.println("Thread = " + Thread.currentThread().getName() + " [" + SINGLETON + "]");
    }

}
