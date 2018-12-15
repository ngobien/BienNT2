package Viettel.Homework;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.DangKyNhanTin_Testmaster;

public class testDangKyNhanTin_Testmaster {
	
/*
	WebDriver dr;
    DangKyNhanTin_Testmaster obj;   
    @Before
	public void InitTest()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		dr = new ChromeDriver();    
		//dr.manage().window().maximize();
		dr.get("http://testmaster.vn/");
		this.obj = new DangKyNhanTin_Testmaster(this.dr);		
	}
/*
    @After
	public void CloseTest()
	{
		this.dr.close();
	}
*/
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
    //2.	Thông báo email đã tồn tại nếu dùng một email đã được sử dụng
    //3.	Mở form extra information nếu email là hợp lệ và chưa dc sử dụng
*/
 /*
    @Test
    public void Dangky_Mailhople()
    {
    	
    	//obj.txtmaildangky.clear();
    	obj.txtmaildangky.sendKeys("chomcho2@gmail.com");
    	obj.btnDangKy.click();   	
    	String lbformextra = obj.lbformextra.getText();   
    	assertEquals(lbformextra, "Không xác định");
    }   
*/

	 //Case 4: 
    //Nhập thông tin username 
    //Nhập thông tin password
    //Hiển thị thông báo lỗi tài khoản không tồn tại

@Test
public void fourTestCase()
{
try {
    System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://testmaster.vn/");
    driver.manage().window().maximize();

    //Nhap Username    
    //     loginpage lgPage = new loginpage(driver);
    //      lgPage.txtUserName.sendKeys("khanh.tx@live.com");
   // System.out.println("abc");
    WebElement userName=driver.findElement(By.xpath("//div[@class=\"col-sm-9\"]//input[@type=\"email\"]"));
    userName.sendKeys("bienngo2rytfytf64@gmail.com");
    WebElement dangky=driver.findElement(By.xpath("//div[@class=\"col-sm-3\"]//button[@class=\"next-btn-primary\"]"));
   dangky.click();
   WebElement alert1=driver.findElement(By.xpath("//div[@class=\"dropdown open\"]//span[@class=\"content-display\"]"));
	String s = alert1.getText();
 assertEquals(alert1, "Không xác định");
		   
}
        
//văng ra lỗi nếu có lỗi xảy ra, print tại màn hình console phía dưới
catch(Exception ex) {
    ex.printStackTrace();
}

}}



