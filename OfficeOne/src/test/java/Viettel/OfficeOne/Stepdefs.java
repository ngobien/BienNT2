package Viettel.OfficeOne;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.o_TestLogin;

public class Stepdefs {
	
	WebDriver dr;
	o_TestLogin obj;
	@Before
	public void StartTest()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		dr = new ChromeDriver(); 
		obj =new o_TestLogin(dr);
	}
	@After
	public void CloseTest()
	{
		this.dr.close();
	}

	@Given("^stay in login$")
	public void stay_in_login() throws Exception {
		this.dr.get("http://203.190.173.64:6868/_layouts/office/login/default.aspx");
		obj.txtUserName.clear();
		obj.txtPassWord.clear();
	}

	@When("^not enter user and pass$")
	public void not_enter_user_and_pass() throws Exception {
		obj.txtUserName.sendKeys("");
		obj.txtPassWord.sendKeys("");
	}

	@When("^click login$")
	public void click_login() throws Exception {
	    obj.btnDangNhap.click();
	}

	@Then("^show messenger \"([^\"]*)\"$")
	public void show_messenger(String arg1) throws Exception {
		String lbuser =obj.lbuser.getText();
		assertEquals("Bạn chưa nhập tên đăng nhập.", lbuser);
	}

	@When("^valid user and not pass$")
	public void valid_user_and_not_pass() throws Exception {
		obj.txtUserName.sendKeys("vtho");
		obj.txtPassWord.sendKeys("");
	}
	@Then("^show messenger pass \"([^\"]*)\"$")
	public void show_messenger_pass(String arg1) throws Exception {
		String lbpass =obj.lbpass.getText();
		assertEquals("Bạn chưa nhập mật khẩu", lbpass);
	}


	@When("^input valid user and invalid pass$")
	public void input_valid_user_and_invalid_pass() throws Exception {
		obj.txtUserName.sendKeys("vtho");
		obj.txtPassWord.sendKeys("abc");
	}
	@Then("^show messenger invalid \"([^\"]*)\"$")
	public void show_messenger_invalid(String arg1) throws Exception {
		String lbuserpass =obj.lbuserpass.getText();
		assertEquals("Tên đăng nhập hoặc mật khẩu không đúng.", lbuserpass);
	}

	@When("^input valid user and valid pass$")
	public void input_valid_user_and_valid_pass() throws Exception {
		obj.txtUserName.sendKeys("vtho");
		obj.txtPassWord.sendKeys("abc@1234");
	}

	@Then("^show homepage$")
	public void show_homepage() throws Exception {
	    String lbhomepage = obj.lbhomepage.getText();
	    assertEquals("THỐNG KÊ VĂN BẢN, CÔNG VIỆC CỦA CÁ NHÂN",lbhomepage);
	}

}