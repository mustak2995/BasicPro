package scannerAndConditional;

import java.util.Scanner;

public class ControlDemo {
//WAP to find if the number is even or odd

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number of your choice: ");
		int number;
		
		number  = scanner.nextInt();
		
		if(number % 2 == 0)
		{
			System.out.println(number+" is even number");
		}
		else
		{
			System.out.println(number+" is odd number");
		}
		

		

	}

}
