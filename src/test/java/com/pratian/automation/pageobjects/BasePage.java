/**
 * 
 */
package com.pratian.automation.pageobjects;

import org.openqa.selenium.WebDriver;

/**
 * @author Prithwiraj Sarkar
 *
 */
public class BasePage {
	private WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver = driver;// calling web driver
	}

}
