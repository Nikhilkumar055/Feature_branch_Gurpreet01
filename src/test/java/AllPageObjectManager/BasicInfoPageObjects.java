package AllPageObjectManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.GenericClass;

public class BasicInfoPageObjects extends GenericClass {

	public WebDriver driver;

	public BasicInfoPageObjects(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	By basicInfo = By.xpath("//div/div/div/div/span[1]");
	By store = By.xpath("//div/div/form/div/div/label/div[1]");
	By adhaar = By.xpath("//div/div/div/form/label/span[1]");
	By firstName = By.xpath("(//input[@placeholder='Enter Name'])[1]");
	By lastName = By.cssSelector("input[name='lastName']");
	By pincode = By.cssSelector("input[name='pincode']");
	By addressLine = By.cssSelector("input[name='addressLine']");
	By city = By.cssSelector("input[name='city']");
	By country = By.cssSelector("input[name='country']");
	By state = By.cssSelector("input[name='state']");
	By saveAndNext = By.cssSelector("button[type='submit']");
	By storeName = By.xpath("//input[@name='storeName']");
	By StoreDescription = By.cssSelector("input[name='storeDescription']");
	By gstNumber = By.cssSelector("input[name='gstId']");

	public void verifyUserOnBasicInfoPage() {
		waitForBasicInfoPage();
		Assert.assertEquals(driver.findElement(basicInfo).getText(), "Basic Info");

	}

	public void fillingBasicInfoPage(String first_Name, String last_Name, String pin_code, String addressline,
			String City, String State) {
		driver.findElement(firstName).sendKeys(first_Name);
		driver.findElement(lastName).sendKeys(last_Name);
		driver.findElement(pincode).sendKeys(pin_code);
		driver.findElement(addressLine).sendKeys(addressline);
		driver.findElement(city).sendKeys(City);
		driver.findElement(state).sendKeys(State);

	}

	public void SaveBasicInfoPage() {

		driver.findElement(saveAndNext).click();
	}

	public void verifyUserOnBusinessInfoPage() {
		waitForBusinessInfoPage();
//		waitForStoreNameDisplay();
		Assert.assertEquals( driver.findElement(store).getText(), "Store: ");
		

	}

	public void fillingBusinessInfoPage(String store, String storeDescription, String GSTNumber, String Pincode,
			String addressline, String City, String State, String Country) throws InterruptedException {
		Thread.sleep(2500);
		driver.findElement(storeName).sendKeys(store);
		driver.findElement(StoreDescription).sendKeys(storeDescription);
		driver.findElement(gstNumber).sendKeys(GSTNumber);
		driver.findElement(pincode).sendKeys(Pincode);
		driver.findElement(addressLine).sendKeys(addressline);
		driver.findElement(city).sendKeys(City);
		driver.findElement(state).sendKeys(State);

	}

	public void waitForVerificationPage() {
		waitForTheVerificationPage();
		Assert.assertEquals(driver.findElement(adhaar).getText(), "Enter Aadhar or VID");
	}

}
