package com.zest.tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zest.pages.HomePage;
import com.zest.pages.LoginPage;
import com.zest.utils.Utils;

public class HomePageTest extends BaseTest{
	
	public HomePage homePage;
	
	public LoginPage loginPage;
	@Test
	public void login(){
		loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginFreeCRMSite("petergrandhi", "FreeCrm@148");
	}

	@Test
	public void checkLoggedInUser() throws InterruptedException{
		
		homePage=PageFactory.initElements(driver, HomePage.class);
		int noOfFrames=driver.findElements(By.tagName("frame")).size();
		System.out.println("frames count :"+noOfFrames);
		
		Thread.sleep(30000);
		Utils.pageLoadingWait(10000, TimeUnit.SECONDS);
		System.out.println("Logged In user is :"+homePage.crmApplicationType());
		Assert.assertEquals(homePage.crmApplicationType(), "CRMPRO");
	}
}
