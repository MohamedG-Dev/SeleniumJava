package learning.FrameworkConcepts.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {
	@Test
	public void assertEquals() {
		Assert.assertEquals(2 + 2 + 2, 4 + 2);
		//Assert.assertEquals(3+6, 2+5); //Negative scenario
	}
	
	@Test
	public void assertNotEquals() {
		Assert.assertNotEquals("Hello", "World");
		//Assert.assertNotEquals("Hello", "Hello"); //Negative scenario
	}
	
	@Test
	public void assertTrue() {
		Assert.assertTrue(10>5);
		//Assert.assertTrue(5>10); //Negative scenario
	}
	
	@Test
	public void assertFalse() {
		Assert.assertFalse(5>9);
		//Assert.assertFalse(5>3); //Negative scenario
	}
	
	@Test
	public void failAssertion() {
		Assert.fail();
	}
	
	@Test
	public void assertNotNull() {
		Assert.assertNotNull("Not Null Value");
	}
	
	@Test
	public void assertNull() {
		Assert.assertNull(null);
	}
}
