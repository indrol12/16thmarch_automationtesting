package test.Selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ohrmlogin {
	ChromeDriver driver;
	@AfterClass
	void logouttest() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
	@Test
	void logintest() throws InterruptedException
	{
		Thread.sleep(1000);
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   driver.findElement(By.name("password")).sendKeys("admin123");
	   driver.findElement(By.tagName("button")).click();
	   
	}
	@BeforeTest
	void launchohrm()
	{
		 driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	}

}
