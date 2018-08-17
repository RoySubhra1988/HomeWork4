package encaps;

public class TestStudents {

	public static void main(String[] args) {
		Students Std = new Students();
		Std.setStName("John Butler");
		Std.setStID(101);
		Std.setStAge(22);
		
		System.out.println(Std.getStName());
		System.out.println(Std.getStID());
		System.out.println(Std.getStAge());

	}

}
