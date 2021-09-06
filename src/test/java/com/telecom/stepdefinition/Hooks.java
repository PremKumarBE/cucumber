package com.telecom.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.resources.Commonactions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Commonactions {
	Commonactions ca=new Commonactions();
    @Before
	public void launch() {
		ca.launch("http://demo.guru99.com/telecom/index.html");
		
	}
		   
	
	@After
	public void aa(Scenario scenario){
			
			//driver.close();
		if(scenario.isFailed()){

			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

				scenario.embed(screenshot, "image/png");
			}
			else{
				scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
			}
	}
}
		
