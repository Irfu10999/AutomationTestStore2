package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage 
{
	
	public CreateAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy (xpath = ".//label[text()='First Name:']")
	WebElement firstNameText;

	@FindBy(xpath = ".//input[@id='AccountFrm_firstname']")
	WebElement txtFirstName;
	
	
	@FindBy(xpath = ".//label[text()='Last Name:']")
	WebElement lastNameText;
	
	
	@FindBy(xpath = ".//input[@id='AccountFrm_lastname']")
	WebElement txtLastName;
	
	
	@FindBy(xpath = ".//label[text()='E-Mail:']")
	WebElement emailText;
	
	
	@FindBy(xpath = ".//input[@id='AccountFrm_email']")
	WebElement txtEmail;
	
	
	@FindBy(xpath = ".//label[text()='Telephone:']")
	WebElement telephoneText;
	
	@FindBy(xpath = ".//input[@id='AccountFrm_telephone']")
	WebElement txtTelephone;
	
	
	@FindBy(xpath = ".//label[text()='Fax:']")
	WebElement faxText;
	
	
	@FindBy(xpath = ".//input[@id='AccountFrm_fax']")
	WebElement txtFax;
	
	
	@FindBy(xpath = ".//label[text()='Company:']")
	WebElement companyText;
	
	
	@FindBy(xpath = ".//input[@id='AccountFrm_company']")
	WebElement txtCompany;
	
	
	@FindBy(xpath = ".//label[text()='Address 1:']")
	WebElement addressFirstText;
	
	@FindBy(xpath = ".//input[@id='AccountFrm_address_1']")
	WebElement txtAddressFirst;
	
	
	@FindBy(xpath = ".//label[text()='Address 2:']")
	WebElement adressSecondText;
	
	
	@FindBy(xpath = ".//input[@id='AccountFrm_address_2']")
	WebElement txtAddressSecond;
	
	
	@FindBy(xpath = ".//label[text()='City:']")
	WebElement cityText;
	
	
	@FindBy(xpath = ".//input[@id='AccountFrm_city']")
	WebElement txtCity;
	
	
	@FindBy(xpath = ".//label[text()='Region / State:']")
	WebElement regionSTateText;
	
	@FindBy(xpath = ".//select[@id='AccountFrm_zone_id']")//====================
	WebElement listBoxStates;
	
	
	@FindBy(xpath = ".//label[text()='ZIP Code:']")
	WebElement zopcodeText;
	
	
	@FindBy(xpath = ".//input[@id='AccountFrm_postcode']")
	WebElement txtZipCode;
	
	
	@FindBy(xpath = ".//label[text()='Country:']")
	WebElement countryText;
	
	@FindBy(xpath = ".//select[@id='AccountFrm_country_id']")//======================= Done
	WebElement listBoxCountry;
	
	
	@FindBy(xpath = ".//label[text()='Login name:']")
	WebElement loginNameText;
	
	
	@FindBy(xpath = ".//input[@id='AccountFrm_loginname']")
	WebElement txtLoginName;
	
	
	@FindBy(xpath = ".//label[text()='Password:']")
	WebElement passwordText;
	
	@FindBy(xpath = ".//input[@id='AccountFrm_password']")
	WebElement txtPassword;
	
	
	@FindBy(xpath = ".//label[text()='Password Confirm:']")
	WebElement passwordConfirmText;
	
	
	@FindBy(xpath = ".//input[@id='AccountFrm_confirm']")
	WebElement txtConfirmPassword;
	
	
	@FindBy(xpath = ".//label[text()='Subscribe:']")
	WebElement subscribeText;
	
	@FindBy(xpath = ".//input[@id='AccountFrm_newsletter1']")
	WebElement radioYesButton;
	
	
	@FindBy(xpath = ".//input[@id='AccountFrm_newsletter0']")
	WebElement radioNoButton;
	
	@FindBy(xpath = ".//label[@class='col-md-6 mt20 mb40']")
	WebElement iHaveReadText;
	
	
	@FindBy(xpath = ".//label[@class='col-md-6 mt20 mb40']//a")
	WebElement privacyPolicyText;
	
	@FindBy(xpath = ".//label[@class='col-md-6 mt20 mb40']//a")
	WebElement btnPrivacyPolicy;
	
	@FindBy(xpath = ".//input[@id='AccountFrm_agree']")
	WebElement checkBoxAgree;
	
	
	@FindBy(xpath = ".//button[@title='Continue']")
	WebElement btnContinue;

	/*
	@FindBy(xpath = "")
	WebElement
	
	
	@FindBy(xpath = "")
	WebElement
	
	@FindBy(xpath = "")
	WebElement
	
	
	@FindBy(xpath = "")
	WebElement
	
	@FindBy(xpath = "")
	WebElement
	
	
	@FindBy(xpath = "")
	WebElement
	*/
	
	//================================= click Methods ======================
	
	public void clickRadioYesButton() 
	{
	    clickElement(radioYesButton);
	}

	public void clickRadioNoButton() 
	{
	    clickElement(radioNoButton);
	}

	public void clickAgreeCheckBox() 
	{
	    clickElement(checkBoxAgree);
	}

	public void clickContinueButton() 
	{
	    clickElement(btnContinue);
	}

	public void clickPrivacyPolicyButton() 
	{
	    clickElement(btnPrivacyPolicy);
	}
	
	//================== Enter Text Methods =================================
	
	
	public void enterFirstName(String firstName) 
	{
	    enterText(txtFirstName, firstName);
	}

	public void enterLastName(String lastName) 
	{
	    enterText(txtLastName, lastName);
	}

	public void enterEmail(String email) 
	{
	    enterText(txtEmail, email);
	}

	public void enterTelephone(String telephone) 
	{
	    enterText(txtTelephone, telephone);
	}

	public void enterFax(String fax) 
	{
	    enterText(txtFax, fax);
	}

	public void enterCompany(String company) 
	{
	    enterText(txtCompany, company);
	}

	public void enterAddressFirst(String address1) 
	{
	    enterText(txtAddressFirst, address1);
	}

	public void enterAddressSecond(String address2) 
	{
	    enterText(txtAddressSecond, address2);
	}

	public void enterCity(String city) 
	{
	    enterText(txtCity, city);
	}

	public void enterZipCode(String zipCode) 
	{
	    enterText(txtZipCode, zipCode);
	}

	public void enterLoginName(String loginName) 
	{
	    enterText(txtLoginName, loginName);
	}

	public void enterPassword(String password) 
	{
	    enterText(txtPassword, password);
	}

	public void enterConfirmPassword(String confirmPassword) 
	{
	    enterText(txtConfirmPassword, confirmPassword);
	}
	
	//=========================== get text methods ====================
	
	public String getFirstNameText() 
	{
	    return getElementText(firstNameText);
	}

	public String getLastNameText() 
	{
	    return getElementText(lastNameText);
	}

	public String getEmailText() 
	{
	    return getElementText(emailText);
	}

	public String getTelephoneText() 
	{
	    return getElementText(telephoneText);
	}

	public String getFaxText() 
	{
	    return getElementText(faxText);
	}

	public String getCompanyText() 
	{
	    return getElementText(companyText);
	}

	public String getAddressFirstText() 
	{
	    return getElementText(addressFirstText);
	}

	public String getAddressSecondText() 
	{
	    return getElementText(adressSecondText);
	}

	public String getCityText() 
	{
	    return getElementText(cityText);
	}

	public String getRegionStateText() 
	{
	    return getElementText(regionSTateText);
	}

	public String getZipCodeText() 
	{
	    return getElementText(zopcodeText);
	}

	public String getCountryText() 
	{
	    return getElementText(countryText);
	}

	public String getLoginNameText() 
	{
	    return getElementText(loginNameText);
	}

	public String getPasswordText() 
	{
	    return getElementText(passwordText);
	}

	public String getPasswordConfirmText() 
	{
	    return getElementText(passwordConfirmText);
	}

	public String getSubscribeText() 
	{
	    return getElementText(subscribeText);
	}

	public String getIHaveReadText() 
	{
	    return getElementText(iHaveReadText);
	}

	public String getPrivacyPolicyText() 
	{
	    return getElementText(privacyPolicyText);
	}
	
	//===============  methods to listBox and DropDOwns
	
	public void selectCountry(String country) 
	{
        selectOptionFromDropdown(listBoxCountry, country);
    }
	
	public void selectState( String state) 
	{
        selectOptionFromDropdown(listBoxStates, state);
    }
	
	
}
