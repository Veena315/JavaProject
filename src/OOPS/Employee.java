package OOPS;

public class Employee {
	
	public String Name;
	public int EmpId;
	private static int Salary; //variable with private access modifier is accessible only with in the class
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	public Employee(String var1, int var2) {
		System.out.println("Parameterized Constructor");
		Name = var1;
		EmpId = var2;
	}
	
	
	public void DisplayName() {
		System.out.println("Name of the Employee is "+Name);
	}
	
	public static void DisplaySalary() {
		System.out.println("Employee of the salary is "+Salary);
	}
}
