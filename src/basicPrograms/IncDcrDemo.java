package basicPrograms;

public class IncDcrDemo {

	public static void main(String[] args) {
		
	
		int num1 = 800;
		int num2 =65;	
		int result = (num1>num2)? num1:num2;
		
		System.out.println("greater number is : "+result);
		
	// Unary operators demo	
		int num = 7;
		System.out.println("value of num is : "+num);
		
		// decrease the value of num by 1-->
		//    num = num-1
		num--;
		
		System.out.println("num-- : "+num);
		
		num++;
		
		System.out.println("num++ : "+num);
				
	


	
	System.out.println("num : "+num);
	
	System.out.println("post increment: "+(num++));
	
	System.out.println("num by increment : "+num);
	
	System.out.println("pre increment: "+(++num));
}
}