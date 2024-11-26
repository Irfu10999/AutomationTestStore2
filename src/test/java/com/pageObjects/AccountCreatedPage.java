package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage
{

	public AccountCreatedPage (WebDriver driver)
	{
		super (driver);
	}
	
	
	@FindBy(xpath = ".//span[@class='maintext']")
	WebElement acoountCreatedMessageText;
	
	
	@FindBy(xpath = ".//a[@title='Continue']")
	WebElement  btnContinue;
	
	@FindBy(xpath = ".//span[text()='My Account']")
	WebElement myAccountText;
	
	
	@FindBy(xpath = "(.//a[text()='  Account Dashboard'])[2]")
	WebElement btnAccountDashboard;
	
	@FindBy(xpath = "(.//a[text()='  My wish list'])[2]")
	WebElement btnMyWishList;
	
	
	@FindBy(xpath = "(.//a[text()='  Edit account details'])[2]")
	WebElement btnEditAccountDetails;
	
	@FindBy(xpath = "(.//a[text()='  Change password'])[2]")
	WebElement btnChangePassword;
	
	
	@FindBy(xpath = "(.//a[text()='  Manage Address Book'])[2]")
	WebElement btnManageAddressBook;
	
	@FindBy(xpath = "(.//a[text()='  Order history'])[2]")
	WebElement btnOrderHistory;
	
	
	@FindBy(xpath = "(.//a[text()='  Transaction history'])[2]")
	WebElement btnTransactionHistory;
	
	@FindBy(xpath = "(.//a[text()='  Downloads'])[2]")
	WebElement btnDownloads;
	
	
	@FindBy(xpath = "(.//a[text()='  Notifications'])[2]")
	WebElement btnNotification;
	
	@FindBy(xpath = "(.//a[text()='  Logoff'])[1]")
	WebElement btnLogoof;
	
	
	@FindBy(xpath = ".//div[@class='menu_text']")
	WebElement btnWelcomeBack;
	
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
	//============================ CLick Methods =========================
	
	public void clickContinueButton() 
	{
	    clickElement(btnContinue);
	}

	public void clickAccountDashboardButton() 
	{
	    clickElement(btnAccountDashboard);
	}

	public void clickMyWishListButton() 
	{
	    clickElement(btnMyWishList);
	}

	public void clickEditAccountDetailsButton() 
	{
	    clickElement(btnEditAccountDetails);
	}

	public void clickChangePasswordButton() 
	{
	    clickElement(btnChangePassword);
	}

	public void clickManageAddressBookButton() 
	{
	    clickElement(btnManageAddressBook);
	}

	public void clickOrderHistoryButton() 
	{
	    clickElement(btnOrderHistory);
	}

	public void clickTransactionHistoryButton() 
	{
	    clickElement(btnTransactionHistory);
	}

	public void clickDownloadsButton() 
	{
	    clickElement(btnDownloads);
	}

	public void clickNotificationButton() 
	{
	    clickElement(btnNotification);
	}

	public void clickLogoffButton() 
	{
	    clickElement(btnLogoof);
	}

	public void clickWelcomeBackButton() 
	{
	    clickElement(btnWelcomeBack);
	}
	
	//======================= Get Text To Compare =======================
	
	
	public String getAccountCreatedMessageText() 
	{
	    return getElementText(acoountCreatedMessageText);
	}

	public String getMyAccountText() 
	{
	    return getElementText(myAccountText);
	}

	public String getWelcomeBackText() 
	{
	    return getElementText(btnWelcomeBack);
	}
	
	
}
