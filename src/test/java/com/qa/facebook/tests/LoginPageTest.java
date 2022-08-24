package com.qa.facebook.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.facebook.base.BasePage;
import com.qa.facebook.constants.Constants;
import com.qa.facebook.pages.LoginPage;

public class LoginPageTest {
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	LoginPage loginPage;
	
	@BeforeMethod
	public void setUp() {
		
		basePage = new BasePage();
		
		prop = basePage.initialize_Properties();
		
		driver = basePage.initialize_driver(prop);
		
		loginPage = new LoginPage(driver);
		
	}
	
	@Test(priority=1)
	public void verifyLoginPageTitle() {
		String title = loginPage.getLoginPageTitle();
		
		System.out.println("The login page title is:"+title);
		
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);		
	}	
	
	@Test(priority=2)
	public void loginTestWithCorrectCredentials() {
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	

}
