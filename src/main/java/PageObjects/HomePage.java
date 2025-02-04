package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	WebDriver driver;
	
	
	@FindBy(linkText = "Open New Account")
	WebElement openNewAc;
	
	@FindBy (linkText="Accounts Overview")
	WebElement accountOverview;

	@FindBy (linkText ="Transfer Funds")
	WebElement transferFund;
	
	public void clickCreateNewAc() {
		openNewAc.click();
	}

}
