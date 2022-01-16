package learning.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLightBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/lightbox.html");
		Thread.sleep(4000);
		driver.findElement(By.id("lightbox1")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".close.cursor")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
