package iterations;

import java.util.Scanner;

//WAP to calculate and print the power of a number i.e a2 = a*a
public class PowerDemo {

	public static void main(String[] args) {
		      
		Scanner sc = new Scanner(System.in);

		 int number,power,result=1,i;
		 
		 System.out.println("Enter the number:  ");
		 number = sc.nextInt();
		 
		 System.out.println("Enter the power: ");
		 power = sc.nextInt();
		 
		 
    for(i=1; i<=power ; i++)
		 {
			 result = result*number;
		 }
		 
		 System.out.println("The result is: "+result);
	}

}
