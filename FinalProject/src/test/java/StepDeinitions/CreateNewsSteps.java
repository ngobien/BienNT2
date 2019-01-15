package StepDeinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import PageObjects.po_CreateNewsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateNewsSteps {

	WebDriver driver = Hook.driver;
	
	po_CreateNewsPage createNewsPage;
	
	@When("^I click link soan gui tin$")
	public void i_click_link() throws Exception {
		createNewsPage = new po_CreateNewsPage(driver);
		Actions actions = new Actions(driver);
		actions.moveToElement(createNewsPage.linkCreateNews);
		Thread.sleep(2000);
		createNewsPage.linkCreateNews.click();
	}

	@When("^I click next button$")
	public void i_click_next_button() throws Exception {
		Actions actions = new Actions(driver);
		actions.moveToElement(createNewsPage.btnNext);
		Thread.sleep(2000);
		createNewsPage.btnNext.click();
	}

	@Then("^I should see the messages required fields$")
	public void i_should_see_the_messages_required_fields() throws Exception {
		int i = 0;
		for(WebElement error : createNewsPage.txtErrors){
			Assert.assertEquals(error.getText(), "This is required field");
			i ++;
		}
		Assert.assertEquals(i, 3);
		
		Assert.assertEquals(hasClass(createNewsPage.txtName, "error"),true);
		Assert.assertEquals(hasClass(createNewsPage.txtSubject, "error"),true);
		Assert.assertEquals(hasClass(createNewsPage.txtBodyError, "error"),true);
		
	}
	
	@When("^I type E character$")
	public void i_type_E_character() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Actions actions = new Actions(driver);
		actions.moveToElement(createNewsPage.txtInBody);
		Thread.sleep(1000);
	    createNewsPage.txtInBody.sendKeys("E");
	    Thread.sleep(1000);
	}

	@Then("^I should see the Email in list$")
	public void i_should_see_the_Email_in_list() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(createNewsPage.txtMergeTagHint.getText(),"Email");
	}

	@When("^I select Email from list$")
	public void i_select_Email_from_list() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    createNewsPage.txtMergeTagHint.click();
	}

	@Then("^The content will be restored as plan text$")
	public void the_content_will_be_restored_as_plan_text() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(createNewsPage.txtMergeTag.getText(),"Email");
	}


	
	public boolean hasClass(WebElement element, String cls) {
	    String classes = element.getAttribute("class");
	    for (String c : classes.split(" ")) {
	        if (c.equals(cls)) {
	            return true;
	        }
	    }

	    return false;
	}
}
