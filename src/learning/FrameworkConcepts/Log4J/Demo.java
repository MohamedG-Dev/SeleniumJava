package learning.FrameworkConcepts.Log4J;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.out.println("Script execution started");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser is opened");
		driver.manage().window().maximize();
		System.out.println("Chrome browser window is maximized");
		driver.get("http://www.omayo.blogspot.com/");
		System.out.println("Omayo application is launched in the chrome browser");
		driver.findElement(By.linkText("compendiumdev")).click();
		System.out.println("Clicked on compendiumdev link");
		driver.navigate().back();
		System.out.println("navigated back to the omayo application");
		driver.navigate().forward();
		System.out.println("navigated forward to the compendiumdev page");
		driver.navigate().refresh();
		System.out.println("browser is refersed");
		driver.close();
		System.out.println("browser is closed");
	}

}
