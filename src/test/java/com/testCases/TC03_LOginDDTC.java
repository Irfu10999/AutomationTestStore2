package com.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.AccountCreatedPage;
import com.pageObjects.AccountLoginPage;
import com.pageObjects.MyAccountPage;
import com.pageObjects.WelcomePage;
import com.testBase.BaseClass;

import utilities.DataProviders;

/*
	Data is Valid - Login Success - Test Pass - Logout
	Data is Valid - Login Failed - Test Failed
	
	Data is Invalid -- Login Success -- Test Fail -- Logout
	Data is Invalid -- Login Failed -- Test Pass
	
*/
public class TC03_LOginDDTC extends BaseClass
{
	
	
	@Test(dataProvider = "loginData",dataProviderClass = DataProviders.class, groups = "DataDriven") // getting data provider from different Class
	public void loginDDT(String loginName, String pwd, String exp)
	{
		
		logger.info("*********** Starting TC03_LopginDDTC ***********");
		try
		{
		WelcomePage wp=new WelcomePage(driver);
		wp.clickLoginOrRegister();
		logger.info("*********** Entering Data ***********");
		AccountLoginPage alp=new AccountLoginPage(driver);
		
		alp.enterLoginName(loginName);
		alp.enterPassword(pwd);
		logger.info("*********** Loging In Button ***********");
		alp.clickLoginButton();
		
		logger.info("*********** verifying Page Title ***********");
		MyAccountPage map=new MyAccountPage(driver);
		boolean targetPage=false;
		targetPage=map.isMyAccountLogged();
		System.out.println(targetPage);
		System.out.println(exp);
		if(exp.equalsIgnoreCase("Valid"))
		{
			logger.info("*********** Valid Phase ***********");
			if(targetPage==true)
			{
				logger.info("*********** Entering in Validation Phase ***********");
				AccountCreatedPage acp=new AccountCreatedPage(driver);
				logger.info("*********** Clicking Loggin off After Login ***********");
				acp.clickLogoffButton();
				logger.info("*********** Clicking AGain on Register Button ***********");
				wp.clickLoginOrRegister();
				Assert.assertTrue(true);
				
			}
			else
			{
				logger.info("*********** False  Phase ***********");
				
				Assert.assertTrue(false);
			}
		}
		else
		if(exp.equalsIgnoreCase("Invalid"))
		{
			logger.info("*********** Invalid Phase ***********");
			if(targetPage==true)
			{
				AccountCreatedPage acp=new AccountCreatedPage(driver);
				acp.clickLogoffButton();
				wp.clickLoginOrRegister();
				Assert.assertTrue(false);
			}
			else 
			{
				logger.info("*********** Passed Phase ***********");
				Assert.assertTrue(true);
			}
		}
		}
		catch (Exception e) 
		{
			logger.info("*********** Iteration failed Phase ***********");
			Assert.fail();
		}
		logger.info("*********** finished TC03_LopginDDTC ***********");
		
	}
	
}
