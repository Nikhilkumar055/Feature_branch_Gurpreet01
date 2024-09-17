package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	public WebDriver WebdriverManager() {
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\Gurpreet\\eclipse-workspace\\com.Trailshoppy_Seller_Dashboard\\Feature_branch_Gurpreet01\\src\\test\\resources\\global.properties");
//		
//		Properties prop = new Properties();
//		prop.load(fis);
//		String link = prop.getProperty("URL");
//		
//		if(driver == null) {
//		
//		if(prop.getProperty("browser")=="chrome") {
//		
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		}
//		driver.get(link);
//		}
//		return driver;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://seller.trialshopy.com/");
		return driver;
		
	}

}
