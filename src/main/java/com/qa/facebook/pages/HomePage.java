package com.qa.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.facebook.base.BasePage;

public class HomePage extends BasePage{
	
	
	//1]PageObject
	
	@FindBy(xpath="(//*[contains(text(),'Murari Kumar')])[1]")
	WebElement userNameText;
	
	//2]Constructor
	HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//3]Member Function
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyAccount() {
		return userNameText.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
