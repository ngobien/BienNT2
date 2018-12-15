package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class o_Login {
	private WebDriver driver;

	@FindBy(xpath ="//div[@class=\"login-form\"]//div[@class=\"row\"]//input[@type=\"email\"]")
	public WebElement txtUserName;
	
	@FindBy(xpath="//div[@class=\"login-form\"]//div[@class=\"row\"]//input[@type=\"password\"]")
	public WebElement txtPassWord;
	
	@FindBy(xpath="//div[@class=\"login-form\"]//div[@class=\"row-command\"]//button[@class=\"btn-primary btn-login\"]")
	public WebElement btnDangNhap;


	public o_Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
