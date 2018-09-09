package pattern.behavioral.command;

/**
 * Created by sharp on 2018/9/8.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }

}
