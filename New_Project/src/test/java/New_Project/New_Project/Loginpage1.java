package New_Project.New_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage1 {
	WebDriver driver;
	By username=By.name("username");
	By password=By.name("password");
	By loginbtn=By.xpath("//button[@type='submit']");

	
	public Loginpage1(WebDriver driver){
		this.driver=driver;
	}
	
	public void setusername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}

	public void setpassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickloginbtn() {
		driver.findElement(loginbtn).click();
	}

	public void performLoginAction(String uname,String pwd) {
		this.setusername(uname);
		this.setpassword(pwd);
		this.clickloginbtn();

	}

	
}
