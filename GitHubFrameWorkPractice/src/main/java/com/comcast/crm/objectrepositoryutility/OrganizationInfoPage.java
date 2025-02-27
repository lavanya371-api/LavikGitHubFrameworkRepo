package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	
	// 1. declaration
	
	@FindBy(className = "dvHeaderText")
	private WebElement headerMsg;
	
	@FindBy(id = "dtlview_Phone")
	private WebElement phoneVerf;
	
	@FindBy(id = "mouseArea_Industry")
	private WebElement industryVerf;
	
	@FindBy(id = "dtlview_Type")
	private WebElement typeVerf;
	
	// 2. initialization
	
	public OrganizationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// 3. getters

	public WebElement getHeaderMsg() {
		return headerMsg;
	}

	public WebElement getPhoneVerf() {
		return phoneVerf;
	}

	public WebElement getIndustryVerf() {
		return industryVerf;
	}

	public WebElement getTypeVerf() {
		return typeVerf;
	}
	
	
	
	
	

}
