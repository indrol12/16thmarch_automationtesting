package test.Selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_iframes {
	ChromeDriver driver;
	void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Frames.html");
	}
	
	void singleiframe()
	{
		//it is used to switch webdriver to iframe
		//1.index
		//driver.switchTo().frame(0);
		
		//2.name 
		//driver.switchTo().frame("SingleFrame");
		
		//3.ID
		//driver.switchTo().frame("singleframe");
		
		//driver.findElement(By.tagName("input")).sendKeys("Pooja");
		
		//4.Webelement 
		WebElement s_frame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(s_frame);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Pooja");
	
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pooja");
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Pooja");
	}
	void newwindow()
	{
		//it is used to open new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com/");
		
	}
	void newtab()
	{
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://onlinesbi.sbi.bank.in/");
		driver.quit();
	}
	
	public static void main(String[] args) {
		handling_iframes o=new handling_iframes();
		o.launch();
		o.singleiframe();
		o.newwindow();
		o.newtab();
	}
}
