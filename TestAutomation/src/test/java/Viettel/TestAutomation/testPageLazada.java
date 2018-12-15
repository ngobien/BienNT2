package Viettel.TestAutomation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.RegisterLazada;

public class testPageLazada {
	
	/*
	 * Sử dụng WebDriver, mở trang Lazada.vn ở trạng thái cửa sổ to nhất (maximize),
	 * kiểm tra title của trang web có phỉa là "Lazada Vietnam" hay không?
	 * Nêú đúng thì mở trang đăng nhập, nếu không thì chuyển sang tiki.vn
	 * 	    
	 */
	  WebDriver dr;
		    @Test
		    public void testCase2()
		    {
		    	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		    	dr= new ChromeDriver();  
		    	//Mở trình duyệt
		    	dr.get("https://www.lazada.vn/");
		    	//Mở cửa sổ to nhất
		    	dr.manage().window().maximize();
		    	// Lấy title
		    	String tl = dr.getTitle();
		    	if(tl.equals("Shopping online - Buy online on Lazada.vn"))
		    	{
		    		//dr.get("https://member.lazada.vn/user/login?spm=a2o4n.home.header.d5.19056afeLXTZlH&redirect=https%3A%2F%2Fwww.lazada.vn%2F");
		    		WebElement btnDangNhap = dr.findElement(By.cssSelector("div#anonLogin a"));
		    		btnDangNhap.click();
		    	}
		    	else
		    	{
		    		//dr.get("https://tiki.vn/");
		    		dr.navigate().to("https://tiki.vn/");
		    	}

		    			
		        assertTrue( true );
		    }	    


}
