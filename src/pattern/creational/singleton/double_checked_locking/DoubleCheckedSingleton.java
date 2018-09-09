package pattern.creational.singleton.double_checked_locking;

/**
 * Created by sharp on 2018/9/9.
 */
public final class DoubleCheckedSingleton {

    private volatile static DoubleCheckedSingleton singleton;

    private DoubleCheckedSingleton(){}

    public static DoubleCheckedSingleton getInstance(){

        if (singleton == null){// 1
            synchronized (DoubleCheckedSingleton.class){// 2
                if (singleton == null){// 3
                    singleton = new DoubleCheckedSingleton();
                }
            }
        }
        return singleton;

    }

    public void print(){
        System.out.println("Thread = " + Thread.currentThread().getName() + " [" + singleton + "]");
    }

}
