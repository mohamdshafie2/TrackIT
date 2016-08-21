package de.fivecoffee.trackit.model.common.assertion;

import org.junit.Test;

public class AssertionTest {

	@Test(expected = IllegalArgumentException.class)
	public void testAssertNotNullWithNullValue() {
		Assert.assertNotNull("blubb", null);
	}
	

	@Test
	public void testAssertNotNullWithNotNullValue() {
		Assert.assertNotNull("blubb", "Hallo");
	}


}
