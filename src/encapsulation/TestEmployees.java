package encapsulation;

public class TestEmployees {

	public static void main(String[] args) {
		Employees Emp1 = new Employees();
		Emp1.setEmpName("Masud , Rana");
		Emp1.setEmpID(101);
		Emp1.setEmpDOB("12/09/1987");
		Emp1.setEmpSalary(76000);
		
		System.out.println(Emp1.getEmpName()+ " "+ Emp1.getEmpID()+ " " + Emp1.getEmpDOB() + " " + Emp1.getEmpSalary());
	
		Employees Emp2 = new Employees();
		Emp2.setEmpName("Alif , Laila");
		Emp2.setEmpID(121);
		Emp2.setEmpDOB("09/12/1990");
		Emp2.setEmpSalary(86000);
		
		System.out.println(Emp2.getEmpName()+ " "+ Emp2.getEmpID()+ " " + Emp2.getEmpDOB() + " " + Emp2.getEmpSalary());
	
	
	}

}
