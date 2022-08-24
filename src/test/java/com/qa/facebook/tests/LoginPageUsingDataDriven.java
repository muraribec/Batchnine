package com.qa.facebook.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.facebook.base.BasePage;
import com.qa.facebook.constants.Constants;
import com.qa.facebook.pages.LoginPage;
import com.qa.facebook.util.ExcelUtil;

public class LoginPageUsingDataDriven {
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
	
		
	@DataProvider(name="getContactData")
	public Object[][] getContactdata(){
		
		Object contactData[][] = ExcelUtil.getTestData("Sheet1");
		return contactData;
	}
	
	@Test(dataProvider="getContactData")
	public void createContactTest(String fName,String lName,String city,String country,String adr,String emp,String userName,String password) {
		//System.out.println(fName);
		loginPage.doLogin(userName,password);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	

}
