package pattern;

import pattern.behavioral.chain_of_responsibility.ARespon;
import pattern.behavioral.chain_of_responsibility.BRespon;
import pattern.behavioral.chain_of_responsibility.CRespon;
import pattern.behavioral.command.Command;
import pattern.behavioral.command.CommandImp;
import pattern.behavioral.command.CommandReceiver;
import pattern.behavioral.command.Invoker;
import pattern.behavioral.interpreter.AExpression;
import pattern.behavioral.interpreter.BExpression;
import pattern.behavioral.interpreter.Expression;
import pattern.behavioral.interpreter.Target;
import pattern.behavioral.iterator.AMyContainer;
import pattern.behavioral.iterator.BMyContainer;
import pattern.behavioral.iterator.MyContainer;
import pattern.behavioral.mediator.A;
import pattern.behavioral.mediator.B;
import pattern.behavioral.mediator.MediatorImp;
import pattern.behavioral.memento.Caretaker;
import pattern.behavioral.memento.Originator;
import pattern.behavioral.observer.Button;
import pattern.behavioral.observer.MyObservable;
import pattern.behavioral.observer.OnClickListener;
import pattern.behavioral.state.IState;
import pattern.behavioral.state.StateA;
import pattern.behavioral.state.StateB;
import pattern.behavioral.state.StateManager;
import pattern.behavioral.strategy.FrescoImageLoader;
import pattern.behavioral.strategy.GlideImageLoader;
import pattern.behavioral.strategy.ImageLoaderContext;
import pattern.behavioral.template_method.ATemplate;
import pattern.behavioral.template_method.AbsTemplate;
import pattern.behavioral.visitor.*;
import pattern.creational.factory.abs_factory.FuShiKangFactory;
import pattern.creational.factory.factory_method.SamsungFactory;
import pattern.creational.factory.simple_factory.PhoneFactory;
import pattern.creational.singleton.double_checked_locking.DoubleCheckedSingleton;
import pattern.creational.singleton.eager.EagerSingleton;
import pattern.creational.singleton.enum_single.EnumSingleton;
import pattern.creational.singleton.lazy.LazySingleton;
import pattern.creational.singleton.static_inner_class.StaticInnerClassSingleton;
import pattern.structual.composite.Developer;
import pattern.structual.composite.Leader;
import pattern.structual.composite.Productor;
import pattern.structual.composite.Worker;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/**
 * Created by sharp on 2018/8/23.
 */
public class Test {

    public static void main(String[] args) {


    }
}

