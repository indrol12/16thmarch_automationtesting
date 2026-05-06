package test.Selenium_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_interface {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	Alert al=driver.switchTo().alert();
	//alert with ok
	al.accept();
	//alert ok and cancel
	al.dismiss();
	//alert with textbox
	
	
}
}
