package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {

	// 1. declaration

	@FindBy(id = "dtlview_Last Name")
	private WebElement contactLastNameVerf;

	@FindBy(id = "mouseArea_Organization Name")
	private WebElement contactOrgNameVerf;

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement contactHeaderMsg;

	@FindBy(id = "dtlview_Support Start Date")
	private WebElement startDateVerf;

	@FindBy(id = "dtlview_Support End Date")
	private WebElement endDateVerf;

	// 2. initialization

	public ContactInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactLastNameVerf() {
		return contactLastNameVerf;
	}

	public WebElement getContactOrgNameVerf() {
		return contactOrgNameVerf;
	}

	public WebElement getContactHeaderMsg() {
		return contactHeaderMsg;
	}

	public WebElement getStartDateVerf() {
		return startDateVerf;
	}

	public WebElement getEndDateVerf() {
		return endDateVerf;
	}
	
	
}
