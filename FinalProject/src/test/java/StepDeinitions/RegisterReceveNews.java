package StepDeinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import PageObjects.po_RegisterReceveNews;


public class RegisterReceveNews {

	WebDriver driver = Hook.driver;
	po_RegisterReceveNews loginPage;

	@Before
	public void StartTest() {
		loginPage = new po_RegisterReceveNews(Hook.driver);
	}

	@After
	public void EndTest(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshot = ((RemoteWebDriver) this.driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
	}

	@Given("^I am staying at testmaster\\.vn$")
	public void i_am_staying_at_testmaster_vn() throws Exception {
		driver.get("http://testmaster.vn");
	}

	@When("^I give the valid email$")
	public void i_give_the_valid_email() throws Exception {
		Actions actions = new Actions(driver);
		actions.moveToElement(loginPage.txtUsername);
		loginPage.txtUsername.sendKeys("abc123@gmail.com");	
	}

	@When("^I do login$")
	public void i_do_login() throws Exception {
		loginPage.btnLogin.click();
	}

	
	@Then("^I should see the form other$")
	public void i_should_see_the_form_other() throws Exception {
		Thread.sleep(3000);
		WebElement element =  driver.findElement( By.xpath("//button[@id=\"ddlGender\"]" ));
		assertEquals("Không xác định", element.getText());
	}
	
	@When("^I give the invalid name$")
	public void i_give_the_invalid_name() throws Exception {
		loginPage.name.sendKeys("");
		Thread.sleep(1000);
		WebElement element =  driver.findElement( By.xpath("//button[@id=\"allow-button\"]" ));
		System.out.println("element:" + element.getText());
		element.click();
	}

	@Then("^I should see invalid message$")
	public void i_should_see_invalid_message() throws Exception {
		String s1 = loginPage.mess1.getText();
		assertEquals("This is required field", s1);
	}

	@When("^I give the valid name$")
	public void i_give_the_valid_name() throws Exception {
		loginPage.name.sendKeys("abc");
		loginPage.btnLogin1.click();
	}

	@Then("^I should see success$")
	public void i_should_see_success() throws Exception {
		Thread.sleep(3000);
		WebElement element =  driver.findElement( By.xpath("//div[@class=\"body-message\"]" ));
		System.out.println("abcalert:" + element.getText());
		assertEquals("Bạn đã đăng ký nhận bản tin thành công. Hãy kiểm tra Email để xác nhận việc đăng ký", element.getText());
	} 
}
