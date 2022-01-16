package learning.basics.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		// Selenium WebDriver API Commands/ Methods Description
		/*
		 * driver.findElement(By.id("alert1")).click(); Alert alert =
		 * driver.switchTo().alert(); alert.accept();
		 */
//		driver.findElement(By.id("link1")).click();

//		driver.findElement(By.cssSelector("input[name='vehicle'][value='Car']")).click();

//		driver.findElement(By.name("q")).sendKeys("Hello");

//		driver.findElement(By.id("textbox1")).clear();

		/*
		 * String text = driver.findElement(By.id("pah")).getText();
		 * System.out.println(text);
		 */

		/*
		 * String title = driver.getTitle(); System.out.println(title);
		 */

		/*
		 * String url = driver.getCurrentUrl(); System.out.println(url);
		 */

		// driver.close();

		/*
		 * driver.findElement(By.linkText("Open a popup window")).click();
		 * Thread.sleep(4000); driver.quit();
		 */

		/*
		 * boolean button2 = driver.findElement(By.id("but2")).isDisplayed();
		 * System.out.println(button2);
		 * 
		 * boolean hiddenButton = driver.findElement(By.id("hbutton")).isDisplayed();
		 * System.out.println(hiddenButton);
		 */

		/*
		 * boolean button2Enabled = driver.findElement(By.id("but2")).isEnabled();
		 * System.out.println(button2Enabled);
		 * 
		 * boolean button1Enabled = driver.findElement(By.id("but1")).isEnabled();
		 * System.out.println(button1Enabled);
		 */

		boolean bikeSelected = driver.findElement(By.cssSelector("input[name='vehicle'][value='Bike']")).isSelected();
		System.out.println(bikeSelected);

		boolean bicycleSelceted = driver.findElement(By.cssSelector("input[name='vehicle'][value='Bicycle']"))
				.isSelected();
		System.out.println(bicycleSelceted);
	}

}
