package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.Commonactions;

public class AddCustomerpage extends Commonactions {
	public AddCustomerpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Add Customer')])[1]")
	private WebElement aa;

	public WebElement getAa() {
		return aa;
	}

	public void setAa(WebElement aa) {
		this.aa = aa;
	}
}
