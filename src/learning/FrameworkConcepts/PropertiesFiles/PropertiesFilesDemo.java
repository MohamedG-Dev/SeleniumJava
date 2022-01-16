package learning.FrameworkConcepts.PropertiesFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesDemo {

	public static void main(String[] args) throws IOException {
		File propFile = new File("./config/EmployeeDetails.properties");
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(propFile);
		prop.load(fis); // It'll load the EmployeeDetails.properties file
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Place"));
		System.out.println(prop.getProperty("Role"));
		System.out.println(prop.getProperty("Experience"));
	}

}
