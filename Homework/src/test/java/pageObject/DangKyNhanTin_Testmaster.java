package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DangKyNhanTin_Testmaster {
	
	private WebDriver dr;
	
	@FindBy(css="div.mod-input>div.col-sm-9>input")
	public WebElement txtmaildangky;
	
	@FindBy(css="div.mod-input>div.col-sm-3>button")
	public WebElement btnDangKy;
	
	@FindBy(css = "div.mod-input>div>span")
	public WebElement lberrordangky;
	
	@FindBy(css = "body.modal-open>div.extra-subscription-form")
	public WebElement frmextra;
	
	@FindBy(css = "div#popover>div.popover-body>div.col-sm-5>div.dropdown>button#ddlGender>span.content-display")
	public WebElement lbformextra;
	
	public DangKyNhanTin_Testmaster(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}

}
