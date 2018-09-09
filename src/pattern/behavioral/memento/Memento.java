package pattern.behavioral.memento;

/**
 * Created by sharp on 2018/9/8.
 *
 * 备忘录，用来备份发起者类中的信息
 */
public class Memento {

    private String state1 = "";
    private String state2 = "";

    public Memento(String state1, String state2) {
        this.state1 = state1;
        this.state2 = state2;
    }

    public String getState1() {
        return state1;
    }

    public String getState2() {
        return state2;
    }

}
