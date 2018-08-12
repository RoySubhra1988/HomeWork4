package Polymorphism;

public class TestOverLoad extends TestOverRide {

	public static void main(String[] args) {
	
		Overloading price = new Overloading();
		price.price(20, 30);
		price.price(10, 15, 20);
		price.price( 10, 20, "iPhone");
		
		TestOverRide or = new TestOverRide();
		or.price(10, 15, 20);
	}

}
