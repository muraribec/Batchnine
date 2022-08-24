package com.qa.facebook.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.facebook.base.BasePage;
import com.qa.facebook.pages.HomePage;
import com.qa.facebook.pages.LoginPage;

import bsh.org.objectweb.asm.Constants;

public class HomePageTest {
	BasePage basePage;
	Properties prop;
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	
	
	@BeforeMethod
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.initialize_Properties();
		driver =basePage.initialize_driver(prop);
		loginPage = new LoginPage(driver);
		homePage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void VerifyHomePageTitleTest() {
		String title = homePage.getHomePageTitle();
		System.out.println("Home Page Title is::"+title);
		Assert.assertEquals(title,com.qa.facebook.constants.Constants.HOME_PAGE_TITLE);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
