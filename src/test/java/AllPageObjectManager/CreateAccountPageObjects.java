package AllPageObjectManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utils.GenericClass;

public class CreateAccountPageObjects extends GenericClass {

	public WebDriver driver;
	public WebDriverWait wait;
	String OTP;

	public CreateAccountPageObjects(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	By OTPButton = By.xpath("//button[@type='button']");
	By yopMailEmail = By.xpath("//input[@placeholder='Enter your inbox here']");
	By goYopMailButton = By.xpath("//i[@class='material-icons-outlined f36']");
	By OTPText = By.xpath("//div[@id = 'mail']");
	By getCreateAccountText = By.xpath("//p[@class='text-gray-700 text-left']");
	By OTPfield = By.cssSelector("input[Placeholder='Enter OTP']");
	By mobileNumberField = By.cssSelector("input[Placeholder='Enter Mobile Number']");
	By password = By.cssSelector("input[Placeholder='Set Password']");
	By createAccountButton = By.cssSelector("button[type='submit']");
	By ResendOTPButton = By.xpath("//button[@class ='w-[150px] px-4 py-1 text-sm rounded bg-[#F19305] text-white opacity-50 cursor-not-allowed']");

	public void clickOnOTPButton() {

		driver.findElement(OTPButton).click();

	}

	public void getOTPFromYopMail(String emailAddress) throws InterruptedException {
		OTPSentNotification();
		if (driver.findElement(ResendOTPButton).getText().contains("Resend in") ) {
			driver.navigate().to("https://yopmail.com/en/");
			getYopMailWaitTime();
			driver.findElement(yopMailEmail).sendKeys(emailAddress);
			driver.findElement(goYopMailButton).click();
			getYopMailOTPPage();
			driver.switchTo().frame(2);
			String getOTP = driver.findElement(OTPText).getText();

			OTP = getOTP.split(":-")[1].trim();

			System.out.println(OTP);
			while (true) {
				driver.navigate().back();
				Thread.sleep(2000);
				if (driver.findElements(getCreateAccountText).size() > 0) {
					break;
				}
			}

			driver.findElement(OTPfield).sendKeys(OTP);
		}
		
		else {
			System.out.println(driver.findElement(ResendOTPButton).getText());
		}
	}

	public void enterMobileNumber(String mobileNumber) {

		driver.findElement(mobileNumberField).sendKeys(mobileNumber);
	}

	public void setPassword(String passWord) {

		driver.findElement(password).sendKeys(passWord);
	}

	public void createAccountButton() {

		driver.findElement(createAccountButton).click();
	}

}
