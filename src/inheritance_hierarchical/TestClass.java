package inheritance_hierarchical;

public class TestClass {

	public static void main(String[] args) {
		ClassD cd = new ClassD();
		cd.methodA();
		cd.methodB();
		cd.methodC();
		

		ClassC cc = new ClassC();
		cc.methodA();
		cc.methodB();
		cc.methodC();
	
	
		
		ClassB cb = new ClassB();
		cb.methodA();
		cb.methodB();
		cb.methodC();
		

	}

}
