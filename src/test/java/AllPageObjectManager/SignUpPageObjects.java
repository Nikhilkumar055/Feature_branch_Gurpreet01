package AllPageObjectManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.GenericClass;

public class SignUpPageObjects extends GenericClass {

	public WebDriver driver;
	public WebDriverWait wait;

	public SignUpPageObjects(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	By start_Selling_Email = By.xpath("//input[@placeholder='Enter Email Id']");
	By start_Selling_button = By.cssSelector(".mt-3");
	By getCreateAccountText = By.xpath("//p[@class='text-gray-700 text-left']");

	@Override
	public void getWaitTimeForErrorLoginText() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(start_Selling_button));

		driver.findElement(start_Selling_button).isDisplayed();
	}

	public void startSelling(String startSellingEmail) throws InterruptedException {
		getWaitTimeForErrorLoginText();
		getScrollPage();
		driver.findElement(start_Selling_Email).sendKeys(startSellingEmail);
		driver.findElement(start_Selling_button).click();

	}

	public void verifyLandOnCreateAccount() {
		String validateCreateAccountText = driver.findElement(getCreateAccountText).getText();
		System.out.println(validateCreateAccountText);
		if (validateCreateAccountText == "Create your account to start selling") {

		}

	}

}
