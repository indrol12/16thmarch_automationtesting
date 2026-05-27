package test.Selenium_automation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterized_testing {
    @Parameters({"N"})
	@Test
	void display(String name)
	{
		System.out.println("My name is:"+name);
	}
}
