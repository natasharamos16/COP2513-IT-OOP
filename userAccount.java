//A program created to show withdraw and deposit balances of customer's Account
//Created by Natasha Ramos-Gomez
//COP2513 Professor Ciampaglia
//2/1/2019

public class userAccount {
	public static void main(String[] args) {
		//Initailizing customer's account with customer's name, balance and Account ID
		Account customerAccount = new Account("George", 1122, 1000); 
		
		//Setting up the Annual Interest Rate for customer's account
		Account.setAnnualInterestRate(1.5);
		
		//Customer's Deposits being put into the account
		customerAccount.deposit(30);
		customerAccount.deposit(40);
		customerAccount.deposit(50);
		
		//Customer's withdrawals from their account
		customerAccount.withdraw(5);
		customerAccount.withdraw(4);
		customerAccount.withdraw(2);
		
		//Displaying Customer's Account Info with Name
		System.out.println("Customer's Account Summary"); 
		System.out.println("...........................");
		System.out.println("Account Name: " + customerAccount.mName);
		
		//Displaying the Interest Rate
		System.out.println("Interest Rate Charged to Account:" + Account.AnnualInterestRate);
		
		//Displaying Transactions
		System.out.println("List of Transactions");
		System.out.println("....................");
		//For Loop being used to display all tranactions positive and negative credits
		for (int i = 0; i < customerAccount.getTransaction().size(); i++)
		{
			System.out.println("Date:"+ (customerAccount.getTransaction()).get(i).getDate());
			System.out.println("Type:" +(customerAccount.getTransaction()).get(i).getType());
			System.out.println("Amount:" + (customerAccount.getTransaction()).get(i).getAmount());
			System.out.println("Description:" + (customerAccount.getTransaction()).get(i).getDescription());
		
		}
		//Displaying final present balance of account
		System.out.println("................");
		System.out.println("Present Balance");
		System.out.println(customerAccount.getBalance());
	
	}
}