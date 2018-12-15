package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterLazada {
	@FindBy(css="div.mod-login-input-phone>input")
	public WebElement txtRegphone;
	
	@FindBy(css ="div.mod-login-input-name>input")
	public WebElement txtRegname;
	
	@FindBy(css ="div.mod-login-input-email>input")
	public WebElement txtRegmail;
	
	@FindBy(css = "div.mod-login-input-password>input")
	public WebElement txtRegpass;
	
	@FindBy(css ="div.mod-birthday-month>input")
	public WebElement txtRegmonth;
	@FindBy(css ="div.button.mod-birthday-month>input")
	public WebElement btnRegmonth;
	
	@FindBy(css = "div.mod-birthday-day>input")
	public WebElement txtRegday;
	
	@FindBy(css = "div.mod-birthday-year>input")
	public WebElement txtRegyear;
	
	@FindBy(css ="div.button.next-btn-primary")
	public WebElement btnsubmit;

	private WebDriver dr;
	public RegisterLazada(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
}
