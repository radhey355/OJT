package com.rsp.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver = null;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginbtn;
	
	//dashbord page is linked in login page
	
	public DashBoard LoginToPage() {
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginbtn.click();
		
		
//after login we are are on the dashbord page ; so we can link by here

		return	new DashBoard(driver);
	}
	
	
	
	
	
	
	
	

}
