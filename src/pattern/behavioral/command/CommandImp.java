package pattern.behavioral.command;

/**
 * Created by sharp on 2018/9/8.
 */
public class CommandImp implements Command{

    CommandReceiver commandReceiver;

    public CommandImp(CommandReceiver commandReceiver) {
        this.commandReceiver = commandReceiver;
    }

    @Override
    public void execute() {
        commandReceiver.doSth();
    }
}
