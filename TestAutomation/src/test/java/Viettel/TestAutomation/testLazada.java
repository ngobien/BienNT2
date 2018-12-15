package Viettel.TestAutomation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.RegisterLazada;

public class testLazada {

	   WebDriver dr;
	    
	    @Test
	    public void testCase1()
	    {
	    	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
	    	dr= new ChromeDriver();    	
	    	dr.get("https://member.lazada.vn/user/register?spm=a2o4n.home.header.d6.4cb96afeRcq7iM");
	    	
	    	RegisterLazada rglaza =new RegisterLazada(dr);
	    	rglaza.txtRegphone.sendKeys("0982773209");
	    	rglaza.txtRegname.sendKeys("BienNT2");
	    	rglaza.txtRegmail.sendKeys("biennt2@viettel.com.vn");
	    	rglaza.txtRegpass.sendKeys("12345678aA@");
	    	rglaza.btnRegmonth.click();
	    	rglaza.txtRegday.sendKeys("26");
	    	rglaza.txtRegyear.sendKeys("1991");
	    			
	        assertTrue( true );
	    }

}
