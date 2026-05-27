package test.Selenium_automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class groupingtestcase {

	@Test
	void first()
	{
		System.out.println("first tc");
	}
	@Test
	void second()
	{
		Assert.fail();
	}
	@Test
	void third()
	{
		System.out.println("third tc");
		
		Assert.assertEquals(null, null);
	}
}
