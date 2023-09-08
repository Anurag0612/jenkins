package New_Project.New_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage1 {
	WebDriver driver;
	By admintab = By.xpath("//span[text()='Admin']");
	By PIMtab = By.xpath("//span[text()='PIM']");
	By Leavetab = By.xpath("//span[text()='Leave']");
	
	public HomePage1(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickadminTab() {
		driver.findElement(admintab).click();
	}
	
	public void clickPIMtab() {
		driver.findElement(PIMtab).click();
	}
	
	public void clickLeavetab() {
		driver.findElement(Leavetab).click();
	}
}
