package learning.basics.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
	// getWindowHandles() command to switch to a new window
		Set<String> multipleWindowsID = driver.getWindowHandles();
		Iterator<String> itr=multipleWindowsID.iterator();
		/*
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 */
		String mainWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		String paratext = driver.findElement(By.id("para1")).getText();
		System.out.println(paratext);
		driver.quit();
	}

}
