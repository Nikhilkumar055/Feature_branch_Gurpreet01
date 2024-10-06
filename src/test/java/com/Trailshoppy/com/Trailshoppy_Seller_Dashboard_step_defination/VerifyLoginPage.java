package com.Trailshoppy.com.Trailshoppy_Seller_Dashboard_step_defination;

import AllPageObjectManager.LoginPageObjects;
import AllPageObjectManager.PageObjectManager;
import AllPageObjectManager.SellerHomePageObjects;
import AllPageObjectManager.SellerInfoPageObjects;
import AllPageObjectManager.UnsuccessfulLoginPageObjects;
import Utils.GenericClass;
import Utils.TextContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyLoginPage {
	TextContextSetUp textContextSetUp;
	PageObjectManager pageObjects;
	LoginPageObjects loginPageObj;
	SellerHomePageObjects homePageDisplay;

	public VerifyLoginPage(TextContextSetUp textContextSetUp) {

		this.textContextSetUp = textContextSetUp;
	}

	@Given("the user is on the seller info page and navigates to login page by clicking the login button")
	public void the_user_is_on_the_seller_info_page_and_navigates_to_login_page_by_clicking_the_login_button() {

		SellerInfoPageObjects sellerInfo = textContextSetUp.pageObjects.goToLoginPage();
		sellerInfo.clickOnLoginButtonFromSellerInfo();
	}

	@When("the user enters valid {string} and {string}")
	public void the_user_enters_valid_and(String email, String password) {

		loginPageObj = textContextSetUp.pageObjects.fillUpLoginPage(email, password);
		loginPageObj.enterLoginCredentials(email, password);

	}

	@When("clicks the login button")
	public void clicks_the_login_button() {

		loginPageObj = textContextSetUp.pageObjects.clickLoginButtonPage();
		loginPageObj.clickOnLoginButton();

	}

	@Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {

		homePageDisplay = textContextSetUp.pageObjects.verifyHomePageDisplay();
		homePageDisplay.verifyHomePageAfterSuccessfulLogin();

	}
	
	
	//UnsuccessfulLogin
	@When("the user enters invalid {string} and second time invalid {string}")
	public void the_user_enters_invalid_and_second_time_invalid(String invalidEmail, String invalidPassword) {
	    loginPageObj = textContextSetUp.pageObjects.fillUpLoginPage(invalidEmail, invalidPassword);
	    loginPageObj.enterLoginCredentials(invalidEmail, invalidPassword);
	}
	
	@Then("an error message should be displayed")
	public void an_error_message_should_be_displayed() {
//		GenericClass genericClass = textContextSetUp.pageObjects.waitForElement();
//		genericClass.getWaitTime();
		UnsuccessfulLoginPageObjects unsuccessLogin = textContextSetUp.pageObjects.verifyLoginErrorMsg();
		unsuccessLogin.verifyUnsuccessfulLogin();
	    
	}
	
	@Then("User clicks on the logout button")
	public void user_clicks_on_the_logout_button() {
		
		
	}


}
