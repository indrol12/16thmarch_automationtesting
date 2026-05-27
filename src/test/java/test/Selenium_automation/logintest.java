package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class logintest {
	ChromeDriver driver;

@BeforeMethod
	void demo_at() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	@Test
	void signin() throws InterruptedException 
	{
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(1000);
	}
	@AfterSuite
	void close()
	{
		driver.close();
	}
}
