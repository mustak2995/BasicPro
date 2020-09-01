package basicPrograms;

public class SimpleInter {

	public static void main(String[] args) {
		int pri=10000,rate=10,time=12 ,amt;
		amt=(pri*rate*time)/100;
		System.out.println("principal amount is = "+pri);
		System.out.println("Rate of interest  is = "+rate+"%");
		System.out.println("time period  is = "+time+"year");
		System.out.println("Simple interest is = "+amt);
	}

}
