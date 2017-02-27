package number;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IntTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Integer num1 = new Integer(21);
				
		assertFalse(num1.isEven());
		assertTrue(num1.isOdd());
		assertFalse(num1.isPrime());
		assertFalse(num1.isEven(num1));
		assertTrue(num1.isOdd(num1));
		assertFalse(num1.isPrime(num1));
		assertFalse(num1.isPrime(21));
		assertTrue(num1.isOdd(21));
		assertFalse(num1.isEven(21));
		assertFalse(num1.equals(20));
		assertTrue(num1.equals(num1));
	}

}
