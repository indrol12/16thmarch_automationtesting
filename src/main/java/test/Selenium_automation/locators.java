package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
public static void main(String[] args) {
	
	//launch browser
	ChromeDriver driver=new ChromeDriver();
	
	//for maximizing the window
	driver.manage().window().maximize();
	
	//launch automation practice website
	driver.get("https://practicetestautomation.com/practice-test-login/");

	//Locators
	//1.ID=done
	//driver.findElement(By.id("username")).sendKeys("student");
	
	//2.Name=done
	//driver.findElement(By.name("username")).sendKeys("student");
	
	//3.classname(finding the submit button)=done
	//driver.findElement(By.className("btn")).click();
	
	//4.tagname=done
	//driver.findElement(By.tagName("input")).sendKeys("student");
	
	//5.linktext=done
	//driver.findElement(By.linkText("COURSES")).click();
	
	//6.partiallinktext
	//driver.findElement(By.partialLinkText("BL")).click();
	
	//7.xpath(//tagname[@attribute='value'])=done
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("student");
	
	//8.cssselector(tagname[attribute='value'])
	//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Password123");
	
}
}
