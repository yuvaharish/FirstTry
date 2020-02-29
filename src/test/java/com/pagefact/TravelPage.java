package com.pagefact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class TravelPage extends BaseClass {
	
	public TravelPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[@name='email'])[1]")
	private WebElement username;
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	@FindBy(xpath="//*[@type='submit']")
	private WebElement loginbutton;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	

}
