import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithPageFactory {
	WebDriver driver;
  @Test
  public void Login1() {
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  
	  PageFactory.initElements(driver, LoginSimpleClass.class);
	  Thread.sleep(7000);
	  LoginSimpleClass.username.sendkeys("Admin");
	  LoginSimpleClass.password.sendkeys("admin123");
	  LoginSimpleClass.login.click();
	  
  }
}
