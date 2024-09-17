package AllPageObjectManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {

	public WebDriver driver;

	public LoginPageObjects(WebDriver driver) {

		this.driver = driver;
	}

	By enterEmail = By.xpath("//input[@placeholder='Email or Mobile number']");
	By enterPassword = By.xpath("//input[@placeholder='Password']");
	By loginButton = By.xpath(
			"//button[@class='w-full text-white bg-orange-400 rounded-md my-2 py-2 text-center flex items-center justify-center']");

	public void enterLoginCredentials(String email, String Password) {

		driver.findElement(enterEmail).sendKeys(email);
		driver.findElement(enterPassword).sendKeys(Password);

	}

	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
}
