package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static void type(WebElement element,String text){
		element.sendKeys(text);
	}
	public static void click(WebElement element){
		element.click();
	}
	
	public static void url(String url){
		driver.get(url);
	}
	
}
