package com.pratian.automation.testclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pratian.automation.pageobjects.Home;
import com.pratian.automation.utility.ExcelManager;

public class TestLogin extends BaseTest{
	
	@Test(dataProvider="login")
	public void Login(String user,String pwd) throws InterruptedException {
		Home home = new Home(driver);
		home.providelogin();
		home.provideusername(user);
		home.providepassword(pwd);
		home.clickLogin();
		Thread.sleep(10000);
	}
	
	@DataProvider(name="login")
	public Object[][] getData(){
		Object data[][] = ExcelManager.getTestData("login");
		
		return data;
	}

}
