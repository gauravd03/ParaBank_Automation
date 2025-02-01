package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id=\"customer.firstName\"]")
	WebElement FName;
	
	@FindBy (xpath="//input[@id=\"customer.lastName\"]")
	WebElement LName;

	@FindBy (xpath ="//input[@id=\"customer.address.street\"]")
	WebElement address;
	
	@FindBy (xpath="//input[@id=\"customer.address.city\"]")
	WebElement City;
	
	@FindBy (xpath="//input[@id=\"customer.address.state\"]")
	WebElement State;

	@FindBy (xpath ="//input[@id=\"customer.address.zipCode\"]")
	WebElement ZipCode;
	
	@FindBy (xpath="//input[@id=\"customer.phoneNumber\"]")
	WebElement PhoneNo;
	
	
	@FindBy (xpath="//input[@id=\"customer.ssn\"]")
	WebElement SSN;

	@FindBy (xpath ="//input[@id=\"customer.username\"]")
	WebElement UserName;
	
	@FindBy (xpath="//input[@id=\"customer.password\"]")
	WebElement Password;
	
	@FindBy (xpath="//input[@id=\"repeatedPassword\"]")
	WebElement PasswordRe;
	
	@FindBy (xpath="//input[@value=\"Register\"]")
	WebElement RehisterButton;
	
	@FindBy (xpath="//div[@id=\"rightPanel\"]/p")
	WebElement successMessage;
	
	//Actions 
	public void enterName(String Fname, String Lname){
		FName.sendKeys(Fname);
		
		LName.sendKeys(Lname);
	}
	
	public void enterCityAddressStateZip(String city, String Address, String state, String zip) {
	 address.sendKeys(Address);
	 City.sendKeys(city);
	 State.sendKeys(state);
	 ZipCode.sendKeys(zip);
	 
	}
	
	public void phoneNoUsernameSSN(String Phone, String ssn, String user) {
		PhoneNo.sendKeys(Phone);
		SSN.sendKeys(ssn);
		UserName.sendKeys(user);
	
	}
	
	public void enterPassword(String Pass,String Pass2) {
		Password.sendKeys(Pass);
		PasswordRe.sendKeys(Pass2);
	}
	
	public void clickRegister() {
		RehisterButton.click();
	}
	
	public String getSuccessMsg() {
		return successMessage.getText();
	}
}
