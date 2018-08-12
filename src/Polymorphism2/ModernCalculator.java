package Polymorphism2;

public class ModernCalculator extends Calculator {
	
@Override
public int CalcArea(int a, int b, int c, int d) {
		
		int total = a+b+c+d-5;
		return total;
		
}
}