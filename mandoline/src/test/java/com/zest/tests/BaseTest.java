package com.zest.tests;

import org.testng.annotations.Test;

import com.zest.pages.BasePage;
import com.zest.utils.BaseD;
import com.zest.utils.BaseD.DriverType;
import com.zest.utils.Utils;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

  public WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  Utils.navigteToSite("https://www.freecrm.com/index.html");
	  Utils.maximizeWindow();
  }

  @BeforeSuite
  public void beforeSuite() {
	  driver=BaseD.openBrowser(DriverType.CHROME);
	  BasePage basePage=new BasePage();
	  basePage.setDriver(driver);
  }
  
  @BeforeClass
	public void befclass(){
		System.out.println("parent class before class");
	}

}
