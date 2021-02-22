package com.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass{
	@Before
	public void loadDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvaraj\\workspace\\SeacnerioOutline\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	

	
	@After
	public void driverClose(){
	driver.close();
	}
}
