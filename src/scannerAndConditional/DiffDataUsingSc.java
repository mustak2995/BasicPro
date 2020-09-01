package scannerAndConditional;

import java.util.Scanner;
//How to accept different types of data using Scanner class. 
public class DiffDataUsingSc {

public static void main(String[] args) {
		
		// to display different types of data:
     	
		Scanner sc=new Scanner(System.in);
		
		 int number = sc.nextInt();
		 float number1 = sc.nextFloat();
		 Double number3 = sc.nextDouble();
		 String alphabet1 = sc.next();
		
		
	
		
		System.out.println("The value of integer number is : "+number);
		System.out.println("The value of floating number1 is : "+number1);
		System.out.println("The value of double number is : "+number3);
		System.out.println("the value of character alphabet1 is : "+alphabet1);
		
		
		
	}

}
