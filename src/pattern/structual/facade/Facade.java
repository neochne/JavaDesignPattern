package pattern.structual.facade;

/**
 * 外观（门面）模式
 *
 */
public class Facade {
	private Sys1 s1 = new Sys1();
	private Sys2 s2 = new Sys2();
	
	public void operation(){
		s1.operation();
		s2.operation();
	}
}
