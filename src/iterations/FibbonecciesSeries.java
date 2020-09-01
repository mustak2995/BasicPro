package iterations;

import java.util.Scanner;

public class FibbonecciesSeries {

	public static void main(String[] args) {
		System.out.println("Enter a number upto which you want to display series.");
		Scanner sc=new Scanner(System.in);
		int userName=sc.nextInt();
		int first=0;
		int second=1;
		System.out.print(" "+first+" "+second);
		
		for(int i=0;i<userName-2;i++)
		{
			int tno=first+second;
			first=second;
			second=tno;
			System.out.print(" "+tno);
		}
	}

}
