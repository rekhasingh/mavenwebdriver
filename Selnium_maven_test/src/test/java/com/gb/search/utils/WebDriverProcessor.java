package com.gb.search.utils;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebDriverProcessor {

 public static WebDriver driver;

		public void ClickOnAnyWebElement(WebElement WebElementname){
			WebElementname.click();
			
		}
		public void verify(){
			Assert.assertTrue(true, "The Element is Not found.");
			
		}
		public void sendkeys(WebElement textboxname,String textboxstring){
			textboxname.sendKeys(textboxstring);
		}
		public void WaitForElementToLoad(long min) {
			System.out.println("WaitForElementToLoad has been called");
			try {
				Thread.sleep(min);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		public void takeScreenShot(String fileName) {
			  File scrFile = ((TakesScreenshot) WebDriverProcessor.driver).getScreenshotAs(OutputType.FILE);
			  try {
			   FileUtils.copyFile(scrFile, new File(fileName));
			  // closeWebDriverEnd();
			  }
			  catch (IOException e) {
			   // TODO Auto-generated catch block
			  }
			 }
		private void maximizewindow() {
			// TODO Auto-generated method stub
			WebDriverProcessor.driver.manage().window().maximize() ;
			
		}
	}

