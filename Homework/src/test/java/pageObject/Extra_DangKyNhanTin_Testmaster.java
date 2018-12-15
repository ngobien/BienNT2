package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Extra_DangKyNhanTin_Testmaster {
	
	private WebDriver dr;
	
	@FindBy(css="div.popover-body>p>input.form-control")
	public WebElement txthoten;
	
	@FindBy(css="div.popover-body>div.col-sm-5>div.dropdown>button")
	public WebElement btngioitinh;
	
	@FindBy(css="div.popover-body>div.col-sm-5>div.dropdown>ul>li>a")
	public WebElement txtgioitinh;
	
	public Extra_DangKyNhanTin_Testmaster(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}

}
