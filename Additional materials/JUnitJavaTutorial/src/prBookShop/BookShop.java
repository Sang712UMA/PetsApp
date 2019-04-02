package prBookShop;

import java.util.Arrays;

public class BookShop {

	private static int capacity = 16;
	private Book[] books;
	private int bookNumbers = 0;
	private String book;

	// justify then private to prodected

	public BookShop() {

		this(capacity);
	}

	public BookShop(int capacity) {

		books = new Book[capacity];
		bookNumbers = 0;
	}

	public void addBook(String a, String t, double p) {

		if (bookNumbers == books.length) {
			books = Arrays.copyOf(books, books.length * 2);
		}
		Book bk = new Book(a, t, p);
		books[bookNumbers] = bk;
		bookNumbers++;
	}

	public int seekBook(String a, String t) {
		int i = 0;
		while (books[i].getAuthor().equals(a) && books[i].getTitle().equals(t)) {
			i++;
		}
		return i;

	}

	public void deleteBook(String a, String t) {

		int index = seekBook(a, t);
		if (index < bookNumbers) {
			for (int i = index; i < bookNumbers - 1; i++) {
				books[i] = books[i + 1];
			}
			bookNumbers--;
		}

	}

	public double getBasePrice(String a, String t) {
		int index = seekBook(a, t);
		return books[index].getBasePrice();
	}

	public double amountDue(String a, String t) {
		int index = seekBook(a, t);
		return books[index].amountDue();
	}

	@Override
	public String toString() {
		return "";
	}
}
