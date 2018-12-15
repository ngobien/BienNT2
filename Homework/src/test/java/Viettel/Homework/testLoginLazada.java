package Viettel.Homework;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.LoginLazada;


public class testLoginLazada {
	
	WebDriver dr;
    LoginLazada loginLazada;
	@Before
	public void InitTest()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		dr = new ChromeDriver();    
		dr.manage().window().maximize();
		dr.get("https://member.lazada.vn/user/login");
		this.loginLazada = new LoginLazada(this.dr);
	}
/*	
	@After
	public void CloseTest()
	{
		this.driver.close();
	}
*/	
	//@Ignore
	//Không nhập user name, password, nhấn đăng nhập => KQ: hiển thị thông báo lỗi
    @Test
    public void Login_KhongNhapGi()
    {
    	loginLazada.txtUserName.clear();
    	loginLazada.txtPassword.clear();
    	loginLazada.btnLogin.click();
    	
    	String userNameError = loginLazada.lbUserNameError.getText();
    	String passwordError = loginLazada.lbPasswordError.getText();
    	
    	Boolean result = userNameError.indexOf("can't leave this empty")!=-1;
    	assertTrue(result);
    	/*
    	assertEquals(userNameError, "You can't leave this empty.");
    	assertEquals(passwordError, "You can't leave this empty.");
    	*/
    }
    // tài khoản không tồn tại
    @Test
    public void Check_login_with_account_not_existed(){
    	loginLazada.txtUserName.sendKeys("khanh.tx999");
    	loginLazada.txtPassword.sendKeys("abc123");
    	loginLazada.btnLogin.click();
    	
    	assertTrue(loginLazada.pnlNotifier.isDisplayed());
    	assertEquals(loginLazada.lbNotification.getText(), "Please enter a valid phone number.");
    }
    /*
    //Nhập user đúng, password sai, nhấn đăng nhập => KQ: hiển thị thông báo lỗi
    @Test
    public void Login_UserPassDung()
    {
    	loginLazada.txtUserName.clear();
    	loginLazada.txtPassword.clear();
    	
    	LoginLazada loginLazada = new LoginLazada(dr);
    	loginLazada.txtUserName.sendKeys("snowangels264@gmail.com");
    	loginLazada.txtPassword.sendKeys("123456");
    	
    	loginLazada.btnLogin.click();
    	
    	String popupError = loginLazada.lbUserNameError.getText();
    	
    	Boolean result = popupError.indexOf("can't leave this empty")!=-1;
    	assertTrue(result);
    	/*
    	assertEquals(userNameError, "You can't leave this empty.");
    	assertEquals(passwordError, "You can't leave this empty.");
    	*/
    
}
