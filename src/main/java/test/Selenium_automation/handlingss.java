package test.Selenium_automation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class handlingss {
static ChromeDriver driver;
	static void myntralaunch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	}
	
	static void fullss() throws IOException
	{
		//Type casting
		TakesScreenshot ts=(TakesScreenshot)driver;
		//temporary ss
		File src=ts.getScreenshotAs(OutputType.FILE);
		//permennet ss
		//File dest=new File("C:\\Users\\Admin\\Desktop\\myntrahomepage.jpg");
		
		File dest=new File("C:\\Users\\Admin\\automation_testing_23apr\\Selenium_automation\\myntra.jpg");
		//copy temp file into permenent location
		FileHandler.copy(src, dest);
		System.out.println("screenshot captured!!");
		driver.navigate().to("https://www.amazon.in/");
	}
	static void partial_ss()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement logofk=driver.findElement(By.xpath("//div[@id='nav-logo']"));
		File fk=logofk.getScreenshotAs(OutputType.FILE);
		
		File store=new File("C:\\Users\\Admin\\automation_testing_23apr\\Selenium_automation\\amazonlogo.png");
		
		fk.renameTo(store);
		System.out.println("partial screenshot captured!!");
		
		
	}
	public static void main(String[] args) throws IOException {
		myntralaunch();
		fullss();
		partial_ss();
	}
}
