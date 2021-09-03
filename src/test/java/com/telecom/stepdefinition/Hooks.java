package com.telecom.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	static WebDriver driver;
	@Before
	public void launch() {
		    WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    driver.get("http://demo.guru99.com/telecom/index.html");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@After
	public void close() {
		driver.close();
		
	}

}
