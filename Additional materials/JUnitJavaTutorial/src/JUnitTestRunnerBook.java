
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

public class JUnitTestRunnerBook {
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
	//--JUnitTestSuite------------------------------------------------------
	//----------------------------------------------------------------------
	@RunWith(Suite.class)
	@Suite.SuiteClasses({ JUnitTestBook.class
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