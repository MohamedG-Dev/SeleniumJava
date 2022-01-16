package learning.basics.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("alert1")).click();
		Alert alert = driver.switchTo().alert();
		String getAlertTextMsg = alert.getText();
		System.out.println(getAlertTextMsg);
		alert.accept();
		// switching to the parent browser tab/window
		driver.switchTo().defaultContent();
		driver.close();
	}

}
