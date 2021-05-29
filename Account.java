import java.util.ArrayList;

class Account {
  protected String mName;
  private int id;
  private double balance;
  private static double annualInterestRate;
  private java.util.Date dateCreated;
  public static double AnnualInterestRate = 1.5;
  private ArrayList<Transaction> bills;

  public Account() {
    dateCreated = new java.util.Date();
    bills = new ArrayList<Transaction>();
  }

  public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    dateCreated = new java.util.Date();
    bills = new ArrayList<Transaction>();
  }
  public Account(String name, int id, double balance) {
      this(id, balance);
      mName = name;
  }
  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return balance;
  }

  public static double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setId(int newId) {
    id = newId;
  }

  public void setBalance(double newBalance) {
    balance = newBalance;
  }

  public static void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
  }

  public double getMonthlyInterest() {
    return balance * (annualInterestRate / 1200);
  }

  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  public void withdraw(double amount) {
    balance -= amount;
    bills.add(new Transaction('-',  amount, balance, "Withdrawn from Account" ));
  }
  public void deposit(double amount) {
	balance += amount;
	bills.add(new Transaction('+', amount, balance, "Deposit to Account"));
	  
  }
  public ArrayList<Transaction> getTransaction(){
	  return bills;
  }


}
