package test;

import java.util.Scanner;

public class ConditionsEample {

	public static void main(String[] args) {

		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age");
		
		age = sc.nextInt();
		
		if (age < 17) {
			System.out.println("You are not eligible for Voting");
		} else if (age == 17) {
			System.out.println("You are eligible for Voting in next year");
		} else {
			System.out.println("You are eligible for Voting");
		}
		sc.close();
	}
}
