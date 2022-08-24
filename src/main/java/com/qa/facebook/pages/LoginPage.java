package com.qa.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.facebook.base.BasePage;

public class LoginPage extends BasePage{
	
	
	//1]Page Object --> PageFactory
	
	@FindBy(id="email")
	WebElement emailIdTextBox;	
	
	@FindBy(name="pass")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//*[@name='login']")
	WebElement loginButton;
	
	@FindBy(xpath="(//*[@role='button'])[2]")
	WebElement createNewAccountBtn;
	
	public WebElement getEmailIdTextBox() {
		return emailIdTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCreateNewAccountBtn() {
		return createNewAccountBtn;
	}

	
	
	//2]Create Constructor of LoginPage and Initialize your page Object
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//3]Member function/ Page Actions / Page Library
	
	
	public String getLoginPageTitle() {
	     return driver.getTitle();
	}
	
	public boolean verifyCreateNewAccountDislayed() {
		return getCreateNewAccountBtn().isDisplayed();
	}
	
	public HomePage doLogin(String un,String pwd) {
		System.out.println("Credentails"+un + "/" + pwd);
		getEmailIdTextBox().sendKeys(un);
		getPasswordTextBox().sendKeys(pwd);
		getLoginButton().click();
		return new HomePage(driver);
	}
	
	
	
	
	
	
	
	

}
