package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps {
	/*static WebDriver driver;
	@Given("user launches telecom application")
	public void user_launches_telecom_application() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		Hooks.driver.findElement(By.xpath("(//a[contains(text(),'Add Customer')])[1]")).click();
		
		
	}

	@When("user need to fill up the fields")
	public void user_need_to_fill_up_the_fields() {
		Hooks.driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		Hooks.driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys("Prem");
		Hooks.driver.findElement(By.id("lname")).sendKeys("kumar");
		Hooks.driver.findElement(By.id("email")).sendKeys("premkumar@gmail.com");
		Hooks.driver.findElement(By.name("addr")).sendKeys("pudukkottai");
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys("09876543");
	    
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		Hooks.driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	    
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		WebElement custid = Hooks.driver.findElement(By.xpath("(//td[@align='center'])[1]"));
		Assert.assertTrue(custid.isDisplayed());
		WebElement CustString = Hooks.driver.findElement(By.xpath("(//td[@align='center'])[3]"));
		
		Assert.assertEquals(CustString.getText(), "Please Note Down Your CustomerID");
	}
	@When("user need to fill up the fields {int}D List")     //1DimensionalList
	public void user_need_to_fill_up_the_fields_D_List(Integer int1,DataTable datasinlist) {
	    List<String> fill = datasinlist.asList();
	    Hooks.driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
	    Hooks.driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
	    Hooks.driver.findElement(By.id("fname")).sendKeys(fill.get(0));
	    Hooks.driver.findElement(By.id("lname")).sendKeys(fill.get(1));
	    Hooks.driver.findElement(By.id("email")).sendKeys(fill.get(2));
	    Hooks.driver.findElement(By.name("addr")).sendKeys(fill.get(3));
	    Hooks.driver.findElement(By.id("telephoneno")).sendKeys(fill.get(4));
	}
	@When("user need to fill up the fields {int}D Map")     //1Dimensinal Map
	public void user_need_to_fill_up_the_fields_D_Map(Integer int1, DataTable datainmap) {
		Map<String, String> fill = datainmap.asMap(String.class, String.class);
		Hooks.driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		Hooks.driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(fill.get("fname"));
			Hooks.driver.findElement(By.id("lname")).sendKeys(fill.get("lname"));
			Hooks.driver.findElement(By.id("email")).sendKeys(fill.get("email"));
			Hooks.driver.findElement(By.name("addr")).sendKeys(fill.get("addr"));
			Hooks.driver.findElement(By.id("telephoneno")).sendKeys(fill.get("telephoneno"));
	
	   
	}
	@When("user need to fill up the fields Scenario OUTLINE {string},{string},{string},{string},{string}")
	public void user_need_to_fill_up_the_fields_Scenario_OUTLINE(String fname, String lname, String email, String addr, String telephoneno) {
		Hooks.driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(fname);
		Hooks.driver.findElement(By.id("lname")).sendKeys(lname);
		Hooks.driver.findElement(By.id("email")).sendKeys(email);
		Hooks.driver.findElement(By.name("addr")).sendKeys(addr);
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(telephoneno);
	}





	

}
