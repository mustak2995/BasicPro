package classObjectMethods;

//1. we have to create objects of a class
//laptop
//tablet

/*  object creation:
* Rule: 
*      
*      ClassName     objectName   =    new    ClassName();
*      
*      ComputerDemo   LaptopN     =    new     ComputerDemo();
* 
* */


public class ComputerDemo {
	
	// Method
	          public void input()
	          {
	        	  System.out.println("Taking input from user");
	          }
	          
	          public void output()
	          {
	        	  System.out.println("Displaying result");
	          }
	
              public static void main(String[] args) {
	      
            	  System.out.println("hi from mainn");
            	  
            	  ComputerDemo object1 = new ComputerDemo();  
            	  object1.input();
            	  object1.output();
            	  
            	  ComputerDemo object2 = new ComputerDemo();
            	  object2.input();
            	  object2.output();
            	  
            	  ComputerDemo object3 = new ComputerDemo();
            	  object3.input();
            	  object3.output();
//            	  
            	

              }
	

}
