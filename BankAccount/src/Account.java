
public class Account {
	private int accoutNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public Account() {
		this(12345, 2.50, "Default name", "Default email", "Default phone");
		System.out.println("Empty constructor called");
	}
	
	public Account(int accoutNumber, double balance, String customerName,
			String email, String phoneNumber ) {
		System.out.println("Account constructor with parameter called: ");
		this.accoutNumber = accoutNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public void depositFund(double depositFund) {
		this.balance += depositFund;
		System.out.println("Your have added $" + this.balance  + " to your account.");
	}
	
	public void withdrawFund(double withdrawFund) {
		if(this.balance - withdrawFund > 0) {
		this.balance -= withdrawFund;
		System.out.println("Your balance is now  $" + this.balance  + ".");
		} else {
			System.out.println("You balance $" + this.balance + " "
					+ "is insufficient. Please deposit cash in your account..");
		}
	}
	
	public int getAccoutNumber() {
		return accoutNumber;
	}
	public void setAccoutNumber(int accoutNumber) {
		this.accoutNumber = accoutNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
