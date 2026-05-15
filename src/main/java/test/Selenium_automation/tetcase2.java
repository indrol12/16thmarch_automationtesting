package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public interface tetcase2 {
	static void firefoxbrowser()
	{
		
		FirefoxDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://practicetestautomation.com/practice-test-login/");
		    driver.findElement(By.name("username")).sendKeys("incorrectUser");
		    driver.findElement(By.name("password")).sendKeys("Password123");
		    driver.findElement(By.id("submit")).click();
		    //verification
		    WebElement msg=driver.findElement(By.id("error"));
		    System.out.println("After wrong username errormsg:"+msg.getText());
		    //driver.close();
	}
}
