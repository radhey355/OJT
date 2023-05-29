package com.rsp.login;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
	
	WebDriver driver= null;
	public DashBoard(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//DASHBORD
	@FindBy(xpath="//h3")
	List<WebElement> courses;

	//USER PAGE
	@FindBy(xpath="span[text()='Users']")
	WebElement userBtn;
	
	//ITERATE ALL THE WEB ELEMENTS OF DASHBORD
	public  AbstractList<String> VerifyCourses() {
	    ArrayList<String> actual= new ArrayList<String>();
	    for (WebElement course : courses) {
	    	String text =course.getText();
	    	actual.add(text);
			
		}
	    return actual;
	    
	}
	public UserPage clickUser() {
		userBtn.click();
		
		return new UserPage(driver);
	}

}
