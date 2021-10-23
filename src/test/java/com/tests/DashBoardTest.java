package com.tests;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.UserPage;


public class DashBoardTest extends TestBase{

	static UserPage up;
	@Test
	public void verifyExpectedCourse()
	{
		ArrayList<String> expcourse=new ArrayList<String>();
		expcourse.add("Selenium");
		expcourse.add("Java / J2EE");
		expcourse.add("Python");
		expcourse.add("Php");
	Assert.assertEquals(LoginTest.dp.verifyCourses(), expcourse);
		
		
	}
	
	public void test05()
	{
		up=LoginTest.dp.clickUserLink();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
	}
}
