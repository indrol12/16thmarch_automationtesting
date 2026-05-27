package test.Selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
  @Test
	void assert_title()
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String expected_title="OrangeHRM";
		String actual_title=driver.getTitle();
		Assert.assertEquals(expected_title, actual_title,"title is not matched");
	
		driver.close();
		
	}
}
