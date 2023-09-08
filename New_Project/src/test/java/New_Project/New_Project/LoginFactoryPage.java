package New_Project.New_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginFactoryPage {
  WebDriver driver;
  @Test
  public void Login1() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  
	  PageFactory.initElements(driver, LoginSimpleClass.class);
	  Thread.sleep(7000);
	  LoginSimpleClass.username.sendKeys("Admin");
	  LoginSimpleClass.password.sendKeys("admin123");
	  LoginSimpleClass.login.click();
	  
  }
}
