package basicPrograms;

public class DaysToYear {

	public static void main(String[] args) {
		int days=373,week=days/7, year=week/52;
		System.out.println("Given days are = "+days);
		year=days/365;
		days=days%365;
		week=days/7;
		days=days-7;
		System.out.println("Convert days into year and week are...");
		System.out.println("year = "+year);
		System.out.println("week = "+week);
		System.out.println("days = "+days);
	}

}