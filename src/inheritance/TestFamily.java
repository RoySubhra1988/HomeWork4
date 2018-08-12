package inheritance;

public class TestFamily {

	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		gf.methodA();
		gf.methodB();
		gf.methodC();
		gf.methodD();
		
		
		Father ft = new Father();
		ft.methodB();
		ft.methodC();
		ft.methodD();
	}

}
