package com.gb.search.utils;


import com.gb.analytic.dashboard.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllTest {
	
	//WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		WebDriverProcessor.driver = new Firefoxriver();
		WebDriverProcessor.driver.get("http://gb4gb31.qatest.com/gb/ui/prod/signin.cgi");
	}
	@Test
	public void alltest() {
		LoginOperation loginoperation = PageFactory.initElements(WebDriverProcessor.driver, LoginOperation.class);
		@SuppressWarnings("unused")
		ElementLocators elementlocators = PageFactory.initElements(WebDriverProcessor.driver,ElementLocators.class);
		VerifyCategoryReportTest verifycategoryreporttest = PageFactory.initElements(WebDriverProcessor.driver,VerifyCategoryReportTest.class);
	//	SavedFiltertest savedfiltertest = PageFactory.initElements(driver,SavedFiltertest.class);
		System.out.println("You are under test annotation ");
		loginoperation.Login("rekha","demo");
		verifycategoryreporttest.verifyAnalytictab();
		verifycategoryreporttest.verifysubtabs();
		verifycategoryreporttest.verifycategorynameanddesc();
		verifycategoryreporttest.verifyreportnameanddesc();
		//verifycategoryreporttest.verifyclickoncategory();
	//	verifycategoryreporttest.verifyinstancereporticon();
		verifycategoryreporttest.verifyopenedinstancereportdata();
	//	verifycategoryreporttest.verifyclosingreportinstanceviewer();
	//	savedfiltertest.SaveSearchDefault();
	}
	@AfterClass
	 public void tearDown() throws Exception {
		WebDriverProcessor.driver.quit();
	}

}
