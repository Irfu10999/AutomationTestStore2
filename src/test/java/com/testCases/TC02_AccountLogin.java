package com.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.AccountLoginPage;
import com.pageObjects.WelcomePage;
import com.testBase.BaseClass;

public class TC02_AccountLogin extends BaseClass
{

	@Test(groups = {"Sanity","Master"})
	public void verify_LoginwithInvalidCredentials()
	{
		logger.info("*********** Starting TC02_verifying_Login_test_WIth_Invalid_Credentials ***********");
		try
		{
		WelcomePage wp=new WelcomePage(driver);
		logger.info("*********** Click on Register/Login ***********");
		wp.clickLoginOrRegister();
		
		AccountLoginPage alp=new AccountLoginPage(driver);
		logger.info("*********** Entering Login Data  ***********");
		
		alp.enterLoginName(p.getProperty("email"));
		alp.enterPassword(p.getProperty("password"));
		alp.clickLoginButton();
		boolean target=alp.isErrorMessageDisplayed();
		Assert.assertTrue(target); // Assert.assertEquals(target, true,"*Invalid login Test Failed*");
		}
		catch (Exception e) 
		{
			Assert.fail();
		}
		logger.info("*********** Finished TC_02_verifying_Login_test_WIth_Invalid_Credentials ***********");
		
	}
}