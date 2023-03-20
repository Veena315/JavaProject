package OOPS;

public class Insurance extends Citizen {

	public int InsuranceID;

	public Insurance() {
		
		super();
		System.out.println("Default Insurance Constructor");
	}

	public void print() {
		
		super.Print();

		System.out.println("Insurance Id is " + InsuranceID);
	}
	
	public void Print(String message) {
		
		System.out.println("Typing some message "+message);
	}
}
