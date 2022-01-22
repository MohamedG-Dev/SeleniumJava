package learning.FrameworkConcepts.Log4J;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Log4JExample {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("devpinoyLogger");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		log.info("Script execution started");
		
		WebDriver driver = new ChromeDriver();
		log.warn("Chrome Browser is opened");
		
		driver.manage().window().maximize();
		log.error("Chrome browser window is maximized");
		
		driver.get("http://www.omayo.blogspot.com/");
		log.fatal("Omayo application is launched in the chrome browser");
		
		driver.findElement(By.linkText("compendiumdev")).click();
		log.fatal("Clicked on compendiumdev link");
		
		driver.navigate().back();
		log.fatal("navigated back to the omayo application");
		
		driver.navigate().forward();
		log.fatal("navigated forward to the compendiumdev page");
		
		driver.navigate().refresh();
		log.fatal("browser is refersed");
		
		driver.close();
		log.debug("browser is closed");
	}

}
