package strategy;

public class CreditCardStrategy implements PaymentStrategy {

	
	private String name, cardNumber, cvv, dateOfExpiry;
	
	
	
	
	
	
	public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}






	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub

		System.out.println(amount + "Paid with CreditCard");
	}

}
