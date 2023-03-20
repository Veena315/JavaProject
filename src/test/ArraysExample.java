package test;

public class ArraysExample {

	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40,50};
		
		System.out.println("Length of the array is "+arr1.length);
		System.out.println("First value in the array is "+arr1[0]);
		System.out.println("Last value in the array is "+arr1[arr1.length-1]);
		
		//System.out.println("All the values inside arr1 "+arr1);
		
		String[] arr2 = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		
		System.out.println("Value at third position is "+arr2[2]);
		
		String str = "Clean World Green World Happy World";
		
		String[] arr3 = str.split(" ");
		
		System.out.println("Total number of words inside the string is "+arr3.length);

	}

}
