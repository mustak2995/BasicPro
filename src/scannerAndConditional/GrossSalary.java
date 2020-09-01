package scannerAndConditional;
/*
 3. Write a program to input basic salary of an employee and calculate its Gross salary according to following: 
Basic Salary <= 10000: HRA = 20%,DA =80% 
Basic Salary <= 20000 : HRA = 25%, DA=90% 
Basic Salary > 20000 : HRA = 30%, DA =95% 

 */


	import java.util.Scanner;

	public class GrossSalary {
		public static void main(String[] args) {
			
			GrossSalary d=new GrossSalary();
			d.salaryInput();
		}

		public void salaryInput() 
		{
			double gross_salary,incomeTax, providentFund, ProfessionalTax;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the gross salary of Employee : ");
			gross_salary=sc.nextDouble();
			System.out.println("Enter the income tax of Employee : ");
			incomeTax=sc.nextDouble();
			System.out.println("Enter the provident fund of Employee : ");
			providentFund=sc.nextDouble();
			System.out.println("Enter the professional tax of Employee : ");
			ProfessionalTax=sc.nextDouble();
			System.out.println("Enter the how many year employee is service in company :");
			double emp=sc.nextDouble();			
			calculation( gross_salary,incomeTax, providentFund, ProfessionalTax,emp);
		}
		
		public void calculation(double gross_salary, double incomeTax,double providentFund, double ProfessionalTax, double emp)

		{
			double result,netsalary;
		    double salary=gross_salary-(incomeTax+providentFund+ProfessionalTax);
		    //System.out.println(netSalary);
		    if(emp>=5)
		    {
		    	 result=(salary*35)/100;
		    	 netsalary=result+salary;
		    	 System.out.println("The netsalary is : "+netsalary);
		    }
		    else
		    {
		    	result=(salary*15)/100;
		    	netsalary=result+salary;
		    	System.out.println("The netsalary is : "+netsalary);
		
		    }
		}
		
	}
