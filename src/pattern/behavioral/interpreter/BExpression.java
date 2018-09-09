package pattern.behavioral.interpreter;

/**
 * Created by sharp on 2018/9/8.
 */
public class BExpression implements Expression{
    @Override
    public void interpret(Target target) {
        System.out.println("i's value is " + target.i);
    }
}
