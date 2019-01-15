package StepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.o_Login;

public class Stepdefs {
	
	WebDriver dr;
	o_Login obj;
	
	@Before
	public void StartTest()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		dr = new ChromeDriver(); 
		obj =new o_Login(dr);
		//
	}
 
	@Given("^I am staying login page$")
	public void i_am_staying_login_page() throws Exception {
		dr.get("http://testmaster.vn/Account/Login");
	}

	@When("^input I give invalid username and blank value for password$")
	public void input_I_give_invalid_username_and_blank_value_for_password()  throws Exception 
	{
		obj.txtUserName.sendKeys("abc");
		obj.txtPassWord.sendKeys("");
	}

	@When("^I do login$")
	public void i_do_login()  throws Exception
	{
		obj.btnDangNhap.click();
	}

	@Then("^I should see the error tooltip \"([^\"]*)\"$")
	public void i_should_see_the_error_tooltip(String arg1) throws Exception 
	{
		String tooltipuser = obj.txtUserName.getAttribute("data-original-title");
		assertEquals(tooltipuser, arg1);
	}

	@Then("^\"([^\"]*)\" place password$")
	public void messeger(String arg1)  throws Exception 
	{
		String tooltippass = obj.txtPassWord.getAttribute("data-original-title");
		assertEquals(tooltippass, arg1);
	}
}