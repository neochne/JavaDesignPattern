package pattern.behavioral.state;

/**
 * Created by sharp on 2018/9/8.
 */
public class StateManager {

    public IState state;

    public StateManager(IState state) {
        this.state = state;
    }

    public void changeState(int code){

        switch (code){
            case 0:
                state = new StateA();
                break;
            case 1:
                state = new StateB();
                break;

        }

    }

    public void action(){
        this.state.doSth();
    }

}
