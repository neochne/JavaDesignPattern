package pattern.behavioral.memento;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sharp on 2018/9/8.
 * <p>
 * 发起者
 */
public class Originator {

    private String state1;
    private String state2;

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public Memento createMemoto() {
        return new Memento(state1, state2);
    }

    public void restore(Memento memento) {
        setState1(memento.getState1());
        setState2(memento.getState2());
    }

    @Override
    public String toString() {
        String str = "";
        str = "[" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "]:" + "state1 = " + state1 + " state2 = " + state2;
        return str;
    }

}
