package hierarchical;

public class TestClass {

	public static void main(String[] args) {
		ClassB cb = new ClassB();
		cb.methodX();
		cb.method2();

		ClassC cc = new ClassC();
		cc.method3();
		cc.methodA();

		ClassA ca = new ClassA();
		ca.method1();

	}

}
