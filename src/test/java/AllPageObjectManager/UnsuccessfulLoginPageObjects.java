package AllPageObjectManager;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.GenericClass;

public class UnsuccessfulLoginPageObjects extends GenericClass{
	
	
	public WebDriver driver;
	public WebDriverWait wait;

	public UnsuccessfulLoginPageObjects(WebDriver driver, WebDriverWait wait) {
super(driver);
		this.driver = driver;
		this.wait = wait;
	}
	By errorLoginText = By.xpath("//div[@class='go3958317564']");
	
	public void verifyUnsuccessfulLogin() {
		getWaitTimeForErrorLoginText();
		
		String getErrorLoginText = driver.findElement(errorLoginText).getText();
		Assert.assertEquals(getErrorLoginText, "Invalid Email and Password");

	}

}
