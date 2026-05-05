package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogintest {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	
	//fb login page=email textbox
	driver.findElement(By.id("_R_oiqjbjb9pb6amH1_")).sendKeys("admin@gmail.com");
    //password textbox
	driver.findElement(By.id("_R_oqqjbjb9pb6amH1_")).sendKeys("admin");
	
	//loginbutton
	driver.findElement(By.name("")).click();
	
	
	
}
}
