package com.zest.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.zest.pages.LoginPage;

public class LoginTest extends BaseTest{

	public LoginPage loginPage;
	@Test
	public void login(){
		loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginFreeCRMSite("petergrandhi", "FreeCrm@148");
	}
	
	/*@BeforeClass
	public void befclass(){
		System.out.println("child class before class");
	}*/
	
}
