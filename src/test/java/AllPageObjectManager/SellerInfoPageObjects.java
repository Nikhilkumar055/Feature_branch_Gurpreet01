package AllPageObjectManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SellerInfoPageObjects {

	public WebDriver driver;

	public SellerInfoPageObjects(WebDriver driver) {

		this.driver = driver;
	}

	By loginButton = By.xpath("//button[@class='bg-customPurple text-white flex font-bold rounded-lg px-4 py-2']");

	public void clickOnLoginButtonFromSellerInfo() {

		driver.findElement(loginButton).click();
	}
}
