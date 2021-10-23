package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	//why--to aplay wait
	//i/p--webelement
	//o/p-- null
	
	public void waitForElement(WebDriver driver, WebElement element,long timeInSec )
	{
		WebDriverWait wait=new WebDriverWait(driver, timeInSec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
