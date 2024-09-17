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

	By start_Selling_Email = By.xpath("//input[@type='email']");
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
		while (true) {
			driver.findElement(start_Selling_button).click();
			Thread.sleep(2000);
			if (driver.findElements(getCreateAccountText).size()> 0) {
				break;
			}
		}
	}

	public void verifyLandOnCreateAccount() {
		System.out.println("I am executed");
		String validateCreateAccountText = driver.findElement(getCreateAccountText).getText();
		System.out.println(validateCreateAccountText);
		if(validateCreateAccountText == "Create your account to start selling") {
			System.out.println(validateCreateAccountText);
			
		}
		

	}

}
