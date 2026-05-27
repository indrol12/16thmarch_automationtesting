package test.Selenium_automation;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class datadriventesting {
	
  @Test(dataProvider = "data")
  public void swaglab_login_logout(String uname, String pass) {
	  EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  driver.findElement(By.id("user-name")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
  }

  @DataProvider
  public Object[][] data() {
    return new Object[][] {
                             new Object[] { "standard_user", "secret_sauce" },
                             new Object[] { "problem_user", "secret_sauce" },
                             new Object[] { "performance_glitch_user", "secret_sauce" },
    };
  }
}
