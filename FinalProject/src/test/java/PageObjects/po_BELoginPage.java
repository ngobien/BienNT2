package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class po_BELoginPage {
	
	@FindBy(xpath = "//input[@type=\"email\"]")
	public WebElement txtUsername;
	
	@FindBy(xpath = "//input[@type=\"password\"]")
	public WebElement txtPassword;

	@FindBy(xpath = "//div[@class=\"row-command\"]//button[@class=\"btn-primary btn-login\"]")
	public WebElement btnLogin;
		
	@FindBy(xpath = "//a[@class=\"logo\"]")
	public WebElement logo;
		
	
	
	
	
	public po_BELoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
