package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.properties.File_Reader_Manager;
import com.baseclass.Base_Class_Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",
glue="com.adactin.stepdefinition",
monochrome = true,
dryRun = false,
strict = true,
tags = "@SanityTest,@SmokeTest,@UnityTest,@RegressionTest,@AcceptanceTest",
plugin = {"html:Report/Cucumber_HtmlReport1",
		"pretty",
		"json:Report1/Cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Folder1/File.html"})
public class Runner_Class {
	
	
	public static WebDriver driver;
@BeforeClass
public static void setUp() throws IOException {
	String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
	driver= Base_Class_Cucumber.getBrowser(browser);

}
@AfterClass
public static void tearDown() {
	driver=Base_Class_Cucumber.close();
	//driver.close();

}
}


