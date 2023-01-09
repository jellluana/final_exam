public class Main
{
	public static void main(String[] args)
	{
		Customer customer;
		RegularCustomer regCustomer = new
		RegularCustomer("Mack", 1000);
		
		SeniorCustomer senCustomer = new
		SeniorCustomer ("Jhone", 2000);
		
		customer = regCustomer;
		System.out.println(regCustomer.name + " is a regular customer who has a total bill of " + regCustomer.calculateBill());
		
		customer = senCustomer;
		System.out.println(senCustomer.name + " is a senior customer who has a total bill of " + senCustomer.calculateBill());
	}
}
