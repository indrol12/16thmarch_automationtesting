package test.Selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verify_title {

	@Test
	void check()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://cravitaindia.com/");
		String expected_title="Home | Cravita Technologies";
		String actual_title=driver.getTitle();
		System.out.println(driver.getTitle());
		if(expected_title.equals(actual_title))
		{
			System.out.println("cravita title is matched!!");
		}
		else {
			System.out.println("cravita title is not matched!!");
		}
		driver.close();
	}
}
