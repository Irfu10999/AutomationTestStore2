package com.pageObjects;

import java.time.Duration;


import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage extends BasePage
{

	public WelcomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy (xpath = ".//img[@title='Automation Test Store']")
	WebElement websiteNameLogoButton;
	
	@FindBy(xpath = ".//a[text()='Login or register']")
	WebElement btnLoginOrRegister;
	
	@FindBy(xpath = "(.//a[@class='top menu_specials']//i[@class='fa fa-tag'])[1]")
	WebElement logoSpecialButton;
	
	@FindBy(xpath = "(.//a[@class='top menu_specials']//span[text()='Specials'])[1]")
	WebElement btnSpecials;
	
	@FindBy(xpath = "(.//a[@class='top menu_account']//i[@class='fa fa-user'])[1]")
	WebElement logoAccountButton;
	
	@FindBy(xpath = "(.//span[text()='Account'])[1]")
	WebElement btnAccount;
	
	@FindBy(xpath = "(.//a[@class='top nobackground']//i[@class='fa fa-shopping-cart'])[1]")
	WebElement logoCartButton;
	
	@FindBy(xpath = "(.//a[@class='top nobackground']//span[text()='Cart'])[1]")
	WebElement btnCart;
	
	@FindBy (xpath = "(.//a[@class='top menu_checkout']//i[@class='fa fa-money'])[1]")
	WebElement logoCheckoutButton;
	
	@FindBy(xpath = "(.//a[@class='top menu_checkout']//span[text()='Checkout'])[1]")
	WebElement btnCheckout;
	
	@FindBy(xpath = ".//input[@id='filter_keyword']")
	WebElement txtSearchBox;
	
	@FindBy (xpath = ".//input[@id='filter_keyword']/..//div[@class='button-in-search']")
	WebElement btnSearchIcon;
	
	
	// ================== Click Methods ============================================================
	
	public void clickLoginOrRegister() 
	{
	    clickElement(btnLoginOrRegister);
	}

	public void clickSpecialsButton() 
	{
	    clickElement(btnSpecials);
	}

	public void clickAccountButton() 
	{
	    clickElement(btnAccount);
	}

	public void clickCartButton() 
	{
	    clickElement(btnCart);
	}

	public void clickCheckoutButton() 
	{
	    clickElement(btnCheckout);
	}

	public void clickSearchIcon() 
	{
	    clickElement(btnSearchIcon);
	}
	
	//================ ENter Text Methods =======================================================
	
	public void enterTextInSearchBox(String text) 
	{
	    txtSearchBox.clear(); // Clear any existing text
	    txtSearchBox.sendKeys(text);
	}
		
	//============== getting text From ELements ================================================
	
	public String getLoginOrRegisterText() 
	{
	    
	    try 
	    {
	    	return (btnLoginOrRegister.getText());
	    }catch (Exception e) 
	    {
	    	return e.getMessage();
	    }
	}

	public String getSpecialsButtonText() 
	{
		try 
		{
	    return btnSpecials.getText();
	    }catch (Exception e) 
	    {
	    	return e.getMessage();
	    }
	}

	public String getAccountButtonText() 
	{
		try
		{
	    return btnAccount.getText();
	    }catch (Exception e) 
	    {
	    	return e.getMessage();
	    }
	}
	
	//================ Verifying Visibility of ELements ====================================
	
	public boolean isLoginOrRegisterDisplayed() 
	{
	    return btnLoginOrRegister.isDisplayed();
	}

	public boolean isSpecialsButtonDisplayed() 
	{
	    return btnSpecials.isDisplayed();
	}

	public boolean isAccountButtonDisplayed() 
	{
	    return btnAccount.isDisplayed();
	}
	
	//======== Methods for Checking Element Enabled Or not 
	
	public boolean isSearchBoxEnabled() 
	{
	    return txtSearchBox.isEnabled();
	}

	public boolean isCheckoutButtonEnabled() 
	{
	    return btnCheckout.isEnabled();
	}
	
	//========== Methods for Getting an Attribute Value
	
	
	public String getSearchBoxAttribute(String attribute) 
	{
	    return txtSearchBox.getAttribute(attribute);
	}

	public String getCheckoutButtonAttribute(String attribute) 
	{
	    return logoCheckoutButton.getAttribute(attribute);
	}
	
	//========= Common Methods  ==========================================================
	
	
	
}
