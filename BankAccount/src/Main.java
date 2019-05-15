
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ABaccount = new Account(785961245, 0.00, "ABen Lol", 
				"aben@gmail.com", "561-203-3932");
		
	/*	ABaccount.setAccoutNumber(785961245);
		ABaccount.setBalance(0.00);
		ABaccount.setCustomerName("ABen");
		ABaccount.setEmail("aben@gmail.com");
		ABaccount.setPhoneNumber("561-203-3932"); */
		
		System.out.println("Your account number is " + ABaccount.getAccoutNumber());
		System.out.println("Your name is " + ABaccount.getCustomerName());
		System.out.println("Your email is " + ABaccount.getEmail());
		System.out.println("Your phone number is " + ABaccount.getPhoneNumber());
		
        ABaccount.withdrawFund(100.0);
        
        ABaccount.depositFund(50.00);
        ABaccount.withdrawFund(100.00);
        
        ABaccount.depositFund(51.00);
        ABaccount.withdrawFund(100.00);
	}

}
