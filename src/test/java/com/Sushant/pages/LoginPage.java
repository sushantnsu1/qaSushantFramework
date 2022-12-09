package com.Sushant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(id = "txtUsername")
	WebElement username;
	
	@FindBy(name = "Password")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement loginBtn;
	
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public LoginPage  enterUsername(String userN)
	{
		username.sendKeys(userN);
		return this;
	}
	
	public LoginPage  enterPassword(String pass)
	{
		password.sendKeys(pass);
		return this;
	}
	
	public LoginPage  clickLoginBtn()
	{
		loginBtn.click();
		return this;
	}
	
}
