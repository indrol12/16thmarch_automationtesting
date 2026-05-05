package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocator {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://practicetestautomation.com/practice-test-login/");
//2.   //parenttagname/childtagname	
	//driver.findElement(By.xpath("//div/input")).sendKeys("megha");
	
//	driver.findElement(By.xpath("//div/input")).clear();
//	driver.findElement(By.xpath("//div/input")).sendKeys("megha@123");
	
	//3.     //tagname[text()='value']
	// driver.findElement(By.xpath("//button[text()='Submit']")).click();
	
// 4 indexing   //(tagname[@attribute='value'])[index]
//	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	
//5 by using tagname //tagname
	driver.findElement(By.xpath("//button")).click();
	
	
	
}
}
