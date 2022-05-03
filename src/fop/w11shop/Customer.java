package fop.w11shop;

public class Customer extends Thread {
	
	private String name;
	private int booksBought;
	private BookShop shop;

	public Customer(String name, BookShop shop) {
		this.name =  name;
		this.shop = shop;
	}

	public void buyBooks() {
		for(int i = 1; i <= 100000; i++)
			if(shop.buyBook()) booksBought++;
	}

	public void printSummary() {
		System.out.println(name + " bought " + booksBought + " books.");
	}

	@Override
	public void run() {
		buyBooks();
	}
}