package basicPrograms;

public class Swapping {

	public static void main(String[] args) {
		int num1=100,num2=200,temp;
		System.out.println("Given num1 is = "+num1+" , Num2 is="+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping num1 is= "+num1);
		System.out.println("After swapping num2 is= "+num2);
		
		System.out.println("-------------------------------------------------------");
		/* without using third variable*/
				
				int fno=25,sno=5;
				System.out.println("first number is = "+fno);
				System.out.println("second number is = "+sno);
				fno=fno+sno;
				sno=fno-sno;
				fno=fno-sno;
				System.out.println("After swapping...");
				System.out.println("first number is = "+fno);
				System.out.println("second number is = "+sno);

	}

}
