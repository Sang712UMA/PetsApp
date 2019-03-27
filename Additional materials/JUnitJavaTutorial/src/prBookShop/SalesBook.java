package prBookShop;

public class SalesBook extends Book{
	
	private static double discountPercentage;
	
	public SalesBook(String a, String t, double p, double d) {
		super(a,t,p);
		discountPercentage = d;
	}

	public double getDiscountPercentage() {
		
		return discountPercentage; 
		
	}
	@Override
	public double amountDue() {
		return amountDue();
		
	}
	@Override
	public String toString() {
		return "(" + getAuthor() + ";" + getTitle() + ";" + getBasePrice() + ";" + getDiscountPercentage() + "% ;" + amountDue() + ";" + getIVA()+";)";
	}
	
	private double getSalesPrice() {
		
		return getBasePrice() - getBasePrice() * discountPercentage/100;
	}
	
	
}
