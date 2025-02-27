package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizatonsPage {
	
	// 1. declaration
	
//	@FindBy(xpath = "//img[contains(@title,'Create Organization...')]")
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createNewOrgButton;
	
	@FindBy(name = "search_text")
	private WebElement searchForBox;
	
	@FindBy(id = "bas_searchfield")
	private WebElement orgSearchDropDown;
	
	@FindBy(xpath = "//input[@name='submit']")
	private WebElement searchNowButton;
	
	// 2. initialization
	
	public OrganizatonsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// 3. getters

	public WebElement getCreateNewOrgButton() {
		return createNewOrgButton;
	}

	public WebElement getSearchForBox() {
		return searchForBox;
	}

	public WebElement getOrgSearchDropDown() {
		return orgSearchDropDown;
	}

	public WebElement getSearchNowButton() {
		return searchNowButton;
	}	

}
