package cam.qa.main;

public class TaxCalculator 
{
	
	public String showUserName(String userName) 
	{
		return userName;
	}
	
	public void usersYearlyMonthlyAndDailySalary(double userSalary)
	{
		System.out.println("Yor yearly salary is: " + userSalary);
		System.out.println("Your monthly salary is: " + userSalary / 12);
		System.out.println("Your daily Salary is: " + userSalary / 365);
		
	}
	
	public double showUsersTax(double userSalary)
	{
		if (userSalary < 21000)
		{
			return userSalary * 0.1;
		}
		else if (userSalary >= 21000 && userSalary <= 32500)
		{
			return userSalary * 0.2;
		}
		else
		{
			return userSalary * 0.4;
		}
	}

}
