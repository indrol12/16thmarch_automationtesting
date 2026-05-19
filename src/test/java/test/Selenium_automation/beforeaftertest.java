package test.Selenium_automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforeaftertest {
	@AfterTest
	void demo()
	{
		System.out.println("Everyone should attend the Mock Interview!!!!!");
	}

	
	@BeforeTest
	void display()
	{
		System.out.println("Tomorrow is the mock interview");
	}
	@Test
	void show()
	{
		System.out.println("conducted at Fortune cloud ");
	}
	
}
