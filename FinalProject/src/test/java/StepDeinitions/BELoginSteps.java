package StepDeinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import PageObjects.po_BELoginPage;

public class BELoginSteps {

	WebDriver driver = Hook.driver;
	po_BELoginPage beloginPage;

	@Given("^I am staying at testmaster\\.vn/Admin$")
	public void i_am_staying_at_testmaster_vn_Admin() throws Exception {
		beloginPage = new po_BELoginPage(Hook.driver);	
		driver.get("http://testmaster.vn/Admin");
	}

	@When("^I give the invalid email$")
	public void i_give_the_invalid_email() throws Exception {
	    beloginPage.txtUsername.sendKeys("abcdef");
	}

	@When("^I do login backend$")
	public void i_do_login_backend() throws Exception {
	    beloginPage.btnLogin.click();
	}

	@Then("^The correspond messages is showed for invalid case\\.$")
	public void the_correspond_messages_is_showed_for_invalid_case() throws Exception {
		String toolTipText = beloginPage.txtUsername.getAttribute("data-original-title");
	    Assert.assertEquals(toolTipText, "Hãy nhập E-mail ở định dạng: user@email.com");
	    
	}

	@When("^I give the valid email/password$")
	public void i_give_the_valid_email_password() throws Exception {
	    beloginPage.txtUsername.sendKeys("khanh.tx@live.com");
	    beloginPage.txtPassword.sendKeys("abc123");
	}

	@Then("^I should see the Backend page$")
	public void i_should_see_the_Backend_page() throws Exception {
		Thread.sleep(1000);
		String text= beloginPage.logo.getText();
	    Assert.assertEquals(text, "Testmaster.vn - Admin");
	}


	
}
