package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import AllPageObjectManager.PageObjectManager;

public class TextContextSetUp {
	
	
	public WebDriver driver;
	public PageObjectManager pageObjects;
	public TestBase testBase;
	
	public TextContextSetUp() throws IOException {
		testBase = new TestBase();
		pageObjects = new PageObjectManager(testBase.WebdriverManager());
		
		
		
	}

}
