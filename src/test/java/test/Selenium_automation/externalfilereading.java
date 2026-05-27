package test.Selenium_automation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class externalfilereading {

	@Test
	void fileread() throws IOException, InterruptedException
	{
       FileReader fr=new FileReader("C:\\Users\\Admin\\automation_testing_23apr\\Selenium_automation\\base.properties");
       
       Properties p=new Properties();
       
       p.load(fr);
       //test scenario :launch fortunecloud and check all the images display clearly
       ChromeDriver driver=new ChromeDriver();
       driver.get(p.getProperty("fcturl"));
       Thread.sleep(2000);
       driver.close();
	}
}
