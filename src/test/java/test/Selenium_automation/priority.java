package test.Selenium_automation;

import org.testng.annotations.Test;

public class priority {

	@Test(priority=1)
	void jasmin()
	{
		System.out.println("flower");
	}
	@Test(priority=2)
	void apple()
	{
		System.out.println("fruit");
	}
}
