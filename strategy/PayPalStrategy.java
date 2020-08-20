package strategy;

public class PayPalStrategy implements PaymentStrategy {

	
	
	private String emailId;
	private String password;
	
	
	public PayPalStrategy(String emailId, String password) {
		//super();
		this.emailId = emailId;
		this.password = password;
	}


	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid by PayPal");
	}

}
