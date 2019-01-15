package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class o_TestLogin {
	
	private WebDriver driver;

	@FindBy(xpath ="//div[@class=\"ms-input\"]//input[@id=\"ctl00_PlaceHolderMain_loginControl_UserName\"]")
	public WebElement txtUserName;
	
	@FindBy(xpath="//div[@class=\"ms-input\"]//input[@id=\"ctl00_PlaceHolderMain_loginControl_password\"]")
	public WebElement txtPassWord;
	
	@FindBy(xpath="//div[@class=\"bgcontent_login_bottom\"]//input[@id=\"ctl00_PlaceHolderMain_loginControl_login\"]")
	public WebElement btnDangNhap;

	@FindBy(xpath="//*[contains(text(),'Bạn chưa nhập tên đăng nhập')]")
	public WebElement lbuser;
	@FindBy(xpath="//*[contains(text(),'Bạn chưa nhập mật khẩu')]")
	public WebElement lbpass;
	@FindBy(xpath="//*[contains(text(),'Tên đăng nhập hoặc mật khẩu không đúng.')]")
	public WebElement lbuserpass;
	
	@FindBy(xpath="//span[@id=\"pStatistic1_header_hd-textEl\"]")
	public WebElement lbhomepage;

	public o_TestLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
