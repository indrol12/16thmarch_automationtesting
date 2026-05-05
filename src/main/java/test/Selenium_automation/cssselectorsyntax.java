package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectorsyntax {
public static void main(String[] args) {
	
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.findElement(By.cssSelector("input#firstName")).sendKeys("poonam");
}
}
