package com.Trailshoppy.com.Trailshoppy_Seller_Dashboard_step_defination;

import AllPageObjectManager.BasicInfoPageObjects;
import AllPageObjectManager.CreateAccountPageObjects;
import AllPageObjectManager.PageObjectManager;
import AllPageObjectManager.SignUpPageObjects;
import Utils.TextContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifySignUpPage {

	public TextContextSetUp textContextSetUp;
	public PageObjectManager pageObjectManager;
	SignUpPageObjects signUpPageObjects;
	CreateAccountPageObjects createAccountPageObjects;
	BasicInfoPageObjects basicInfoPageObjects;

	public VerifySignUpPage(TextContextSetUp textContextSetUp) {
		this.textContextSetUp = textContextSetUp;
	}

	@Given("the user is on the seller info page")
	public void the_user_is_on_the_seller_info_page() {

	}

	@When("User enter {string} and clicks on start selling button")
	public void user_enter_and_clicks_on_start_selling_button(String sellingEmailAddress) throws InterruptedException {

		signUpPageObjects = textContextSetUp.pageObjects.goToSignUpPage();
		signUpPageObjects.startSelling(sellingEmailAddress);
	}

	@Then("User successfully lands on sign up page")
	public void user_successfully_lands_on_sign_up_page() {
		signUpPageObjects = textContextSetUp.pageObjects.goToSignUpPage();
		signUpPageObjects.verifyLandOnCreateAccount();
	}

	@Then("user click on Send OTP button to receive OTP on {string} and enters the OTP")
	public void user_click_on_send_otp_button_to_receive_otp_on_and_enters_the_otp(String emailAddress)
			throws InterruptedException {
		createAccountPageObjects = textContextSetUp.pageObjects.verifyOTPForUser();
		createAccountPageObjects.clickOnOTPButton();
		createAccountPageObjects.getOTPFromYopMail(emailAddress);

	}

	@When("User enters the Ten Digit {string}")
	public void user_enters_the_ten_digit(String mobileNumber) {
		createAccountPageObjects.enterMobileNumber(mobileNumber);
	}

	@When("User enter the {string}")
	public void user_enter_the(String passWord) {
		createAccountPageObjects.setPassword(passWord);
	}

	@When("User click on create Account button")
	public void user_click_on_create_account_button() {
		createAccountPageObjects.createAccountButton();
	}

	@When("user navigates to the Basic info page")
	public void user_navigates_to_the_basic_info_page() {
		basicInfoPageObjects = textContextSetUp.pageObjects.verifyUserLandsOnBasicInfoPage();
		basicInfoPageObjects.verifyUserOnBasicInfoPage();

	}

	@When("User enters the {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_enters_the_and(String firstName, String lastName, String pincode, String addressline, String city,
			String state) {
		basicInfoPageObjects.fillingBasicInfoPage(firstName, lastName, pincode, addressline, city, state);
	}

	@When("User clicks on the save and next button")
	public void user_clicks_on_the_save_and_next_button() {
		basicInfoPageObjects.SaveBasicInfoPage();
	}

	@When("User navigates to the business info page")
	public void user_navigates_to_the_business_info_page() {
		basicInfoPageObjects.verifyUserOnBusinessInfoPage();
	}

	@When("User enters {string}, {string}, {string},{string},{string}, {string}, {string} and {string}")
	public void user_enters_and(String store, String storeDescription, String GSTNumber, String pincode,
			String bAddressLine, String bcity, String bstate, String bcountry) throws InterruptedException {
		basicInfoPageObjects.fillingBusinessInfoPage(store, storeDescription, GSTNumber, pincode, bAddressLine, bcity,
				bstate, bcountry);
	}

	@Then("User navigates to verification page")
	public void user_navigates_to_verification_page() {
		
		basicInfoPageObjects.waitForVerificationPage();

	}

}
