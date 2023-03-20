package test;

public class ForLoopExample {

	public static void main(String[] args) {

		for (int num = 1; num <= 10; num++) {
			System.out.println(num);
		}

		System.out.println("End of for loop");

		for (int num = 10; num >= 1; num -= 2) {
			System.out.println(num);
		}

		System.out.println("End of second for loop");

		System.out.println("Table 2");

		int num1 = 2;

		for (int i = 1; i <= 10; i++) {
			System.out.println(num1 * i);
		}
		System.out.println("End of table 2");

		int[] arr1 = { 2, 3, 4, 8, 9 };

		for (int i = 0; i < arr1.length; i++) {

			System.out.println("Element value is " + arr1[i]);

		}

		// for each loop
		for (int val : arr1) {
			System.out.println("Value is " + val);
		}

		String str1 = "Shiva";

		for (int i = 0; i < str1.length(); i++) {

			System.out.println("Char value is " + str1.charAt(i));
		}

	}

}
