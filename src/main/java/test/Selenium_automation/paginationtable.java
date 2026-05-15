package test.Selenium_automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paginationtable {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	List<WebElement> check=driver.findElements(By.xpath("//ul[@id='pagination']//a"));
	for (int i=1;i<=check.size();i++)
	{
		driver.findElement(By.xpath("//ul[@id='pagination']//a[text()='+i+']")).click();
	
	}
}
}
