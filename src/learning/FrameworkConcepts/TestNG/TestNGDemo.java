package learning.FrameworkConcepts.TestNG;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGDemo {
	// @BeforeMethod
	@BeforeClass
	public void openBrowserAndApplication() {
		System.out.println("Browser is launched and the application is accessed");
	}

	// @AfterMethod
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}

	@Test(priority = 1)
	public void testRegister() {
		System.out.println("inside register method");
	}

	@Test(priority = 2)
	public void testLogin() {
		System.out.println("inside login method");
	}

	@Test(priority = 3)
	public void testHomePage() {
		System.out.println("inside home page method");
	}

	@Test(priority = 4)
	public void failTestCase() throws Exception {
		int age = 15;
		if (age < 16) {
			throw new Exception("Age is less than 16");
		}
		System.out.println("Issue the ticket");
	}
	
	@Test(priority = 5)
	public void skippedMethod() {
		throw new SkipException("This method is skipped");
	}

}
