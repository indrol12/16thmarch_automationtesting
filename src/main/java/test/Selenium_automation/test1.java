package test.Selenium_automation;
import org.openqa.selenium.chrome.ChromeDriver;
public class test1 {
	public static void main(String [] args)
	{
		//launch browser ,initialize the chromedriver object
		ChromeDriver driver=new ChromeDriver();
		
		//used to maximize the window
		driver.manage().window().maximize();
		
		//used to open th current webpage
		driver.get("https://www.facebook.com/");
		
		//used for navigation of website
		driver.navigate().to("https://www.fortunecloudindia.com/");
		
		System.out.println("title of fct:"+driver.getTitle());//return current webpage title 
		//used to navigate back
		driver.navigate().back();
		
		System.out.println("url of fb:"+driver.getCurrentUrl());//return current webpage URL 
		//use forword,refresh
		//used to close the browser
		//driver.close();
		
		
	}
}
