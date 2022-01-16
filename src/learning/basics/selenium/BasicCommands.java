package learning.basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\A716247\\Downloads\\Learning\\Java_Learning\\SeleniumProject\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the browser
		WebDriver driver= new ChromeDriver();
	// launches the URL
		//driver.get("http://omayo.blogspot.com/");
		
	// navigate to a particular URL. similar to the get() command
		driver.navigate().to("http://omayo.blogspot.com/");
		/*
		 * setting the size of the browser window to 700,600 using setSize method
		 * Dimension dimension=new Dimension(700,600);
		 * driver.manage().window().setSize(dimension); Thread.sleep(5000);
		 */
	// maximizes the browser window
		driver.manage().window().maximize();
		
	// 1.finding the element by id as "confirm" - Locators
		//driver.findElement(By.id("confirm")).click();
		
	// 2.Locators - name
		//driver.findElement(By.name("SiteMap")).click();;
		
	// 3.Locators - className	
		//driver.findElement(By.className("classone")).sendKeys("Arun QA");
	// CLEAR METHOD	
		//Thread.sleep(4000);
		//driver.findElement(By.className("classone")).clear();
	// 4.Locators - linkText	
		//driver.findElement(By.linkText("Selenium143")).click();
		
		//String text = driver.findElement(By.linkText("compendiumdev")).getText();
			//System.out.println(text);
		
		//String text1= driver.findElement(By.id("pah")).getText();
			//System.out.println(text1);
		
		//driver.findElement(By.partialLinkText("Selenium")).click();
	
	// 6.Locators - xpath
		//driver.findElement(By.xpath("//input[@id='confirm']")).click();
		
	// 5.Locators - cssSelector	
		//driver.findElement(By.cssSelector("#confirm")).click();
		
		//WebElement element=driver.findElement(By.cssSelector("#confirm"));
		//element.click();
		
	//getting the title of the page
		//String title=driver.getTitle();
		//System.out.println(title);
		
	//getting the current url of the page
	/*
	 * String currentURL=driver.getCurrentUrl(); System.out.println(currentURL);
	 * driver.findElement(By.linkText("onlytestingblog")).click(); currentURL =
	 * driver.getCurrentUrl(); System.out.println(currentURL);
	 */
		
	// getAttribute() method
		//String valueAttribute=driver.findElement(By.id("textbox1")).getAttribute("value");
		//System.out.println(valueAttribute);
		
	// idDisplayed() method
	/*
	 * boolean isDisplayed = driver.findElement(By.id("but2")).isDisplayed();
	 * System.out.println("The Button is displayed: "+isDisplayed); isDisplayed =
	 * driver.findElement(By.id("hbutton")).isDisplayed();
	 * System.out.println("The Button is displayed: "+isDisplayed);
	 */
		
	// isEnabled() method
	/*
	 * boolean isEnabled = driver.findElement(By.id("but2")).isEnabled();
	 * System.out.println("Is Button2 enabled? "+isEnabled); isEnabled =
	 * driver.findElement(By.id("but1")).isEnabled();
	 * System.out.println("Is Button1 enabled? "+isEnabled);
	 */
	
	// isSelected() command
	/*
	 * boolean isSelected =
	 * driver.findElement(By.cssSelector("input[value='Bike']")).isSelected();
	 * System.out.println("is bike selected? "+isSelected);
	 * isSelected=driver.findElement(By.cssSelector("input[value='Bicycle']")).
	 * isSelected(); System.out.println("is Bicycle selected? "+isSelected);
	 * isSelected=driver.findElement(By.cssSelector("input[value='Car']")).
	 * isSelected(); System.out.println("is car selected? "+isSelected);
	 */
		
	// browser navigation commands
	/*
	 * driver.findElement(By.linkText("onlytestingblog")).click();
	 * driver.navigate().back(); //moves backward of the page Thread.sleep(3000);
	 * driver.navigate().forward(); //moves forward to the page Thread.sleep(3000);
	 * driver.navigate().refresh(); // reloads the page Thread.sleep(3000);
	 */
		
	// getPageSource() command
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
	// findElements() command
		//List<WebElement> list =driver.findElements(By.xpath("//div[@id='LinkList1']/div/ul/li/a"));
	// tagName() command
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(WebElement element :list) {
			System.out.println(element.getText());
		}
		// close the browser - current window
		driver.close();
	
	// close all the browser windows
	/*
	 * driver.findElement(By.linkText("Blogger")).click(); Thread.sleep(6000);
	 * driver.quit();
	 */
	
	}

}
