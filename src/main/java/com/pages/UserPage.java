package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
	@FindBy(xpath="//tr")
	private List<WebElement> tablerows;
	
	
	public UserPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

public void userTable() {
	for(WebElement row:tablerows)
		System.out.println(row.getText());
}

public int verifyrows()
{
	return tablerows.size();
	}
}

