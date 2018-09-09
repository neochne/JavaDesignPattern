package pattern.behavioral.observer;

import java.util.Observable;

public class MyObservable extends Observable{
	public MyObservable() {
		setChanged();
	}
}
