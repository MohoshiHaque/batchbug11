package batchclass11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	
	WebDriver driver;
	
	
	@BeforeTest
	
	public void init() {
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@Test(priority=2)
	
	public void TestTitle1() {
		String ExpectedTitle="Swag Labs";
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle,ExpectedTitle);
	}
	
	@Test(priority=1)
	public void TestUrl() {
		String ExpectedUrl="Swag Labs";
		String ActualUrl=driver.getCurrentUrl();
		System.out.println(ActualUrl);
		Assert.assertEquals(ActualUrl,ExpectedUrl);
	}
	
@AfterTest
	
	public void end() {
		
		driver.quit();
	}
	

}
