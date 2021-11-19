package pattern.creational.singleton.enum_single;

/**
 * Created by sharp on 2018/9/9.
 */
public enum  EnumSingleton {
    SIGLETON;
    public void print(){
        System.out.println("Thread = " + Thread.currentThread().getName() + " [" + (SIGLETON) + "]");
    }
}