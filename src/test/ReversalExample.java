package test;

public class ReversalExample {

	public static void main(String[] args) {
		
		String str1 = "Hello World";
		
		String result = "";
		
		for(int i=str1.length()-1;i>=0;i--) {
			
			result = result + str1.charAt(i);
			
		}
		
		System.out.println("Reversed string is "+result);
	}

}
