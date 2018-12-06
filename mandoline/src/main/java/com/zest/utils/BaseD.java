package com.zest.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseD {
	
	public enum DriverType{
		FIREFOX, CHROME, IE;
	}

	public static WebDriver driver;
	
	public static WebDriver openBrowser(DriverType driverType) {
		switch (driverType) {
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "/Users/kishorerapaka/Downloads/geckodriver");
			driver = new FirefoxDriver();
			break;
		case CHROME:
			System.setProperty("webdriver.chrome.driver","/Users/kishorerapaka/Downloads/chromedriver");
			driver = new ChromeDriver();
			break;
		case IE:
			//System.setProperty("webdriver.chrome.driver","/Users/kishorerapaka/Downloads/chromedriver");
			//driver = new InternetExplorerDriver();
			//break;
		default:
			System.out.println("browser : " + driverType + " is invalid, Launching Firefox as browser of choice..");
			System.setProperty("webdriver.gecko.driver","/Users/kishorerapaka/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}
		return driver;
	}

}
	
	
