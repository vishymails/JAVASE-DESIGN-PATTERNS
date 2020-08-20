package strategy;

public class Item {

	private String upcCode;
	private int price;
	
	
	public Item(String upcCode, int price) {
		super();
		this.upcCode = upcCode;
		this.price = price;
	}
	
	
	public String getUpcCode() {
		return upcCode;
	}
	public int getPrice() {
		return price;
	}
	
	
}
