package com.telecom.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.objectrepository.AddTarifplanpage;
import com.telecom.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTarifplanSteps extends Commonactions {
	Commonactions d=new Commonactions();
	AddTarifplanpage f=new AddTarifplanpage();
	/*static WebDriver driver;

@Given("user launch telecom application")
public void user_launch_telecom_application() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/index.html");
	driver.manage().window().maximize();
   
}*/

@Given("click Add traif")
public void click_Add_traif() {
	//driver.findElement(By.xpath("(//a[contains(text(),'Add ')])[3]")).click();
	d.click(f.getAas());
  
}

@When("user need to fill the fields")
public void user_need_to_fill_the_fields() {
	driver.findElement(By.id("rental1")).sendKeys("333");
	driver.findElement(By.id("local_minutes")).sendKeys("323");
	driver.findElement(By.id("inter_minutes")).sendKeys("23");
	driver.findElement(By.id("sms_pack")).sendKeys("34");
	driver.findElement(By.id("minutes_charges")).sendKeys("1");
	driver.findElement(By.id("inter_charges")).sendKeys("2");
	driver.findElement(By.id("sms_charges")).sendKeys("2");

}

@When("user click submit button")
public void user_click_submit_button() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
   
}

@Then("user verify the status")
public void user_verify_the_status() {
    WebElement verify = driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
    Assert.assertEquals(verify.getText(), "Congratulation you add Tariff Plan");
  
}

}
