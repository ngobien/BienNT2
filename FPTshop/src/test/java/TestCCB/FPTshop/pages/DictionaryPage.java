package TestCCB.FPTshop.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://fptshop.com.vn/")
public class DictionaryPage extends PageObject {

    @FindBy(xpath="//ul[@class=\"fs-mnul clearfix\"]//li//a[@href=\"/dien-thoai\"]")
    private WebElementFacade Dienthoai;
    public void ClickLink_Dienthoai() {
        Dienthoai.click();
    }

    @FindBy(xpath="//ul[@class=\"fs-mnul clearfix\"]//li//a[@href=\"/dien-thoai\"]")
    private WebElementFacade Dienthoai1;
    public void ClickLink_Dienthoai1() {
        Dienthoai.click();
    }
    
  /*  
    @FindBy(name="go")
    private WebElementFacade lookupButton;

    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }
    */
}