package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class otherwebelement {
	ChromeDriver driver;

void launch()
{
	driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    
}
void fileupload() throws InterruptedException
{
	//single file upload
	WebElement file=driver.findElement(By.id("singleFileInput"));
	file.sendKeys("C:\\Users\\Admin\\Desktop\\softwaretesting.txt");
	WebElement uploadfbtn=driver.findElement(By.xpath("//button[text()='Upload Single File']"));
	uploadfbtn.click();
	
	Thread.sleep(2000);
	//multiple file upload
	WebElement secondfile=driver.findElement(By.id("multipleFilesInput"));
	secondfile.sendKeys("C:\\Users\\Admin\\Desktop\\first.txt\n"+"C:\\Users\\Admin\\Desktop\\second.txt");
	
	WebElement uploadmulti=driver.findElement(By.xpath("//button[text()='Upload Multiple Files']"));
	uploadmulti.click();
	
}
}
