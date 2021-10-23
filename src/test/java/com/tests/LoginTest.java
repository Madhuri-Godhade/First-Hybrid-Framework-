package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.DashBoardPage;
import com.pages.LoginPage;

public class LoginTest  extends TestBase{

	WebDriver driver=null;
	LoginPage lp=null;
	static DashBoardPage dp;
	
	@BeforeSuite
	public void setUp()
	{
		 driver=initialization();
		 reportInit();
		 lp=new LoginPage(driver);
		 
	}
}
