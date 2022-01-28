package learning.FrameworkConcepts.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Paramerization {
	//@Test(dataProvider = "loginData")
	@Test(dataProvider = "LoginInfo")
	public void loginValidation(String userName, String password) {
		System.out.println("User having username as: " + userName + " and password: " + password + " got logged in");
	}
	//@DataProvider
	@DataProvider(name="LoginInfo")
	public String[][] loginData() {
		String[][] obj = { { "AdminUserName", "APassword" }, { "TeacherUserName", "TPassword" },
				{ "StudentUserName", "SPassword" } };
		return obj;
	}
}
