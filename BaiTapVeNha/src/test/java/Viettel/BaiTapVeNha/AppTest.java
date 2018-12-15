package Viettel.BaiTapVeNha;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
WebDriver driver;

//Case 1: Không nhập dữ liệu tại trường nào, nhấn Submit ==> Thông báo lỗi tương ứng phải hiện lên
public void firstTestCase()
{
    try {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver= new ChromeDriver();

        //    driver= new FirefoxDriver();

        driver.get("https://member.lazada.vn/user/login?spm=a2o4n.home.header.d5.19056afeWNz03N&redirect=https%3A%2F%2Fwww.lazada.vn%2F");
        driver.manage().window().maximize();

        //Nhap Username    
        //     loginpage lgPage = new loginpage(driver);
        //      lgPage.txtUserName.sendKeys("khanh.tx@live.com");
        System.out.println("abc");
        WebElement btDangnhap=driver.findElement(By.xpath("//div[@class=\"mod-login-col2\"]//button[@type=\"submit\"]"));
        btDangnhap.click();
        //get element alert
        //lay control cua moi element
        WebElement alert=driver.findElement(By.xpath("//div[@class=\"mod-login-col1\"]//span"));
        //lay thuoc tinh cua element nay
        String s = alert.getText();
        System.out.println("abc:" + s);
        assertEquals(s, "You can't leave this empty");
    }
    catch(Exception ex) {
        ex.printStackTrace();
    }
}
}

