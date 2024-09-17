package AllPageObjectManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.GenericClass;

public class SellerHomePageObjects  extends GenericClass{

	public WebDriver driver;

	public  SellerHomePageObjects(WebDriver driver) {
		super (driver);
		this.driver = driver;
	}

	By goLive = By.xpath("//button[@class = 'bg-red-800 text-white flex font-bold px-4 py-2 me-12 rounded']");

	public void verifyHomePageAfterSuccessfulLogin() {
		getWaitTimeForErrorLoginText();
		driver.findElement(goLive).isDisplayed();

	}

}
