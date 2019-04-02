package prBookShop;

public class Book {

	private static double percIVA = 10.0;
	private String author;
	private String title;
	private double basePrice;


	public Book(String a, String t, double p) {

		author = a;
		title = t;
		basePrice = p;

	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public double amountDue() {

		return basePrice + (1 / percIVA) * basePrice;
	}

	public static double getIVA() {
		return percIVA;
	}

	public static void setIVA(double iva) {

		percIVA = iva;
	}

	public String toString() {

		return "(" + author + ";" + title + ";" + basePrice + ";" + percIVA + "% ;" + amountDue() + ")";

	}

}
