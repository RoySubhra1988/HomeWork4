package Polymorphism2;

public class ModernCalculator extends Calculator {
	@Override
	public int CalcArea(int a, int b, int c, int d) {

		int total = (a + b + c + d)- 5;
		return total;

	}
	@Override
	public double CalcArea(double a, int b, int c, int d) {

		double total = (a + b + c + d) - .2;
		return total;
}
	@Override
	public int CalcArea(int a, int b) {
		int total = a+b +5;
		return total;
	}

		
}