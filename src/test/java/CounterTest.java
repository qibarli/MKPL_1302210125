package src.test.java;

import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import src.main.java.*;
import org.junit.Test;

public class CounterTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

	@Test
	public void testReset() {
		Counter testCounter = new Counter();
		
		for(int i = 0; i <10; i++) {
			testCounter.increment();
		}
		
		testCounter.reset();
		
		assertEquals(testCounter.getCount(), 0);
	}

	@Test
	public void testIncrement() {
		Counter testCounter = new Counter();
		
		for(int i = 1; i <10; i++) {
			testCounter.increment();
			assertEquals(testCounter.getCount(), i);
		}
	}

	@Test
	public void testDecrement() {
		Counter testCounter = new Counter();
		
		for(int i = 1; i <10; i++) {
			testCounter.decrement();
			assertEquals(testCounter.getCount(), i * -1);
		}
	}

    /**
     * Test of getCount method, of class Counter.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        Counter instance = new Counter();
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
