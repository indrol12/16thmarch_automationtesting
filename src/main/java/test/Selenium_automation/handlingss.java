package test.Selenium_automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	}
	public static void main(String[] args) throws IOException {
		myntralaunch();
		fullss();
	}
}
