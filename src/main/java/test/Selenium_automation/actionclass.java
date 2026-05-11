package test.Selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
	ChromeDriver driver;
	Actions act;
public static void main(String[] args) throws InterruptedException {
	
	actionclass ob=new actionclass();
	ob.mousehover();
	ob.search();
	ob.draganddrop();
	ob.slider();
}
void mousehover() throws InterruptedException
{
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	driver.get("https://demo.nopcommerce.com/");
	//ACtion class
	 act=new Actions(driver);
	WebElement comp=driver.findElement(By.linkText("Computers"));
	act.moveToElement(comp).build().perform();
	Thread.sleep(2000);
	
}
void search()
{
	WebElement se=driver.findElement(By.id("small-searchterms"));
	WebElement button=driver.findElement(By.xpath("//button[text()='Search']"));
	act.sendKeys(se,"laptop").click(button).perform();
}
void draganddrop()
{
	driver.navigate().to("https://demo.automationtesting.in/Static.html");
	WebElement drag=driver.findElement(By.id("angular"));
	WebElement drop=driver.findElement(By.id("droparea"));
	act.dragAndDrop(drag, drop).build().perform();
	
}
void slider()
{
	WebElement widgets=driver.findElement(By.linkText("Widgets"));
	act.moveToElement(widgets).build().perform();
	
	driver.findElement(By.linkText("Slider")).click();
	
	WebElement sl=driver.findElement(By.id("slider"));
	act.dragAndDropBy(sl, 0, 20).build().perform();
}
}
