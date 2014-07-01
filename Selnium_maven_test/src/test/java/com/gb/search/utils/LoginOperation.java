package com.gb.search.utils;

import org.openqa.selenium.support.PageFactory;


public class LoginOperation {

	WebDriverProcessor webdriverprocessorutil = new WebDriverProcessor();
	public void enterUsername(String login) {
		ElementLocators.usernameEditbox.clear();
		ElementLocators.usernameEditbox.sendKeys(login);
		
	}

	public void enterPassword(String password) {
		ElementLocators.passwordEditbox.clear();
		ElementLocators.passwordEditbox.sendKeys(password);
	}

	public void clickSigninButton() {
		ElementLocators.loginButton.click();
	}	
	public  LoginOperation Login(String Username,String Password){
		System.out.println("login operation is onnnnnn");
		enterUsername(Username);
		enterPassword(Password);
		clickSigninButton();
		webdriverprocessorutil.takeScreenShot("E:\\webdriverscreenshot\\loginpage.jpg");
		return PageFactory.initElements(WebDriverProcessor.driver, LoginOperation.class);
		}

}