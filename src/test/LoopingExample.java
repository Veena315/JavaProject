package test;

public class LoopingExample {

	public static void main(String[] args) {
		
		//print 1 to 10 using while loop
		
		int num = 1;
		
		//System.out.println(++num);
		//System.out.println(num++);
		
		while(num<=10) {
		
		System.out.println(num);
		//num = num+1;
		num++;
		
		}
		
		System.out.println("End of first While loop");
		
		//print 10 to 1 using while loop
		
		int num1 = 10;
		
		while(num1>=1) {
			
			System.out.println(num1);
			
			num1--;
		}
			
		System.out.println("End of second while loop");
	
		int num2 = 10;
		while(num2>=1) {
			if(num2==5) {
				System.out.println("Skip");
				num2--;
				continue;
			}
			
			System.out.println(num2);
			num2--;
			
		}
		
		int num3 = 10;
		while(num3>=1) {
			if(num3==5) {
				System.out.println("Stop");
				num3--;
				break;
			}
			
			/* System.out.println(num3);
			num3--;
			*/
		}
		
		
	}

}
