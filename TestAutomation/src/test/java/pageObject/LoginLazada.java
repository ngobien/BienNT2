package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLazada {
	
	@FindBy(css="div.mod-input-loginName>input")
	public WebElement txtLogname;
	@FindBy(css="div.mod-login-input-loginName>span")
	public WebElement lbUserNameError;
	
	@FindBy(css="div.mod-login-input-password>input[type=password]")
	public WebElement txtLogpass;
	@FindBy(css="div.mod-login-input-password>span")
	public WebElement lbPasswordError;
	
	@FindBy(css="button.next-btn-primary")
	public WebElement btnSubmit;
	
	public WebElement btnLogin;
	@FindBy(css="div.next-feedback-toast")
	public WebElement pnlNotifier;
	@FindBy(css="div.next-feedback-toast .next-feedback-content")
	public WebElement lbNotification;
	
	private WebDriver dr;
	public LoginLazada(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}

}
