package learning.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownAndMultiSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		// selection of an element from drop down field
		WebElement dropdownfield = driver.findElement(By.id("drop1"));
		Select select = new Select(dropdownfield);
		select.selectByVisibleText("doc 3");
		// selection of an element(s) from multi selection field
		WebElement multiSelectField = driver.findElement(By.id("multiselect1"));
		Select multiSelect = new Select(multiSelectField);
		multiSelect.selectByVisibleText("Swift");
		multiSelect.selectByVisibleText("Audi");
		multiSelect.selectByVisibleText("Volvo");
		// deselction of an element(s) from multi selection field
		Thread.sleep(4000);
		multiSelect.deselectByVisibleText("Swift");
	}

}
