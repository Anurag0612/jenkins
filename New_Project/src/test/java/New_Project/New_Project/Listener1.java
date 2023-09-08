package New_Project.New_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Listener1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	  Assert.assertEquals(driver.getTitle(), "Selenium - Google Search");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
