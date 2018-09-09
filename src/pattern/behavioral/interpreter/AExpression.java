package pattern.behavioral.interpreter;

/**
 * Created by sharp on 2018/9/8.
 */
public class AExpression implements Expression{
    @Override
    public void interpret(Target target) {
        System.out.println("i in target object is a Integer type");
    }
}
