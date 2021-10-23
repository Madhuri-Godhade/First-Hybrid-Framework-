package com.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {

	@Test
	public void verifyTableRows()
	{
		Assert.assertEquals(DashBoardTest.up.verifyrows(), 5);
	}
	
}
