package Utils;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class GenericClass {
	public WebDriver driver;
	public WebDriverWait wait;

	public GenericClass(WebDriver driver) {

		this.driver = driver;
	}

	By errorLoginText = By.xpath("//div[@class='go3958317564']");
	By goButtonOnYopMail = By.id("refreshbut");
	By waitForYopMailOTPPage = By.xpath("(//div[@class='tooltip'])[2]");
	By ResendOTPButton = By.xpath(
			"//button[@class ='w-[150px] px-4 py-1 text-sm rounded bg-[#F19305] text-white opacity-50 cursor-not-allowed']");
	By basicInfoText = By.xpath("//div/div/div/div/span[1]");
	By first_Name = By.xpath("//div/div/form/div/div/label/div/span[1]");
	By store = By.xpath("//div/div/form/div/div/label/div[1]");
	By storeInfo = By.xpath("//div/div/form/div/div/label/div[1]");
	By storeName = By.cssSelector("input[name='storeName']");

	public void getWaitTimeForErrorLoginText() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(errorLoginText));
		driver.findElement(errorLoginText).isDisplayed();
	}

	public void getScrollPage() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,100)");
		// https://seller.trialshopy.com/account/become-seller-growth
	}

	public void getYopMailWaitTime() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(goButtonOnYopMail));
	}

	public void getYopMailScrollPage() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,300)");
		// https://seller.trialshopy.com/account/become-seller-growth
	}

	public void getYopMailOTPPage() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(waitForYopMailOTPPage));
	}

	public void OTPSentNotification() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ResendOTPButton));

	}

	public void waitForBasicInfoPage() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementWithText(basicInfoText, "1000+"));
	}

	public void waitForBusinessInfoPage() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementWithText(first_Name, "First Name"));
	}

	public void waitForTheVerificationPage() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementWithText(storeInfo, "Store:"));
	}

	public void waitForStoreNameDisplay() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(store)));
	}

}
