package com.rsp.login;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	WebDriver driver= null;

	public UserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[text()='Users']")
	WebElement Users;
	
	

	public void clikToUser()  {
		Users.click();
		
		
	
		
	}

}
