package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewOrganizationPage {
	
	// 1. declaration
	
	@FindBy(name = "accountname")
	private WebElement orgNameTextField;
	
	@FindBy(name = "industry")
	private WebElement industryDropDown;
	
	@FindBy(name = "accounttype")
	private WebElement typeDropDown;
	
	@FindBy(id = "phone")
	private WebElement PhoneNumberTextField;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	
	// 2. initialization
	
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgNameTextField() {
		return orgNameTextField;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}
	
	public WebElement getTypeDropDown() {
		return typeDropDown;
	}

	public WebElement getPhoneNumberTextField() {
		return PhoneNumberTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createOrg(String orgName) { // passing only name component
		orgNameTextField.sendKeys(orgName);
		saveButton.click();
	}
	
	public void createOrgWithPhone(String orgName, String PhoneNumber) { // passing name component, phone no
		orgNameTextField.sendKeys(orgName);
		PhoneNumberTextField.sendKeys(PhoneNumber);
		saveButton.click();
	}
	
	
	public void createOrg(String orgName, String industry) { // passing name & Industry drpdown
		orgNameTextField.sendKeys(orgName);
		Select sel = new Select(industryDropDown);
		sel.selectByVisibleText(industry);
		saveButton.click();
	}
	
	public void createOrg(String orgName, String industry, String type) { // passing name & Industry drpdown
		orgNameTextField.sendKeys(orgName);
		Select sel = new Select(industryDropDown);
		sel.selectByVisibleText(industry);
		Select sel2 = new Select(typeDropDown);
		sel2.selectByVisibleText(type);
		saveButton.click();
	}


}
