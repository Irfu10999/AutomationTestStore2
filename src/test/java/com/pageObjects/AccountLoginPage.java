package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLoginPage extends BasePage
{
	public AccountLoginPage (WebDriver driver)
	{
		super(driver);
	}

	
	
	@FindBy(xpath = ".//span[text()=' Account Login']")
	WebElement AccountLoginText;
	
	
	@FindBy(xpath = ".//input[@id='accountFrm_accountregister']")
	WebElement radiobtnRegisterAccount;
	
	
	@FindBy(xpath = ".//button[@title='Continue']")
	WebElement btnContinue;
	
	
	@FindBy(xpath = ".//h2[text()='Returning Customer']")
	WebElement returningCustomerText;
	
	
	@FindBy(xpath = "(.//div[@class='form-group']//label)[1]")
	WebElement LoginNameText;
	
	
	@FindBy(xpath = ".//input[@name='loginname']")
	WebElement txtLoginName;
	

	@FindBy(xpath = ".//input[@name='password']")
	WebElement txtPassword;
	

	@FindBy(xpath = ".//a[text()='Forgot your password?']")
	WebElement btnForgetYourPassword;
	

	@FindBy(xpath = ".//a[text()='Forgot your login?']")
	WebElement btnForgotYourLogin;
	

	@FindBy(xpath = ".//button[@title='Login']")
	WebElement btnLogin;
	

	@FindBy(xpath = ".//div[@class='alert alert-error alert-danger']")
	WebElement errorMessageText;
	
	

	@FindBy(xpath = ".//div[@class='alert alert-error alert-danger']//button[@class='close']")
	WebElement btnErrorMessageCLose;
	

	//@FindBy(xpath = "")
	//WebElement

	
	
	
	// --------------------- Click Methods -------------------
	
	public void clickCloseButtonErrorMessage()
	{
		clickElement(btnErrorMessageCLose);
	}
	
	public void clickRegisterAccountRadioButton() 
	{
	    clickElement(radiobtnRegisterAccount);
	}

	public void clickContinueButton() 
	{
	    clickElement(btnContinue);
	}

	public void clickForgetYourPasswordButton() 
	{
	    clickElement(btnForgetYourPassword);
	}

	public void clickForgotYourLoginButton() 
	{
	    clickElement(btnForgotYourLogin);
	}

	public void clickLoginButton() 
	{
	    clickElement(btnLogin);
	}
	
	
	//==================== Enter Text Methods   ===========================
	
	public void enterLoginName(String loginName) 
	{
	    enterText(txtLoginName, loginName);
	}

	public void enterPassword(String password) 
	{
	    enterText(txtPassword, password);
	}

	//======================= Get Text Methods ============================
	
	
	public String getAccountLoginText() 
	{
	    return getElementText(AccountLoginText);
	}

	public String getReturningCustomerText() 
	{
	    return getElementText(returningCustomerText);
	}

	public String getLoginNameLabelText() 
	{
	    return getElementText(LoginNameText);
	}
	
	public String getErrorMessage()
	{
		return getElementText(errorMessageText);
	}
	
	//=================  Displayed MEthods =================================
	
	public boolean isErrorMessageDisplayed() 
	{
	    try 
	    {
	        return errorMessageText.isDisplayed();
	    } catch (Exception e) 
	    {
	        return false;
	    }
	}
}
