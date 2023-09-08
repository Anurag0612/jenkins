import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DependsOnGroup {
	WebDriver driver;
	
  @Test(groups = "G1")
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
  
  @Test(groups="G2", dependsOnGroups="G1")
  public void f1() {
	  driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
  }
  
  @Test(groups = "G2")
  public void f2() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.navigate().back();
  }
  
  @Test(groups="G3",dependsOnGroups= {"G1","G2"})
  public void f3() {
	  driver.get("https://www.demoblaze.com");
  }
}
