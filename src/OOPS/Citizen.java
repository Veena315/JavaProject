package OOPS;

public class Citizen extends Person {
	
	public int SSN;
	
	public Citizen() {
		
		super();
		
		System.out.println("Citizen Default Constructor");
	}
	
	public Citizen(String Name, int age, String CountryName,int SSN ) {
		
		super();

		System.out.println("Citizen Parameterized Constructor");
		
		this.Name = Name;
		this.age = age;
		this.CountryName = CountryName;
		this.SSN = SSN;
		
		System.out.println(Name+ " has an age "+age+ " in the country "+CountryName+ " with SSN "+SSN);
	}
	
	public void Print() {
		System.out.println("SSN is "+SSN);
	}
}
