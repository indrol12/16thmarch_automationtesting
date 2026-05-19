package test.Selenium_automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class annotation {

	@AfterClass
	void a()
	{
		System.out.println("afterclass");
	}
	@BeforeClass
	void b()
	{
		System.out.println("beforeclass");
	}
	@Test
	void c()
	{
		System.out.println("Test");
	}
}
