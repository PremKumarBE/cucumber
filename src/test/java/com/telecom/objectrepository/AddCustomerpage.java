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
	private WebElement login;
	@FindBy(xpath="//label[contains(text(),'Done')]")
	private WebElement done;
	public WebElement getLogin() {
		return login;
	}
	public WebElement getDone() {
		return done;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getAddr() {
		return addr;
	}
	public WebElement getTele() {
		return tele;
	}

	@FindBy(id="fname")
	private WebElement fname;
	@FindBy(id="lname")
	private WebElement lname;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(name="addr")
	private WebElement addr;
	@FindBy(id="telephoneno")
	private WebElement tele;
}
	
	
	