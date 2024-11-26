package com.testCases;

import org.testng.annotations.Test;

import com.pageObjects.AccountLoginPage;
import com.pageObjects.MyAccountPage;
import com.pageObjects.WelcomePage;
import com.testBase.BaseClass;

public class TEstBasic extends BaseClass
{
	@Test
	public void testLogin()
	{
		WelcomePage wp=new WelcomePage(driver);
		wp.clickLoginOrRegister();
		
		AccountLoginPage alp=new AccountLoginPage(driver);
		alp.enterLoginName(p.getProperty("email"));
		alp.enterPassword(p.getProperty("password"));
		alp.clickLoginButton();
		
		MyAccountPage map=new MyAccountPage(driver);
		String pageTitle=map.getPageTitle();
		System.out.println(pageTitle);
		boolean stat= map.isMypageAccountExist();
		System.out.println(stat);
	}

}
