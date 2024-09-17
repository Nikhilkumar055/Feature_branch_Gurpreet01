package Utils;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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
	By NotificationOfOTPSent = By.cssSelector("div[aria-live='polite']");
	
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(NotificationOfOTPSent));
		
	}

}
