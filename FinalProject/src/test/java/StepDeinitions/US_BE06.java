package StepDeinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import PageObjects.po_US_BE06;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class US_BE06 {
	WebDriver driver = Hook.driver;	
	po_US_BE06 mngtSubPage;
	@Given("^At the Backend page$")
	public void at_the_Backend_page() throws Exception {
		mngtSubPage = new po_US_BE06(driver);
	   
	}
	@When("^I click link Dang ky nhan tin$")
	public void i_click_link_Dang_ky_nhan_tin() throws Exception {
		mngtSubPage.linkMngtSub.click();
	}

	@Then("^I should see list of Subscriber$")
	public void i_should_see_list_of_Subscriber() throws Exception {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		Assert.assertTrue(mngtSubPage.tableSub != null);
	}

	@Then("^Email sorted by alphabet$")
	public void email_sorted_by_alphabet() throws Exception {
		String prevEmail = "", email = "";
		WebElement statusActive, statusInactive;
		for(WebElement row : mngtSubPage.subRows) {
			email = row.findElements(By.xpath("td")).get(0).getText();
			statusActive = row.findElement(By.xpath("//i[@class=\"fa fa-check\"]"));
			statusInactive = row.findElement(By.xpath("//i[@class=\"fa fa-remove\"]"));
			Assert.assertFalse(statusActive == null && statusInactive == null);
			Assert.assertTrue(email.compareToIgnoreCase(prevEmail)>= 0);
			
			
		}
	}

	

	
}
