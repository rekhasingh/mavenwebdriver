package com.gb.analytic.dashboard;
import  com.gb.search.utils.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class VerifyCategoryReportTest {

	WebDriverProcessor webdriverprocessorutil = new WebDriverProcessor();

public void verifyAnalytictab() {

	if(ElementLocators.Analytic_App.isDisplayed()){
		ElementLocators.Analytic_App.click();
	}else{
		System.out.println("Check Reporter Log");
		Reporter.log("ERROR! Analytin App.  Element is not  present ");	
	}
	webdriverprocessorutil.takeScreenShot("E:\\webdriverscreenshot\\verifyAnalytictab.jpg");
}
public void verifysubtabs(){
	if(ElementLocators.dashboard_tab.isDisplayed()){
		System.out.println("Dashboard tab is enabled ");
	}else{
		System.out.println("Check Reporter Log");
		Reporter.log("ERROR! Dashboard tab  Element is not  present ");	
	}
	if(ElementLocators.standardanlytic_tab.isDisplayed()){
		System.out.println("standardanlytic tab is enabled "+ElementLocators.standardanlytic_tab);
	}else{
		System.out.println("Check Reporter Log");
		Reporter.log("ERROR! standardanlytic tab  Element is not  present ");	
	}
	webdriverprocessorutil.takeScreenShot("E:\\webdriverscreenshot\\verifysubtabs.jpg");
}

public void verifycategorynameanddesc(){
	webdriverprocessorutil.WaitForElementToLoad(10000);
	System.out.println("Verify Category name of dashboard");
	if(ElementLocators.First_Category_name!=null){
		System.out.println(" Category name is Present::::  "+ ElementLocators.First_Category_name);
		ElementLocators.First_Category_name.click();
	}else{
		System.out.println("Check Reporter Log: Installbase Violation Element");
		Reporter.log("ERROR!  Installbase Violation Element is not  present ");	
	}
	if(ElementLocators.First_Category_desc!=null){
		System.out.println(" Category description is Present ");
			
	}else{
		System.out.println("Check Reporter Log");
		Reporter.log("ERROR!  Category Description  Element is not  present ");	
	}
	webdriverprocessorutil.takeScreenShot("E:\\webdriverscreenshot\\verifycategorynameanddesc.jpg");
  }
/*public void verifyclickoncategory()
{
	if(ElementLocators.First_Category_name!=null){
		System.out.println(" Category name is Present going to click");
		ElementLocators.First_Category_name.click();
	}else{
		System.out.println("Check Reporter Log: Installbase Violation Element");
		Reporter.log("ERROR!  Installbase Violation Element is not  present ");	
	}
}*/
public void verifyreportnameanddesc(){
	if(ElementLocators.First_Report_name!=null){
		System.out.println("First_Report_name is present");
		
	}else{
		System.out.println("Check Reporter Log");
		Reporter.log("ERROR!  First_Report_name Element is not present ");	
	}
	if(ElementLocators.First_Report_desc!=null){
		System.out.println(" First_Report_desc description is present");
		ElementLocators.Instance_viewer_icon.click();
	}else{
		System.out.println("Check Reporter Log:First_Report_desc");
		Reporter.log("ERROR!  First_Report_desc Description  Element is not  present ");	
	}
	webdriverprocessorutil.takeScreenShot("E:\\webdriverscreenshot\\verifyreportnameanddesc.jpg");
}
/*public void verifyinstancereporticon(){
	if(ElementLocators.Instance_viewer_icon!=null){
		System.out.println("Instance viewer icon is  present");
		ElementLocators.Instance_viewer_icon.click();
		System.out.println("Instance viewer icon is  Clicked");
	}else{
		System.out.println("Check Reporter Log");
		Reporter.log("ERROR!  First_Report_name Element is not  present ");	
	}
}*/
	
public void verifyopenedinstancereportdata(){	
	webdriverprocessorutil.WaitForElementToLoad(10000);
	if(ElementLocators.Opened_Instance_viewer_icon!=null){
		webdriverprocessorutil.WaitForElementToLoad(5000);
			System.out.println("Instance viewer icon is  opened");
	}else{
			System.out.println("Check Reporter Log");
			Reporter.log("ERROR!  First_Report_name Element is not  present ");	
		}
	if(ElementLocators.Opened_Instance_report_data!=null){
			System.out.println("Report in instance have data.");
	}else{
		System.out.println("Check Reporter Log");
		Reporter.log("ERROR!  First_Report_name Element is not  present ");	
	}
	webdriverprocessorutil.takeScreenShot("E:\\webdriverscreenshot\\verifyopenedinstancereportdata.jpg");
}
public void verifyclosingreportinstanceviewer(){
	if(ElementLocators.Closed_Instance_report!=null){
		System.out.println("Closed_Instance_report is present.");
		ElementLocators.Closed_Instance_report.click();
		System.out.println("Closed_Instance_report.");
}else{
	System.out.println("Check Reporter Log");
	Reporter.log("ERROR!  First_Report_name Element is not  present ");	
}
	webdriverprocessorutil.takeScreenShot("E:\\webdriverscreenshot\\verifyopenedinstancereportdata.jpg");
}

public  LoginOperation Login(String Username,String Password){
		return PageFactory.initElements(WebDriverProcessor.driver, LoginOperation.class);
	}
}