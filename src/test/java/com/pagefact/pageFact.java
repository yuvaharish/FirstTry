package com.pagefact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class pageFact extends BaseClass{
	
	public pageFact(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtUsername")
	private WebElement username;
	@FindBy(id="txtPassword")
	private WebElement password;
	@FindBy(id="btnLogin")
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
