package Viettel.TestAutomation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test123
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
	           // System.out.println("abc");
	            WebElement btDangnhap=driver.findElement(By.xpath("//div[@class=\"mod-login-btn\"]//button[@type=\"submit\"]"));
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
	            
/*
	    
	    //Case 2: 
	    //Nhập thông tin user name
	    //Không nhập thông tin password
	    //Hiển thị thông báo lỗi bắt buộc nhập trường password
	    
	    public void secondTestCase()
	    {
	        try {
	            System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	            driver= new ChromeDriver();
	            driver.get("https://member.lazada.vn/user/login?spm=a2o4n.home.header.d5.19056afeWNz03N&redirect=https%3A%2F%2Fwww.lazada.vn%2F");
	            driver.manage().window().maximize();
	    
	            //Nhap Username    
	            //     loginpage lgPage = new loginpage(driver);
	            //      lgPage.txtUserName.sendKeys("khanh.tx@live.com");
	            System.out.println("abc");
	            WebElement userName=driver.findElement(By.xpath("//div[@class=\"mod-login\"]//input[@type=\"text\"]"));
	            userName.sendKeys("0988988568");
	            WebElement btDangnhap=driver.findElement(By.xpath("//div[@class=\"mod-login-col2\"]//button[@type=\"submit\"]"));
	            btDangnhap.click();
	        
	            WebElement alert1=driver.findElement(By.xpath("//div[@class=\"mod-login-col1\"]//span"));
	            //lay thuoc tinh cua element nay
	            String s = alert1.getText();
	            assertEquals(s, "");
	            WebElement alert2=driver.findElement(By.xpath("//div[@class=\"mod-input error mod-input-password mod-login-input-password mod-input-password\"]//span"));
	            String s1 = alert2.getText();
	            //lenh assert co nghia la kiem tra
	            assertEquals(s1, "You can't leave this empty.");
	            
	        }
	        catch(Exception ex) {
	            ex.printStackTrace();
	        }

	    }
	    
/*   //Case 3: 
	        //Nhập thông tin password
	        //Không nhập thông tin username
	        //Hiển thị thông báo lỗi bắt buộc nhập trường username
	    public void thirdTestCase()
	    {
	        try {
	            System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	            driver= new ChromeDriver();
	            driver.get("https://member.lazada.vn/user/login?spm=a2o4n.home.header.d5.19056afeWNz03N&redirect=https%3A%2F%2Fwww.lazada.vn%2F");
	            driver.manage().window().maximize();
	    
	            //Nhap Username    
	            //     loginpage lgPage = new loginpage(driver);
	            //      lgPage.txtUserName.sendKeys("khanh.tx@live.com");
	            System.out.println("abc");
	            WebElement passWord=driver.findElement(By.xpath("//div[@class=\"mod-login\"]//input[@type=\"password\"]"));
	            passWord.sendKeys("0988988568");
	            WebElement btDangnhap=driver.findElement(By.xpath("//div[@class=\"mod-login-col2\"]//button[@type=\"submit\"]"));
	            btDangnhap.click();
	        
	            WebElement alert1=driver.findElement(By.xpath("//div[@class=\\\"mod-login-col1\\\"]//span"));
	            //lay thuoc tinh cua element nay
	            String s = alert1.getText();
	            assertEquals(alert1, "You can't leave this empty.");
	            WebElement alert2=driver.findElement(By.xpath("//div[@class=\"mod-input error mod-input-password mod-login-input-password mod-input-password\"]//span"));
	            String s1 = alert2.getText();
	            //lenh assert co nghia la kiem tra
	            assertEquals(s1, "");
	            
	            
	        }
	        catch(Exception ex) {
	            ex.printStackTrace();
	        }

	    }
	    
	    //Case 4: 
	            //Nhập thông tin username 
	            //Nhập thông tin password
	            //Hiển thị thông báo lỗi tài khoản không tồn tại
	    
/*	    @Test
	    public void fourTestCase()
	    {
	        try {
	            System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	            driver= new ChromeDriver();
	            driver.get("https://member.lazada.vn/user/login?spm=a2o4n.home.header.d5.19056afeWNz03N&redirect=https%3A%2F%2Fwww.lazada.vn%2F");
	            driver.manage().window().maximize();
	    
	            //Nhap Username    
	            //     loginpage lgPage = new loginpage(driver);
	            //      lgPage.txtUserName.sendKeys("khanh.tx@live.com");
	            System.out.println("abc");
	            WebElement userName=driver.findElement(By.xpath("//div[@class=\"mod-login\"]//input[@type=\"text\"]"));
	            userName.sendKeys("0988988568");
	            WebElement passWord=driver.findElement(By.xpath("//div[@class=\"mod-login\"]//input[@type=\"password\"]"));
	            passWord.sendKeys("12345678");
	            WebElement btDangnhap=driver.findElement(By.xpath("//div[@class=\"mod-login-col2\"]//button[@type=\"submit\"]"));
	            btDangnhap.click();
	    
	            WebElement alert1=driver.findElement(By.xpath("//div[@class=\"next-feedback-content\"]"));
	            //lay thuoc tinh cua element nay
	            String s = alert1.getText();
	            assertEquals(alert1, "Đăng nhập của bạn đã thất bại quá nhiều lần, vui lòng thử lại sau một giờ.");
	            
	        }
	                
	        //văng ra lỗi nếu có lỗi xảy ra, print tại màn hình console phía dưới
	        catch(Exception ex) {
	            ex.printStackTrace();
	        }

	    }
	    
	    
	
*/



	




