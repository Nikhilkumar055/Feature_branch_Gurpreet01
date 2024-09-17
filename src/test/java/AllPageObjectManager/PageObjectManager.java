package AllPageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.GenericClass;

public class PageObjectManager {

	public WebDriver driver;
	public WebDriverWait wait;
	public SellerInfoPageObjects sellerInfo;
	public LoginPageObjects loginPageObj;
	public SellerHomePageObjects sellerHomePageObje;
	public UnsuccessfulLoginPageObjects unsuccessLogin;
	public GenericClass gc;
	public SignUpPageObjects signUpPageObjects;
	public CreateAccountPageObjects createAccountPageObjects;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;
	}

	public SellerInfoPageObjects goToLoginPage() {

		sellerInfo = new SellerInfoPageObjects(driver);
		return sellerInfo;
	}

	public LoginPageObjects fillUpLoginPage(String email, String password) {

		loginPageObj = new LoginPageObjects(driver);
		return loginPageObj;
	}

	public LoginPageObjects clickLoginButtonPage() {

		loginPageObj = new LoginPageObjects(driver);
		return loginPageObj;
	}

	public SellerHomePageObjects verifyHomePageDisplay() {

		sellerHomePageObje = new SellerHomePageObjects(driver);
		return sellerHomePageObje;

	}

	public UnsuccessfulLoginPageObjects verifyLoginErrorMsg() {

		unsuccessLogin = new UnsuccessfulLoginPageObjects(driver, wait);
		return unsuccessLogin;

	}

	public SignUpPageObjects goToSignUpPage() {

		signUpPageObjects = new SignUpPageObjects(driver);
		return signUpPageObjects;

	}

	public GenericClass waitForElement() {

		gc = new GenericClass(driver);
		return gc;

	}

	public CreateAccountPageObjects verifyOTPForUser() {

		createAccountPageObjects = new CreateAccountPageObjects(driver);
		return createAccountPageObjects;
	}
}
