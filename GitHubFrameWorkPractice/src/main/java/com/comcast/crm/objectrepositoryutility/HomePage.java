package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	// 1. declaration
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;
	
	@FindBy(linkText = "More")
	private WebElement moreLink;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignsLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminSOImage;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;
	
	// 2. initialization
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// 3. getters

	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}
	
//	public WebElement getAdminSOImage() {
//		return adminSOImage;
//	}
//
//	public WebElement getSignOutLink() {
//		return signOutLink;
//	}
	
//	public WebElement getMoreLink() {
//	    return MoreLink;
//  }

//	public WebElement getCampaignsLink() {
//		return campaignsLink;
//	}

// above methods also crct but also can be written as Business link as below

	public void navigateToCampaignsPage() { // business method(contains more than 1 action in a single page)
		Actions act = new Actions(driver);
		act.moveToElement(moreLink).perform();
		campaignsLink.click();		
	}
	
	public void logout() {
		Actions act = new Actions(driver);
		act.moveToElement(adminSOImage).perform();
		signOutLink.click();
	}
	
}
