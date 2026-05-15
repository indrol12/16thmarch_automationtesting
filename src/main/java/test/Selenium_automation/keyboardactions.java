package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class keyboardactions {
public static void main(String[] args) {
	
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement search=driver.findElement(By.tagName("textarea"));
	search.sendKeys("software testing");
	search.sendKeys(Keys.ENTER);
	
	//navigation
	driver.navigate().to("https://demowebshop.tricentis.com/");
	WebElement se=driver.findElement(By.id("small-searchterms"));
	se.sendKeys("books");
	se.sendKeys(Keys.ENTER);
	
	//register
	driver.findElement(By.linkText("Register")).click();
	
	//firstname
	WebElement fname=driver.findElement(By.id("FirstName"));
	fname.sendKeys("Prajkta");
	fname.sendKeys(Keys.CONTROL+"A");
	
	//copy
	fname.sendKeys(Keys.CONTROL+"C");
	
	//lastname
	WebElement lname=driver.findElement(By.id("LastName"));
	lname.sendKeys(Keys.CONTROL+"V");
}
}
