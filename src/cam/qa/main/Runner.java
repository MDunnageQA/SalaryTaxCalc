package cam.qa.main;

public class Runner 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String userName = "Bob McBobberton";
		double userYearlySalary = 25000;
		TaxCalculator user = new TaxCalculator();
		
		System.out.println(user.showUserName(userName));
		user.usersYearlyMonthlyAndDailySalary(userYearlySalary);
		System.out.println("The amount of tax you pay is: " + user.showUsersTax(userYearlySalary));

	}

}
