package com.gb.search.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ElementLocators {

	/*====================================================================
	 *  Sign-In page Web-Elements
	 ========================================================================*/
	@FindBy(how = How.NAME, using = "username")
	public static WebElement usernameEditbox;
	
	@FindBy(name = "password")
	public static WebElement passwordEditbox;
	
	@FindBy(how = How.NAME, using = "Log In")
	public static WebElement loginButton;

	/*===================================================================
	 *  Landing page Web-elements 
	 ====================================================================*/
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div/div/div/a/span[2]")
	public static WebElement welcomeArrow;
	
	@FindBy(how = How.LINK_TEXT, using = "Logout")
	public static WebElement logOff;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Account Name (16)")
	public static WebElement facetAccountName;
	
	@FindBy(how = How.ID, using = "facet_masterdiv_evt_namespace")
	public static WebElement facetEventSource;
		
	@FindBy(css="a > img")
	public static WebElement SaveSearchWindowIcon;
	
	@FindBy(css="#savepopupsearch > div.modal-header > a.close")
	public static WebElement SaveSearchList;
	
	@FindBy(id="gb_new_saved_search_name")
	public static WebElement saveFilterSaveName;
	
	@FindBy(id="gb_new_saved_search_desc")
	public static WebElement saveFilterSaveDescription;
	
	@FindBy(id="save_search_btn")
	public static WebElement SaveSearchSaveButton;
	/*========================================================================
	 * Account name Facets
	 =========================================================================*/
	@FindBy(css="#facet_ul_li_cust_name_BIG_FILE > span.checkbox")
	public static WebElement Facet_Account_bigfile;
	
	@FindBy(css="#facet_ul_li_cust_name_Upenn > span.checkbox")
	public static WebElement Facet_Account_Upenn;
	
	@FindBy(css="#facet_ul_li_cust_name_Google_Inc > span.checkbox")
	public static WebElement Facet_Account_Google;
	
	
	
	/*========================================================================
	 * Event Source Facets
	 =========================================================================*/
	
	@FindBy(css="#facet_ul_li_evt_namespace_auditlog > span.checkbox")
	public static WebElement Facet_EvtSource_Auditlog;
	
	@FindBy(css="#facet_ul_li_evt_namespace_syslog > span.checkbox")
	public static WebElement Facet_EvtSource_Syslog;
	
	@FindBy(css="#facet_ul_li_evt_namespace_userlog > span.checkbox")
	public static WebElement Facet_EvtSource_UserLog;
	
	
	
	/*==============================================================================
	 * Analytic OPerators
	 *===========================================================================*/
	
	@FindBy(xpath="//label[contains(.,'Analytics')]")
	public static WebElement Analytic_App;
	
	@FindBy(xpath="//a[contains(.,'Dashboards')]")
	public static WebElement dashboard_tab;
	
	@FindBy(xpath="//a[contains(.,'Standard Analytics')]")
	public static WebElement standardanlytic_tab;
	
	@FindBy(xpath="//span[contains(.,'Installbase Violation')]")
	public static WebElement First_Category_name; 
	@FindBy(xpath="//span[contains(.,'Category name')]")
	public static WebElement First_Category_desc; 
	
	@FindBy(xpath="//span[contains(.,'Insatall Report')]")
	public static WebElement First_Report_name; 
	@FindBy(xpath="//span[contains(.,'Logi Report1')]")
	public static WebElement First_Report_desc; 
	
	@FindBy(css="html.js body.bodyclass div#outer-wrapper div#main-container div#right-container div#analytics_div.ng-scope ng-include.ng-scope div.analytics div.ng-scope ng-include.ng-scope div.ng-scope div#content-container div.width-97-4-per div.ng-scope div.ng-scope div.accordionContent div.each-sub-record span.attribute-operations img")
	public static WebElement Instance_viewer_icon;
	@FindBy(xpath="//span[contains(.,' (1) Insatall Report  ')]")
	public static WebElement Opened_Instance_viewer_icon;
	
	@FindBy(xpath="span[@id='NumberofViolations']")
	public static WebElement Opened_Instance_report_data;
	@FindBy(xpath="css=#filterlink_2 > span > #filterlink-close_1")
	public static WebElement Closed_Instance_report;
	
	
	}
