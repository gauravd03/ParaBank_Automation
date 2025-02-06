package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.RegisterPage;

public class TC1_User_Registration {

	WebDriver driver;
	RegisterPage obj;
	
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		obj=new RegisterPage(driver);
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Registration()  {
		obj.enterName("Gaurav", "L");
		obj.enterCityAddressStateZip("pune", "l road", "Maharashtra", "112");
		obj.phoneNoUsernameSSN("8888888888", "234", "Gaurasvk");
		obj.enterPassword("Gaurav@123", "Gaurav@123");
	
		obj.clickRegister();
		
		String expectedMessge="Your account was created successfully. You are now logged in.";
		String ActualMessage=obj.getSuccessMsg();
		Assert.assertEquals(ActualMessage, expectedMessge);
	}
	
	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
}
