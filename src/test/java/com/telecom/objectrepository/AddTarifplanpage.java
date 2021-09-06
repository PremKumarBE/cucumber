package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.Commonactions;

public class AddTarifplanpage extends Commonactions {
	public AddTarifplanpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="(//a[contains(text(),'Add ')])[3]")
			private WebElement aas;
	public WebElement getAas() {
		return aas;
	}
}