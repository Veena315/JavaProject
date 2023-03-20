package test;

public class NumbersExample {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		
		//int z = addition(i,j);
		int z = substraction(i,j);
		
		System.out.println("Addition of i and j is: "+z);
	
	}
	
	public static int addition(int a, int b) {
		return a+b;
	}
	
	public static int substraction(int a, int b) {
		return a-b;
	}

}
