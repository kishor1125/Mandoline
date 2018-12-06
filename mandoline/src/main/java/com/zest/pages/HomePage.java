package com.zest.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath="//td[@class='logo_text']")
	public WebElement CRM_logo_name;
	
	
	
	public String crmApplicationType(){
		return CRM_logo_name.getText().trim();
	}

}
