import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	// code executed before all test methods
	
	@Before
	public void setUp () throws Exception {
	// code executed before each test method
	}
	
	@Test
	public final void testAdd() {
	//fail ("Not yet implemented") ; // TODO
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	
	@Test
	public final void testSubtract(){
	//fail ("Not yet implemented"); // TODO
	int a = 4321;
	int b = 1234;
		
	Calculator cal = new Calculator();
	int actual = cal.subtract(a, b); 
		 
	int expected = 3087;
	assertEquals (expected, actual);
	}

	@Test
	public void testMultiply() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 5332114;
		assertEquals (expected, actual);
		}

	@Test
	public final void testDivideWith0Denominator(){
	//fail ("Not yet implemented"); // TODO
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 4;
		assertNotEquals (expected, actual);
		}
	
	@Test
	public final void testDivideWithNon0Denominator(){
	//fail ("Not yet implemented"); // TODO
		int a = 16;
		int b = 4;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 4;
		assertEquals (expected, actual);
		}
		
	@After
	public void tearDown() throws Exception {
	// code executed after each test method
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	// code executed after each test method
	}

}
