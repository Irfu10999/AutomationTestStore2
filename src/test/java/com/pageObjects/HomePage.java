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

public class HomePage extends BasePage
{

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy (xpath = ".//a[@class='active menu_home']")
	WebElement btnHome;
	
	
	@FindBy(xpath = ".//a[text()='  Apparel & accessories']")
	WebElement btnAppearalAccessories;
	
	
	@FindBy(xpath = ".//a[text()='  Makeup']")
	WebElement btnMakeup;
	
	@FindBy(xpath = ".//a[text()='  Skincare']")
	WebElement btnSkinCare;
	
	
	@FindBy(xpath = ".//a[text()='  Fragrance']")
	WebElement btnFragrance;
	
	@FindBy(xpath = ".//a[text()='  Men']")
	WebElement btnMen;
	
	
	@FindBy(xpath = ".//a[text()='  Hair Care']")
	WebElement btnHairCare;
	
	@FindBy (xpath = ".//a[text()='  Books']")
	WebElement btnBooks;
	
	// ===============  Click Methods  ======================
	
	public void clickHomeButton() {
	    clickElement(btnHome);
	}

	public void clickApparelAccessoriesButton() {
	    clickElement(btnAppearalAccessories);
	}

	public void clickMakeupButton() {
	    clickElement(btnMakeup);
	}

	public void clickSkinCareButton() {
	    clickElement(btnSkinCare);
	}

	public void clickFragranceButton() {
	    clickElement(btnFragrance);
	}

	public void clickMenButton() {
	    clickElement(btnMen);
	}

	public void clickHairCareButton() {
	    clickElement(btnHairCare);
	}

	public void clickBooksButton() {
	    clickElement(btnBooks);
	}
	
	//================   Compare Text Methods  ====================
	
	public String getHomeButtonText() {
	    try {
	        return btnHome.getText();
	    } catch (Exception e) {
	        return e.getMessage();
	    }
	}

	public String getApparelAccessoriesButtonText() {
	    try {
	        return btnAppearalAccessories.getText();
	    } catch (Exception e) {
	        return e.getMessage();
	    }
	}

	public String getMakeupButtonText() {
	    try {
	        return btnMakeup.getText();
	    } catch (Exception e) {
	        return e.getMessage();
	    }
	}

	public String getSkinCareButtonText() {
	    try {
	        return btnSkinCare.getText();
	    } catch (Exception e) {
	        return e.getMessage();
	    }
	}

	public String getFragranceButtonText() {
	    try {
	        return btnFragrance.getText();
	    } catch (Exception e) {
	        return e.getMessage();
	    }
	}

	public String getMenButtonText() {
	    try {
	        return btnMen.getText();
	    } catch (Exception e) {
	        return e.getMessage();
	    }
	}

	public String getHairCareButtonText() {
	    try {
	        return btnHairCare.getText();
	    } catch (Exception e) {
	        return e.getMessage();
	    }
	}

	public String getBooksButtonText() {
	    try {
	        return btnBooks.getText();
	    } catch (Exception e) {
	        return e.getMessage();
	    }
	}
	
	
	//========================================================================================================================
	

	
	
}
