package pattern.structual.proxy.staticproxy;

public class Test {

    public static void main(String[] args) {
        AbsObj obj = new StaticProxyObj();
		obj.operation();
    }

}
