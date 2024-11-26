package com.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.AccountCreatedPage;
import com.pageObjects.AccountLoginPage;
import com.pageObjects.CreateAccountPage;
import com.pageObjects.WelcomePage;
import com.testBase.BaseClass;

public class Tc01_AccountRegistration extends BaseClass
{

	 
	@Test(groups = {"Regression","Master"}) 
	 public void Register()
	 {
		logger.info("******** Starting Tc01_AccountRegistration *************");
		
		try
		{
		 WelcomePage wp=new WelcomePage(driver);
		
		 logger.info("******** Clicking on login Register *************");
		 wp.clickLoginOrRegister();
		 
		 AccountLoginPage alp=new AccountLoginPage(driver);
		 
		 logger.info("******** Clicking on Continue Button *************");
		 alp.clickContinueButton();
		 
		 CreateAccountPage cap=new CreateAccountPage(driver);
		 
		 logger.info("******** Providing Necessary Data  *************");
		 cap.enterFirstName("Aman");
		 
		 cap.enterLastName("Khan");
		 
		 cap.enterEmail(generateRandomString(5)+"@gmail.com");
		 
		 cap.enterTelephone(randomNumeric());
		 
		 cap.enterFax("123432");
		 
		 cap.enterCompany("Gogle");
		
		 cap.enterAddressFirst("PuneHj");
		 
		 cap.enterAddressSecond("PuneSecind");
		 
		 cap.enterCity("Pune");
		 
		 cap.selectCountry("India");
		 
		 cap.selectState("Maharashtra");
		 
		 cap.enterZipCode("123456");
		 
		 cap.enterLoginName(generateRandomString(5));
		 
		 String tempPass=randomAlphaNumberic(2);
		 
		 cap.enterPassword(tempPass);
		 
		 cap.enterConfirmPassword(tempPass);
		 
		 logger.info("******** Clicking on No Radio Button *************");
		 cap.clickRadioNoButton();
		 
		 logger.info("******** Clicking on Check Box *************");
		 cap.clickAgreeCheckBox();
		 
		 logger.info("******** Clicking on login Button *************");
		 cap.clickContinueButton();
		 
		 AccountCreatedPage acp=new AccountCreatedPage(driver);
		 
		 String confmsg=acp.getAccountCreatedMessageText();
		 
		 logger.info("******** Validating Expected Message *************");
		 Assert.assertEquals(confmsg,"YOUR ACCOUNT HAS BEEN CREATED!" );
		}
		catch (Exception e) 
		{
			logger.error("***********  Test Failed  ***********");
			logger.debug("***********  Debug Log  *************");
			Assert.fail();
		}
		logger.info("******** Finished Tc01_AccountRegistration *************");
		 
	 }
	
	 
	
}
