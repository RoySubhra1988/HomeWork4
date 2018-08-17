package Inheritance2;

public class TestFamily {

	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		gf.Age();
		gf.Job();
		gf.City();
		gf.School();
		
		Son so = new Son();
		so.City();
		so.School();

	}

}
