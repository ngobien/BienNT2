package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class po_RegisterReceveNews {
	
	@FindBy(xpath = "//div[@class=\"col-sm-9\"]//input[@type=\"email\"]")
	public WebElement txtUsername;
	

	@FindBy(xpath = "//div[@class=\"col-sm-3\"]//button[@class=\"next-btn-primary\"]")
	public WebElement btnLogin;
		
	
		
	
	@FindBy(xpath = "//div[@class=\"dropdown\"]//span[@class=\"content-display\"]")
	public WebElement form1;
	
	
	@FindBy(xpath = "//div[@class=\"popover-body\"]//input[@type=\"text\"]")
	public WebElement name;
	

	@FindBy(xpath = "//button[@id=\"allow-button\"]")
	public WebElement btnLogin1;
	
	 @FindBy(xpath = "//div[@class=\"popover-body\"]//div[@class=\"error\"]")
	public WebElement mess1;
	 
	 @FindBy(xpath = "//div[@class=\"closeButtonContainer\"]")
		public WebElement closeChat;
	
	
	public po_RegisterReceveNews(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
