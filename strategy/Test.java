package strategy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShoppingCart cart = new ShoppingCart();
		
		Item i1 = new Item("1111", 100);
		Item i2 = new Item("1311", 150);
		Item i3 = new Item("112211", 400);
		Item i4 = new Item("1511", 120);
		
		
		cart.addItem(i1);

		cart.addItem(i2);

		cart.addItem(i3);
		cart.addItem(i4);
		
		
		cart.pay(new PayPalStrategy("vishymails@gmail.com", "password"));
		

		cart.pay(new CreditCardStrategy("bvr", "191929292929229", "888", "02/29"));
	}

}
