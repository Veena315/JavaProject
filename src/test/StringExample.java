package test;

public class StringExample {

	public static void main(String[] args) {
		
		String name = "Shiva";
		String name1 = "Navi is from wnp";
		
		System.out.println("Number of chars in first string is "+name1.length());

		System.out.println("The 4th char in the string is "+name.charAt(3));
		
		System.out.println("The last char in the string is "+name1.charAt(name1.length()-1));
		
		System.out.println("The string in the upeer case is "+name1.toUpperCase());
		
		System.out.println("The string in the lower case is "+name1.toLowerCase());
	}

}
