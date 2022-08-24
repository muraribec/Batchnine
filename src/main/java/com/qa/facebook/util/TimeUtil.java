package com.qa.facebook.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.facebook.base.BasePage;

public class TimeUtil extends BasePage{
	
	//How to overcome synechronization problem in your project
	// what are the wait command you have used in your project
	//How many types of wait command we have in selenium
	//What is the diff bet Implicit and Explicit wait
	//What is the diff between Implicit, explicit and fluent wait command
	
	//1]Static wait
	//2]Implicit wait
	//3]Explicit wait
	//4]Fluent wait
	
	
	//1]Static wait ---> Thread.sleep(5000); --> 5sec	
	
	//Short wait
	//Medium wait
	//Long wait
	
	public static void shortWait() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void mediumWait() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void longWait() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		
	}
	
	public void explicit() {
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
