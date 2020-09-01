package scannerAndConditional;

import java.util.Scanner;

public class UserDemo {

	public static void main(String[] args) {
		//Classname ObjectName = new ClassName();
		
		Scanner sc = new Scanner(System.in);
		int number1,number2,result;
		
		System.out.println("Enter the value of number1: ");
		number1 = sc.nextInt();
		
		System.out.println("ENter the value of number2: ");
		number2 = sc.nextInt();
		
		result = number1+number2;
		
		System.out.println("The sum of given two numbers is : "+result);
		 
		
	}

}
