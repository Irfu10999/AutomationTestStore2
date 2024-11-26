package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage 
{

	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = ".//span[@class='maintext']")
	WebElement myAccountText;
	
	
	@FindBy(xpath = ".//span[@class='subtext']")
	WebElement nameSubText;
	
	@FindBy(xpath = ".//div[text()='Welcome back Aman']")
	WebElement welcomeBackMessage;
	
	/*
	@FindBy(xpath = "")
	WebElement
	
	
	@FindBy(xpath = "")
	WebElement
	
	@FindBy(xpath = "")
	WebElement
	
	
	@FindBy(xpath = "")
	WebElement
	*/
	
	//=============== click Methods
	
	public void clickMyAccountText() 
	{
	    clickElement(myAccountText);
	}

	public void clickNameSubText() 
	{
	    clickElement(nameSubText);
	}
	
	
	//============ text Compare Methods
	
	public String getMyAccountText() 
	{
	    return getElementText(myAccountText);
	}

	public String getNameSubText() 
	{
	    return getElementText(nameSubText);
	}
	
	public String getPageTitle()
	{
		
		String tempTitle=driver.getTitle();
		return tempTitle;
	}
	
	public boolean isMypageAccountExist()
	{
		boolean status;
		String titleText="Account Login";
		
		if(driver.getTitle().equals(titleText))
		{
			status=true;
		}
		else
		{
			status=false;
		}
		return status;
	}
	
	public boolean isMyAccountLogged()
	{
		boolean status;
		try
		{
		if(welcomeBackMessage.isDisplayed())
		{
			status=true;
		}else 
		{
			status=false;
		}
		}catch (Exception e) 
		{
			status=false;
		}
		return status;
	}
	
	
}
