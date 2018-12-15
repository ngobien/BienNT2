package Viettel.Homework;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.DangKyNhanTin_Testmaster;
import pageObject.Extra_DangKyNhanTin_Testmaster;

public class testExtra_DangKyNhanTin_Testmaster {
	
	WebDriver dr;
    DangKyNhanTin_Testmaster obj;   

    @Before
	public void InitTest()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		dr = new ChromeDriver();    
		dr.manage().window().maximize();
		dr.get("http://testmaster.vn/");
		this.obj = new DangKyNhanTin_Testmaster(this.dr);	
	}
    /*1.	Họ và tên là bắt buộc, giới tính có giá trị mặc định là Không xác định,
     *  loại tin đăng ký có giá trị mặc định là Tất cả các loại tin
     */
    @Test
    public void Extra1()
    {
		obj.txtmaildangky.sendKeys("snowangels264@gmail.com");
    	obj.btnDangKy.click();  
    	//obj.txtmaildangky.clear();
        Extra_DangKyNhanTin_Testmaster extra = new Extra_DangKyNhanTin_Testmaster(dr);
    	extra.txthoten.sendKeys("Chôm Chôm");
    	extra.btngioitinh.click();
    	extra.txtgioitinh.getCssValue("Nam");
    
    	
    	//assertTrue(result);
    }    

}
