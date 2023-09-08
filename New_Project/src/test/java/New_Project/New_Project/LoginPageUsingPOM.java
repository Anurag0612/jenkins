package New_Project.New_Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginPageUsingPOM {

	WebDriver driver;
	Loginpage1 objlogin;
	HomePage1 objHome;

  @Test
  public void logintest() {

	  objlogin=new Loginpage1(driver);
	  objlogin.performLoginAction("Admin","admin123");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	  objHome=new HomePage1(driver);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  objHome.clickadminTab();

	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	//  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

  }


  @BeforeTest
  public void beforetestmethod() {
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

  }

}