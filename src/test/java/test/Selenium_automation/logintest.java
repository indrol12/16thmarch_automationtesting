package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logintest {
	ChromeDriver driver;

	@Test(priority=1)
	void demo_at()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	void signin() throws InterruptedException
	{
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(1000);
	}
	@Test(priority=3)
	void close()
	{
		driver.close();
	}
}
