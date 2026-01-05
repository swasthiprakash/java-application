public class ShoppingBill {
	public static void main(String args[]) {
		
		double price = 200.00;
		int qty = 5;
		
		double total = price*qty;
		double discount = total*0.10;
		double finalAmount = total-discount;
		System.out.println("Total Amount:" + total);
		System.out.println("Discount:" + discount);
		System.out.println("Final payable amount:" + finalAmount);	
	}

}
