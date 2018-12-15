package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class xpath_DangKyNhanTin_Testmaster {
	
	private WebDriver dr;
	
	@FindBy(xpath="//div[@class=\"mod-input\"]//div[@class=\"col-sm-9\"]//input[@type=\"email\"]")
	public WebElement txtmaildangky;
	
	@FindBy(xpath="//div[@class=\"mod-input\"]//div[@class=\"col-sm-3\"]//button[@class=\"next-btn-primary\"]")
	public WebElement btnDangKy;
	
	@FindBy(xpath = "//div[@class=\"mod-input error\"]//div[@style=\"clear:both;\"]//span")
	public WebElement lberrordangky;
	
	@FindBy(xpath = "//div[@class=\"modal fade in popover-dialog alert\"]//div[@id=\"popover\"]//div[@class=\"body-message\"]/b")
	public WebElement popupErrorMailTonTai;
	
	
	@FindBy(xpath = "//div[@class=\"dropdown open\"]//span[@class=\"content-display\"]")
	public WebElement lbfrmextra;
	

	public xpath_DangKyNhanTin_Testmaster(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}

}
