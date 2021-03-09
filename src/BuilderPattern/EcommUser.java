package BuilderPattern;

public class EcommUser {

	public static void main(String[] args) {

		EcommApp shop = new EcommApp();
		
		shop
		.login("naveen@gmail.com", "naveen123")
		.doSearch("macbook", 1000)
		.addToCart("macbook")
		.doPayment("ICICI BANK 121212", "test123")
		.getEmail()
		.logout()
		.login()
		.doSearch("Nike Shoes")
		.addToCart("Nike Shoes")
		.doPayment("GPAY", "test123")
		.logout();
		
		int orderId = shop.generateOrderId();
		System.out.println(orderId);
		
		shop.login().doPayment("bank", "test123").logout();
		
		shop.login().doSearch("imac").doPayment("bank", "tets123").logout();
		
		shop.login().logout();
		
		
		
	
		
	}

}
