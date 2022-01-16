package learning.basics.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.className("dropbtn")).click();
		//WebDriverWait wait=new WebDriverWait(driver,15);
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		//driver.findElement(By.linkText("Facebook")).click();
		ele.click();
	}

}
