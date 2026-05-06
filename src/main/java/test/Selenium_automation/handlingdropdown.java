package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Select sel=new Select(driver.findElement(By.id("Skills")));
		//select by Index
		
	    //sel.selectByIndex(4);
	    
	    //selectbyvisibletext
	    
		//sel.selectByVisibleText("C++");
	    
	    //select by value
		//sel.selectByValue("Email");
	}

}
