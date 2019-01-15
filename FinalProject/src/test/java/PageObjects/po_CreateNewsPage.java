package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class po_CreateNewsPage {
	
	@FindBy(xpath = "//a[@action=\"/subscription/sendnews\"]")
	public WebElement linkCreateNews;
	
	@FindBy(xpath = "//button[@class=\"btn btn-sm btn-primary btn-next\"]")
	public WebElement btnNext;
		
	
	@FindBy(xpath = "//input[@id=\"txtName\"]")
	public WebElement txtName;
	
	@FindBy(xpath = "//input[@id=\"txtSubject\"]")
	public WebElement txtSubject;
	
	@FindBy(xpath = "//div[@class=\"note-editor note-frame panel panel-default\"]")
	public WebElement txtBody;
	@FindBy(xpath = "//div[@class=\"note-editor note-frame panel panel-default error\"]")
	public WebElement txtBodyError;
	
	@FindBy(xpath = "//div[@class=\"error\"]")
	public List<WebElement> txtErrors;
	
	
	@FindBy(xpath = "//div[@class=\"note-editable panel-body\"]")
	public WebElement txtInBody;
	
	
	@FindBy(xpath = "//div[@class=\"note-hint-item active\"]")
	public WebElement txtMergeTagHint;
	
	@FindBy(xpath = "//span[@class=\"merge-tag\" and @contenteditable=\"false\"]")
	public WebElement txtMergeTag;
	
	
	
	
	
	public po_CreateNewsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
