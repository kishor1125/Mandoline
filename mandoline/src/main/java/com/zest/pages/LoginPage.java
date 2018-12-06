package com.zest.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zest.utils.BaseD;
import com.zest.utils.Utils;

public class LoginPage {

	
	@FindBy(xpath="//input[@name='username']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	public WebElement loginButton;
	
	
	public void loginFreeCRMSite(String userName, String password){
		this.userName.sendKeys(userName);
		this.password.sendKeys(password);
        Utils.javaScriptEditor("arguments[0].click();", loginButton);
	}
}
