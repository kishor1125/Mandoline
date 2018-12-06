package com.zest.utils;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils extends BaseD{

	public static void navigteToSite(String url){
		driver.get(url);
	}
	
	public static void javaScriptEditor(String script, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript(script,element );
		
	}
	public static void maximizeWindow(){
		driver.manage().window().maximize();
	}
	
	public static void simplyWait(long sec, TimeUnit unit){
		driver.manage().timeouts().implicitlyWait(sec, unit);
	}
	
	public static void pageLoadingWait(long sec, TimeUnit unit){
		driver.manage().timeouts().pageLoadTimeout(sec, unit);
	}
	
	
}
