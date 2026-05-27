package test.Selenium_automation;

import org.testng.annotations.Test;

public class depend {

	@Test
	void register()
	{
		System.out.println("register");
	}
	@Test(dependsOnMethods="register")
	void login()
	{
		System.out.println("login");
	}
}
