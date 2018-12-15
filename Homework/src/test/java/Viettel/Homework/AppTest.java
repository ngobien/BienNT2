package Viettel.Homework;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import pageObject.xpath_DangKyNhanTin_Testmaster;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver dr;
    xpath_DangKyNhanTin_Testmaster obj;   
    @Before
	public void InitTest()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		dr = new ChromeDriver();    
		//dr.manage().window().maximize();
		dr.get("http://testmaster.vn/");
		this.obj = new xpath_DangKyNhanTin_Testmaster(this.dr);		
	}
    /*
    //1.	Thông báo email không hợp lệ cho các trường hợp người dùng ko nhập Email hoặc nhập nội dung ko phải là email.
	@Test
    public void Dangky_KhongNhapGi()
    {
    	obj.txtmaildangky.clear();
    	//obj.txtmaildangky.sendKeys("abc");
    	obj.btnDangKy.click();   	
    	String lberror = obj.lberrordangky.getText();    	
    	//Boolean result = lberror.indexOf("* Email không đúng định dạng")!=-1;
    	//assertTrue(result);
    	assertEquals(lberror, "* Email không đúng định dạng");
    }  
    */
	/*
    //2.	Thông báo email đã tồn tại nếu dùng một email đã được sử dụng
	@Test
    public void Dangky_MailDaTonTai()
    {
    	obj.txtmaildangky.clear();
    	obj.txtmaildangky.sendKeys("snowangels264@gmail.com");
    	obj.btnDangKy.click();   	
    	String lberror1 = obj.popupErrorMailTonTai.getText();	
    	assertEquals(lberror1, "snowangels264@gmail.com");
    } 
    */
	//3.	Mở form extra information nếu email là hợp lệ và chưa dc sử dụng
    @Test
    public void Dangky_MailHopLe()
    {
    	obj.txtmaildangky.clear();
    	obj.txtmaildangky.sendKeys("snwrewerewh4yt23423@gmail.com");
    	obj.btnDangKy.click();   	
    	String lbextra = obj.lbfrmextra.getText();
    	//assertEquals(lbextra, "Không xác định");
    	Boolean result = lbextra.indexOf("Không xác định")!=-1;
    	Assert.assertTrue(result);
    } 
}
