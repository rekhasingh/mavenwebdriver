package com.gb.search.filter;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.gb.search.utils.*;

public class SavedFiltertest {
	WebDriverProcessor webdriverprocessorutil = new WebDriverProcessor();
	final WebDriver driver;
	public SavedFiltertest(WebDriver driver) {
		this.driver = driver;
		}
	public void FiltersAccountName(){
		webdriverprocessorutil.WaitForElementToLoad(3000);
		System.out.println("Select Account Name");
		webdriverprocessorutil.ClickOnAnyWebElement(ElementLocators.facetAccountName);
		System.out.println("Account name label is clicked");
		webdriverprocessorutil.WaitForElementToLoad(5000);
		webdriverprocessorutil.ClickOnAnyWebElement(ElementLocators.Facet_Account_bigfile);
		System.out.println("Aruba_file_diff is clicked.");
		webdriverprocessorutil.WaitForElementToLoad(2000);
		webdriverprocessorutil.ClickOnAnyWebElement(ElementLocators.Facet_Account_Upenn);
		System.out.println("Upen is clicked.");
		webdriverprocessorutil.ClickOnAnyWebElement(ElementLocators.Facet_Account_Google);
	}
	
	public void FiltersEventSource(){
		System.out.println("Select Event Source");
		webdriverprocessorutil.ClickOnAnyWebElement(ElementLocators.facetEventSource);
		webdriverprocessorutil.WaitForElementToLoad(3000);
		webdriverprocessorutil.ClickOnAnyWebElement(ElementLocators.Facet_EvtSource_Auditlog);
		webdriverprocessorutil.ClickOnAnyWebElement(ElementLocators.Facet_EvtSource_Syslog);
		webdriverprocessorutil.ClickOnAnyWebElement(ElementLocators.Facet_EvtSource_UserLog);
		webdriverprocessorutil.WaitForElementToLoad(3000);
	}
	
	public void SavingSaveSearch(){
		System.out.println("Open the Save search POP-UP");
		webdriverprocessorutil.WaitForElementToLoad(5000);
		webdriverprocessorutil.ClickOnAnyWebElement(ElementLocators.SaveSearchWindowIcon);
		webdriverprocessorutil.WaitForElementToLoad(3000);
		webdriverprocessorutil.sendkeys(ElementLocators.saveFilterSaveName,"rekha");
		webdriverprocessorutil.sendkeys(ElementLocators.saveFilterSaveDescription,"automated save search");
		webdriverprocessorutil.ClickOnAnyWebElement(ElementLocators.SaveSearchSaveButton);
		
	}
	public  SavedFiltertest SaveSearchDefault(){
		System.out.println("We are under Save search Filter.");
		//FiltersAccountName();
	//	FiltersEventSource();
		SavingSaveSearch();
		return PageFactory.initElements(driver, SavedFiltertest.class);
		}
}
