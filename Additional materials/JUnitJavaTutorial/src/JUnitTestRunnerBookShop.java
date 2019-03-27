


//--------------------------------------------------------------------------
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
//--------------------------------------------------------------------------

import prBookShop.*;

//--------------------------------------------------------------------------

public class JUnitTestRunnerBookShop {
	//----------------------------------------------------------------------
	//--JUnitTest-----------------------------------------------------------
	//----------------------------------------------------------------------
	public static class JUnitTestBook {
		private Book lb1;
		@BeforeClass
		public static void beforeClass() {
			// Code executed before the first test method
			System.out.println("Start of Book JUnit Test");
		}
		@AfterClass
		public static void  afterClass() {
			// Code executed after the last test method
			System.out.println("End of Book JUnit Test");
		}
		@Before
		public void setUp() {
			// Code executed before each test
			lb1 = new Book("Isaac Asimov", "La Fundacion", 7.30);
		}
		@After
		public void tearDown() {
			// Code executed after each test
		}
		@Test(timeout = 1000)
		public void BookCtorTest1() {
			assertEquals("\n> Error: new Book(\"Isaac Asimov\", \"La Fundacion\", 7.30): Autor:", "Isaac Asimov", lb1.getAuthor());
			assertEquals("\n> Error: new Book(\"Isaac Asimov\", \"La Fundacion\", 7.30): Titulo:", "La Fundacion", lb1.getTitle());
			assertEquals("\n> Error: new Book(\"Isaac Asimov\", \"La Fundacion\", 7.30): PrecioBase:", 7.30, lb1.getBasePrice(), 1e-6);
			assertEquals("\n> Error: new Book(\"Isaac Asimov\", \"La Fundacion\", 7.30): PorcIva:", 10.00, Book.getIVA(), 1e-6);
		}
		//@Test(timeout = 1000)
		//public void BookCtorTestX1() {
		//	try {
		//		Book lb2 = new Book("Isaac Asimov", "La Fundacion", -7.30);
		//		fail("\n> Error: new Book(\"Isaac Asimov\", \"La Fundacion\", -7.30): No se lanzo ninguna excepcion");
		//	} catch (RuntimeException e) {
		//		//assertEquals("\n> Error: new Book(\"Isaac Asimov\", \"La Fundacion\", -7.30): exception.getMessage():", "", e.getMessage());
		//	} catch (Exception e) {
		//		fail("\n> Error: new Book(\"Isaac Asimov\", \"La Fundacion\", -7.30): la excepcion lanzada no es RuntimeException");
		//	}
		//}
		@Test(timeout = 1000)
		public void BookPrecioFinalTest1() {
			if (("Isaac Asimov".equals(lb1.getAuthor()))
				&&("La Fundacion".equals(lb1.getTitle()))
				&&(Math.abs(7.30 - lb1.getBasePrice()) < 1e-6)
				&&(Math.abs(10.00 - Book.getIVA()) < 1e-6)) {
				assertEquals("\n> Error: lb1.amountDue(): ", 8.03, lb1.amountDue(), 1e-6);
			} else {
				fail("\n> Aviso: No se pudo realizar el test debido a errores en otros metodos");
			}
		}
		@Test(timeout = 1000)
		public void BookSetIvaTest1() {
			if (("Isaac Asimov".equals(lb1.getAuthor()))
				&&("La Fundacion".equals(lb1.getTitle()))
				&&(Math.abs(7.30 - lb1.getBasePrice()) < 1e-6)
				&&(Math.abs(10.00 - Book.getIVA()) < 1e-6)) {
				Book.setIVA(20.00);
				double ivaActual = Book.getIVA();
				Book.setIVA(10.00);
				assertEquals("\n> Error: Book.setIVA(20.00): ", 20.00, ivaActual, 1e-6);
			} else {
				fail("\n> Aviso: No se pudo realizar el test debido a errores en otros metodos");
			}
		}
		@Test(timeout = 1000)
		public void BookToStringTest1() {
			if (("Isaac Asimov".equals(lb1.getAuthor()))
				&&("La Fundacion".equals(lb1.getTitle()))
				&&(Math.abs(7.30 - lb1.getBasePrice()) < 1e-6)
				&&(Math.abs(10.00 - Book.getIVA()) < 1e-6)) {
				assertEquals("\n> Error: lb1.toString():",
							 normalize("(Isaac Asimov; La Fundacion; 7.3; 10.0%; 8.03)"),
							 normalize(lb1.toString()));
			} else {
				fail("\n> Aviso: No se pudo realizar el test debido a errores en otros metodos");
			}
		}
		//------------------------------------------------------------------
	}
	//----------------------------------------------------------------------
	//--JUnitTest-----------------------------------------------------------
	//----------------------------------------------------------------------
	public static class JUnitTestBookShop {
		private BookShop lr1;
		@BeforeClass
		public static void beforeClass() {
			// Code executed before the first test method
			System.out.println("Start of BookShop JUnit Test");
		}
		@AfterClass
		public static void  afterClass() {
			// Code executed after the last test method
			System.out.println("End of BookShop JUnit Test");
		}
		@Before
		public void setUp() {
			// Code executed before each test
			lr1 = new BookShop(2);
		}
		@After
		public void tearDown() {
			// Code executed after each test
		}
		@Test(timeout = 1000)
		public void BookShopCtorTest1() {
			BookShop lr2 = new BookShop();
		}
		@Test(timeout = 1000)
		public void BookShopAddBookTest1() {
			lr1.addBook("Isaac Asimov", "La Fundacion", 7.30);
			lr1.addBook("Aldous Huxley", "Un Mundo Feliz", 6.50);
			lr1.addBook("William Gibson", "Neuromante", 8.30);
			lr1.addBook("George Orwell", "1984", 6.20);
			lr1.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
			//------------------------
			assertEquals("\n> Error: addBook(): getBasePrice():", 7.30, lr1.getBasePrice("Isaac Asimov", "La Fundacion"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 6.50, lr1.getBasePrice("Aldous Huxley", "Un Mundo Feliz"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 8.30, lr1.getBasePrice("William Gibson", "Neuromante"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 6.20, lr1.getBasePrice("George Orwell", "1984"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 7.40, lr1.getBasePrice("Ray Bradbury", "Fahrenheit 451"), 1e-6);
		}
		@Test(timeout = 1000)
		public void BookShopAddBookTest2() {
			lr1.addBook("isaac asimov", "la fundacion", 5.30);
			lr1.addBook("aldous huxley", "un mundo feliz", 4.50);
			lr1.addBook("william gibson", "neuromante", 6.30);
			lr1.addBook("george orwell", "1984", 4.20);
			lr1.addBook("ray bradbury", "fahrenheit 451", 5.40);
			//------------------------
			lr1.addBook("Aldous Huxley", "Un Mundo Feliz", 6.50);
			lr1.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
			lr1.addBook("William Gibson", "Neuromante", 8.30);
			lr1.addBook("Isaac Asimov", "La Fundacion", 7.30);
			lr1.addBook("George Orwell", "1984", 6.20);
			//------------------------
			assertEquals("\n> Error: addBook(): getBasePrice():", 7.30, lr1.getBasePrice("Isaac Asimov", "La Fundacion"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 6.50, lr1.getBasePrice("Aldous Huxley", "Un Mundo Feliz"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 8.30, lr1.getBasePrice("William Gibson", "Neuromante"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 6.20, lr1.getBasePrice("George Orwell", "1984"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 7.40, lr1.getBasePrice("Ray Bradbury", "Fahrenheit 451"), 1e-6);
		}
		@Test(timeout = 1000)
		public void BookShopgetBasePriceTest1() {
			lr1.addBook("Isaac Asimov", "La Fundacion", 7.30);
			lr1.addBook("Aldous Huxley", "Un Mundo Feliz", 6.50);
			lr1.addBook("William Gibson", "Neuromante", 8.30);
			lr1.addBook("George Orwell", "1984", 6.20);
			lr1.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
			//------------------------
			assertEquals("\n> Error: addBook(): getBasePrice():", 7.30, lr1.getBasePrice("Isaac Asimov", "La Fundacion"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 6.50, lr1.getBasePrice("Aldous Huxley", "Un Mundo Feliz"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 8.30, lr1.getBasePrice("William Gibson", "Neuromante"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 6.20, lr1.getBasePrice("George Orwell", "1984"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 7.40, lr1.getBasePrice("Ray Bradbury", "Fahrenheit 451"), 1e-6);
			//------------------------
			assertEquals("\n> Error: addBook(): getBasePrice():", 0.00, lr1.getBasePrice("XXX", "XXX"), 1e-6);
		}
		@Test(timeout = 1000)
		public void BookShopgetBasePriceTest2() {
			lr1.addBook("Isaac Asimov", "La Fundacion", 7.30);
			lr1.addBook("Aldous Huxley", "Un Mundo Feliz", 6.50);
			lr1.addBook("William Gibson", "Neuromante", 8.30);
			lr1.addBook("George Orwell", "1984", 6.20);
			lr1.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
			//------------------------
			assertEquals("\n> Error: addBook(): getBasePrice():", 7.30, lr1.getBasePrice("isaac asimov", "la fundacion"), 1e-6);
 			assertEquals("\n> Error: addBook(): getBasePrice():", 8.30, lr1.getBasePrice("william gibson", "neuromante"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 6.20, lr1.getBasePrice("george orwell", "1984"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 7.40, lr1.getBasePrice("ray bradbury", "fahrenheit 451"), 1e-6);
			//------------------------
			assertEquals("\n> Error: addBook(): getBasePrice():", 0.00, lr1.getBasePrice("xxx", "xxx"), 1e-6);
		}
		@Test(timeout = 1000)
		public void BookShopamountDueTest1() {
			lr1.addBook("Isaac Asimov", "La Fundacion", 7.30);
			lr1.addBook("Aldous Huxley", "Un Mundo Feliz", 6.50);
			lr1.addBook("William Gibson", "Neuromante", 8.30);
			lr1.addBook("George Orwell", "1984", 6.20);
			lr1.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
			//------------------------
			assertEquals("\n> Error: addBook(): amountDue():", 8.03, lr1.amountDue("Isaac Asimov", "La Fundacion"), 1e-6);
			assertEquals("\n> Error: addBook(): amountDue():", 7.15, lr1.amountDue("Aldous Huxley", "Un Mundo Feliz"), 1e-6);
			assertEquals("\n> Error: addBook(): amountDue():", 9.13, lr1.amountDue("William Gibson", "Neuromante"), 1e-6);
			assertEquals("\n> Error: addBook(): amountDue():", 6.82, lr1.amountDue("George Orwell", "1984"), 1e-6);
			assertEquals("\n> Error: addBook(): amountDue():", 8.14, lr1.amountDue("Ray Bradbury", "Fahrenheit 451"), 1e-6);
			//------------------------
			assertEquals("\n> Error: addBook(): amountDue():", 0.00, lr1.amountDue("XXX", "XXX"), 1e-6);
		}
		@Test(timeout = 1000)
		public void BookShopamountDueTest2() {
			lr1.addBook("Isaac Asimov", "La Fundacion", 7.30);
			lr1.addBook("Aldous Huxley", "Un Mundo Feliz", 6.50);
			lr1.addBook("William Gibson", "Neuromante", 8.30);
			lr1.addBook("George Orwell", "1984", 6.20);
			lr1.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
			//------------------------
			assertEquals("\n> Error: addBook(): amountDue():", 8.03, lr1.amountDue("isaac asimov", "la fundacion"), 1e-6);
			assertEquals("\n> Error: addBook(): amountDue():", 7.15, lr1.amountDue("aldous huxley", "un mundo feliz"), 1e-6);
			assertEquals("\n> Error: addBook(): amountDue():", 9.13, lr1.amountDue("william gibson", "neuromante"), 1e-6);
			assertEquals("\n> Error: addBook(): amountDue():", 6.82, lr1.amountDue("george orwell", "1984"), 1e-6);
			assertEquals("\n> Error: addBook(): amountDue():", 8.14, lr1.amountDue("ray bradbury", "fahrenheit 451"), 1e-6);
			//------------------------
			assertEquals("\n> Error: addBook(): amountDue():", 0.00, lr1.amountDue("xxx", "xxx"), 1e-6);
		}
		@Test(timeout = 1000)
		public void BookShopdeleteBookTest1() {
			lr1.addBook("Isaac Asimov", "La Fundacion", 7.30);
			lr1.addBook("Aldous Huxley", "Un Mundo Feliz", 6.50);
			lr1.addBook("William Gibson", "Neuromante", 8.30);
			lr1.addBook("George Orwell", "1984", 6.20);
			lr1.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
			//------------------------
			assertEquals("\n> Error: addBook(): getBasePrice():", 7.30, lr1.getBasePrice("Isaac Asimov", "La Fundacion"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 6.50, lr1.getBasePrice("Aldous Huxley", "Un Mundo Feliz"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 8.30, lr1.getBasePrice("William Gibson", "Neuromante"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 6.20, lr1.getBasePrice("George Orwell", "1984"), 1e-6);
			assertEquals("\n> Error: addBook(): getBasePrice():", 7.40, lr1.getBasePrice("Ray Bradbury", "Fahrenheit 451"), 1e-6);
			//------------------------
			lr1.deleteBook("Isaac Asimov", "La Fundacion");
			lr1.deleteBook("Aldous Huxley", "Un Mundo Feliz");
			lr1.deleteBook("William Gibson", "Neuromante");
			lr1.deleteBook("George Orwell", "1984");
			lr1.deleteBook("Ray Bradbury", "Fahrenheit 451");
			//------------------------
			assertEquals("\n> Error: deleteBook(): getBasePrice():", 0.00, lr1.getBasePrice("Isaac Asimov", "La Fundacion"), 1e-6);
			assertEquals("\n> Error: deleteBook(): getBasePrice():", 0.00, lr1.getBasePrice("Aldous Huxley", "Un Mundo Feliz"), 1e-6);
			assertEquals("\n> Error: deleteBook(): getBasePrice():", 0.00, lr1.getBasePrice("William Gibson", "Neuromante"), 1e-6);
			assertEquals("\n> Error: deleteBook(): getBasePrice():", 0.00, lr1.getBasePrice("George Orwell", "1984"), 1e-6);
			assertEquals("\n> Error: deleteBook(): getBasePrice():", 0.00, lr1.getBasePrice("Ray Bradbury", "Fahrenheit 451"), 1e-6);
			//------------------------
			lr1.deleteBook("xxx", "xxx");
		}
		@Test(timeout = 1000)
		public void BookShopToStringTest1() {
			assertEquals("\n> Error: lr1.toString():",
						 normalize("[]"),
						 normalize(lr1.toString()));
		}
		@Test(timeout = 1000)
		public void BookShopToStringTest2() {
			lr1.addBook("Isaac Asimov", "La Fundacion", 7.30);
			lr1.addBook("Aldous Huxley", "Un Mundo Feliz", 6.50);
			lr1.addBook("William Gibson", "Neuromante", 8.30);
			lr1.addBook("George Orwell", "1984", 6.20);
			lr1.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
			//------------------------
			assertEquals("\n> Error: lr1.toString():",
						 normalize("[(Isaac Asimov; La Fundacion; 7.3; 10.0%; 8.03), (Aldous Huxley; Un Mundo Feliz; 6.5; 10.0%; 7.15), (William Gibson; Neuromante; 8.3; 10.0%; 9.13), (George Orwell; 1984; 6.2; 10.0%; 6.82), (Ray Bradbury; Fahrenheit 451; 7.4; 10.0%; 8.14)]"),
						 normalize(lr1.toString()));
		}
		//------------------------------------------------------------------
	}
	//----------------------------------------------------------------------
	//--JUnitTestSuite------------------------------------------------------
	//----------------------------------------------------------------------
	@RunWith(Suite.class)
	@Suite.SuiteClasses({ JUnitTestBook.class ,
				JUnitTestBookShop.class
				})
				public static class JUnitTestSuite { /*empty*/ }
	//----------------------------------------------------------------------
	//--JUnitTestRunner-----------------------------------------------------
	//----------------------------------------------------------------------
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JUnitTestSuite.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("JUnit Test Succeeded");
		} else {
			System.out.println("> Error: JUnit Test Failed");
		}
	}
	//----------------------------------------------------------------------
	//-- Utils -------------------------------------------------------------
	//----------------------------------------------------------------------
	private static char normalizeUnicode(char ch) {
		switch (ch) {
		case '\n':
		case '\r':
		case '\t':
		case '\f':
			ch = ' ';
			break;
		case '\u00C0':
		case '\u00C1':
		case '\u00C2':
		case '\u00C3':
		case '\u00C4':
		case '\u00C5':
		case '\u00C6':
			ch = 'A';
			break;
		case '\u00C7':
			ch = 'C';
			break;
		case '\u00C8':
		case '\u00C9':
		case '\u00CA':
		case '\u00CB':
			ch = 'E';
			break;
		case '\u00CC':
		case '\u00CD':
		case '\u00CE':
		case '\u00CF':
			ch = 'I';
			break;
		case '\u00D0':
			ch = 'D';
			break;
		case '\u00D1':
			ch = 'N';
			break;
		case '\u00D2':
		case '\u00D3':
		case '\u00D4':
		case '\u00D5':
		case '\u00D6':
			ch = 'O';
			break;
		case '\u00D9':
		case '\u00DA':
		case '\u00DB':
		case '\u00DC':
			ch = 'U';
			break;
		case '\u00DD':
			ch = 'Y';
			break;
		case '\u00E0':
		case '\u00E1':
		case '\u00E2':
		case '\u00E3':
		case '\u00E4':
		case '\u00E5':
		case '\u00E6':
			ch = 'a';
			break;
		case '\u00E7':
			ch = 'c';
			break;
		case '\u00E8':
		case '\u00E9':
		case '\u00EA':
		case '\u00EB':
			ch = 'e';
			break;
		case '\u00EC':
		case '\u00ED':
		case '\u00EE':
		case '\u00EF':
			ch = 'i';
			break;
		case '\u00F0':
			ch = 'd';
			break;
		case '\u00F1':
			ch = 'n';
			break;
		case '\u00F2':
		case '\u00F3':
		case '\u00F4':
		case '\u00F5':
		case '\u00F6':
			ch = 'o';
			break;
		case '\u00F9':
		case '\u00FA':
		case '\u00FB':
		case '\u00FC':
			ch = 'u';
			break;
		case '\u00FD':
		case '\u00FF':
			ch = 'y';
			break;
		}
		return ch;
	}
	//----------------------------------------------------------------------
	private static String normalize(String s1) {
		int sz = s1 == null ? 16 : s1.length() == 0 ? 16 : 2*s1.length();
		StringBuilder sb = new StringBuilder(sz);
		sb.append(' ');
		if (s1 != null) {
			for (int i = 0; i < s1.length(); ++i) {
				char ch = normalizeUnicode(s1.charAt(i));
				char sbLastChar = sb.charAt(sb.length()-1);
				if (Character.isLetter(ch)) {
					if ( ! Character.isLetter(sbLastChar)) {
						if ( ! Character.isSpaceChar(sbLastChar)) {
							sb.append(' ');
						}
					}
					sb.append(ch);
				} else if (Character.isDigit(ch)) {
					if ((i >= 2)
						&& (s1.charAt(i-1) == '.')
						&& Character.isDigit(s1.charAt(i-2))) {
						sb.setLength(sb.length()-2); // "9 ."
						sb.append('.');
					} else if ((i >= 2)
							   && ((s1.charAt(i-1) == 'e')||(s1.charAt(i-1) == 'E'))
							   && Character.isDigit(s1.charAt(i-2))) {
						sb.setLength(sb.length()-2); // "9 e"
						sb.append('e');
					} else if ((i >= 3)
							   && (s1.charAt(i-1) == '+')
							   && ((s1.charAt(i-2) == 'e')||(s1.charAt(i-2) == 'E'))
							   && Character.isDigit(s1.charAt(i-3))) {
						sb.setLength(sb.length()-4); // "9 e +"
						sb.append('e');
					} else if ((i >= 3)
							   && (s1.charAt(i-1) == '-')
							   && ((s1.charAt(i-2) == 'e')||(s1.charAt(i-2) == 'E'))
							   && Character.isDigit(s1.charAt(i-3))) {
						sb.setLength(sb.length()-4); // "9 e -"
						sb.append("e-");
					} else if ( (sbLastChar != '-') && ! Character.isDigit(sbLastChar)) {
						if ( ! Character.isSpaceChar(sbLastChar)) {
							sb.append(' ');
						}
					}
					sb.append(ch);
				} else if (Character.isSpaceChar(ch)) {
					if ( ! Character.isSpaceChar(sbLastChar)) {
						sb.append(' ');
					}
				} else {
					if ( ! Character.isSpaceChar(sbLastChar)) {
						sb.append(' ');
					}
					sb.append(ch);
				}
			}
		}
		if (Character.isSpaceChar(sb.charAt(sb.length()-1))) {
			sb.setLength(sb.length()-1);
		}
		if ((sb.length() > 0) && Character.isSpaceChar(sb.charAt(0))) {
			sb.deleteCharAt(0);
		}
		return sb.toString();
	}
	//----------------------------------------------------------------------
}
//--------------------------------------------------------------------------