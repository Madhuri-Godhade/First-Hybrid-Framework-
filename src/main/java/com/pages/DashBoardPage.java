package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	WebDriver driver;

	@FindBy(tagName="h3")
	private List<WebElement> courses;
	
	@FindBy(xpath="//span[text()='Users']")
	private WebElement userlink;
	
	
	public DashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<String> verifyCourses()
	{
		ArrayList<String> actualcourses=new ArrayList<String>();
		for(WebElement course:courses)
		{
			String crs=course.getText();
			actualcourses.add(crs);
		}
		return  actualcourses;
	}
	
	public UserPage clickUserLink()
	{
		userlink.click();
		return new UserPage(driver);
	}

}
