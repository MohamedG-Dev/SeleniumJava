package learning.FrameworkConcepts.PropertiesFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileExampleUsingSelenium {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		File file = new File("./config/ProjectDetails.properties");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		String browserName = prop.getProperty("Browser");

		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equals("IE")) {
			System.out.println("Please download the IE driver and then execute the below commented statements");
			// System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			// driver=new InternetExplorerDriver();
		} else if (browserName.equals("Firefox")) {
			System.out.println("Please download the IE driver and then execute the below commented statements");
			// System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			// driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("Url"));
	}

}
