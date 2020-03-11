package JUnitTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	MyMath myMath= new MyMath();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void sum_with3numbers() {
		System.out.println("Test1");
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}

	@Test
	public void sum_with1numbers() {
		System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] {3}));
	}

}
