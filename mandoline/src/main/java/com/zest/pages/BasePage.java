package com.zest.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

	public WebDriver driver;
	
	public WebDriver getDriver(){
		return driver;
	}
	public void setDriver(WebDriver driver){
		this.driver=driver;
	}
}
