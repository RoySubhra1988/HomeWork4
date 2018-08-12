package Polymorphism;

public class Overloading {
	
	public void price(int a, int b) {
		
		int total = a + b;
		System.out.println(total);
	}
	
public void price(int a, int b, int c) {
		
		int total = a + b + c;
		System.out.println(total);
		
	}

public void price(int a, int b, String item) {

	int total = a + b;

System.out.println("This is the "+ item + " and the price is " + total);
}



}

