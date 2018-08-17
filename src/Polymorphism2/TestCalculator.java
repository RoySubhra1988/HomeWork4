package Polymorphism2;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator calArea = new Calculator();
		System.out.println(calArea.CalcArea(3, 9));
		System.out.println(calArea.CalcArea(8, 6, 5));
		System.out.println(calArea.CalcArea(5,6, 6, 8));
		System.out.println(calArea.CalcArea(5.2, 3, 4, 5));
		
		
		ModernCalculator mc = new ModernCalculator();
	System.out.println(mc.CalcArea(5.2, 3, 4, 5));
	System.out.println(mc.CalcArea(10, 32, 7, 8));
	System.out.println(mc.CalcArea(10, 32));	

	}

}
