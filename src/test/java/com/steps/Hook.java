package com.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass{
	@Before
	public void loadDriver(){
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jacki\\git\\FirstTry\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

	
	@After
	public void driverClose(){
	driver.close();
	}
}
