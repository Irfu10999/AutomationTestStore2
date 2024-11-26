package com.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.AccountLoginPage;
import com.pageObjects.MyAccountPage;
import com.pageObjects.WelcomePage;
import com.testBase.BaseClass;

public class TC04_AccountLoginWIthValidCredentials  extends BaseClass
{
	@Test(groups = {"Sanity","Master"})
	public void verify_LoginwithValidCredentials()
	{
		logger.info("*********** Starting TC02_verifying_Login_test_WIth_Valid_Credentials ***********");
		try
		{
		WelcomePage wp=new WelcomePage(driver);
		logger.info("*********** Click on Register/Login ***********");
		wp.clickLoginOrRegister();
		
		AccountLoginPage alp=new AccountLoginPage(driver);
		logger.info("*********** Entering Login Data  ***********");
		
		alp.enterLoginName(p.getProperty("loginName"));
		alp.enterPassword(p.getProperty("password"));
		alp.clickLoginButton();
		MyAccountPage map= new MyAccountPage(driver);
		boolean target=map.isMyAccountLogged();
		Assert.assertTrue(target); 
		}
		catch (Exception e) 
		{
			Assert.fail();
		}
		logger.info("*********** Finished TC_02_verifying_Login_test_WIth_Valid_Credentials ***********");
		
	}

}
