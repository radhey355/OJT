package com.rsp.testpage;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.rsp.login.DashBoard;
import com.rsp.login.LoginPage;
import com.rsp.login.UserPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {
	WebDriver driver= null;
	
	LoginPage lp=null;
	DashBoard db= null;
	UserPage up= null;
	
	@BeforeSuite
	public void UserLogin() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/JARS/selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
	}
	@Test
	public void Test01() {
		 lp= new LoginPage(driver) ;
		db=	lp.LoginToPage();
		
	}
	@Test
	public void Test02() {
		ArrayList<String> expected= new ArrayList<String>();
	    expected.add("Selenium");
	    expected.add("Java / J2EE");
	    expected.add("Python");
	    expected.add("Php");
	    
	    db.VerifyCourses();
	}
	
   @Test
   public void Test03() {
	   up= new UserPage(driver);
	   up.clikToUser();
	  
   }
}
