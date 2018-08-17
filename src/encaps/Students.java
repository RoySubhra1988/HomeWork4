package encaps;

public class Students {
	
	private String StName ;
	private int stID ;
	private int stAge;
	
	public void PrintName() {
		System.out.println(StName);
		
	}

	public String getStName() {
		return StName;
	}

	public void setStName(String stName) {
		StName = stName;
	}

	public int getStID() {
		return stID;
	}

	public void setStID(int stID) {
		this.stID = stID;
	}

	public int getStAge() {
		return stAge;
	}

	public void setStAge(int stAge) {
		this.stAge = stAge;
	}
	
	
	
	

}
