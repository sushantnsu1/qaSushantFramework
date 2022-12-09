package com.Sushant.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Sushant.Utility.BrowserFactory;
import com.Sushant.pages.LoginPage;

public class LoginPageTest {
	
	WebDriver driver;
	String  appUrl = "https://appointment.technables.com/login";
	String userName = "jerox.user12@yopmail.com";
	String password = "Test@123";
	
	@Test
	public void loginApp() {
		driver =  BrowserFactory.startApplication(driver, "Chrome", appUrl);
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.enterUsername(userName);
		loginpage.enterPassword(password);
		loginpage.clickLoginBtn();
		
	}

}
