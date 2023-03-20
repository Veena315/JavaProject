package test;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		int num;
		
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		num = sc.nextInt();
		
		
		boolean flag = true;
		
		for(int i=2;i<=num/2;i++) {
			
			int rem = num%i;
			
			if(rem==0) {
				
				flag = false;
				
				break;
			}
		
		}
			
			if(flag == true) {
				
				System.out.println("Num is Prime Number");
			}
			else {
				System.out.println("Num is not Prime Number");
			}
		

	}

}
