package OOPS;

public class RunnerClass {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.Name = "Navi";
		emp1.EmpId = 1000;
		
		Employee emp2 = new Employee();
		emp2.Name = "Shiva";
		emp2.EmpId = 1001;
		
		Employee emp3 = new Employee("Naveena",1003);
		
		emp1.DisplayName();
		emp2.DisplayName();
		emp3.DisplayName();
		
		Employee.DisplaySalary();
		
		Citizen ct = new Citizen();
		ct.age = 27;
		ct.Name = "Naveena";
		ct.SSN = 12345;
		ct.CountryName = "String";
		ct.Print();
		
		Citizen ct1 = new Citizen("Shiva", 31,"India",78910);
		ct1.Print();
		
		Insurance I1 = new Insurance();
		I1.InsuranceID= 20;
		I1.SSN = 1234;
		I1.print();
		I1.Print("Insurance class message");
		
		SBIBank sbi = new SBIBank();
		sbi.print();
		

		EncapsulationExample emp = new EncapsulationExample();
		emp.setSalary(5000);
		System.out.println("The salary is " + emp.getSalary());
	}

}
