import static org.junit.Assert.*;

import org.junit.Test;

public class FirstTestCase {

	@Test(expected = ArithmeticException.class)
	public void testGetter_setterException() {
		TestClass t1= new TestClass();
		t1.getter_setter(11);
	}
	
	@Test
	public void retrieveTest()
	{
		TestClass t1= new TestClass();
		t1.getter_setter(7);
		assertEquals("correct", 7,t1.retrieve());
	}

}
