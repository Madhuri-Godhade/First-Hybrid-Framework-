package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.PropertiesUtility;

public class LoginPage {

	WebDriver driver;
	
	
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement paswrd;
	
	@FindBy(xpath="//button")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ValidLogin()
	{
		uname.sendKeys(PropertiesUtility.readProperty("username"));
		paswrd.sendKeys(PropertiesUtility.readProperty("password"));
		loginbtn.click();
	}
	
	public void isValidLogin(String name,String pass)
	{
	uname.sendKeys(name);
	paswrd.sendKeys(pass);
	loginbtn.click();
	}
}
