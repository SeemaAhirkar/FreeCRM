package com.crm.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.RegisterPage;
import com.crm.qa.testbase.Testbase;

public class LoginPageTest extends Testbase{
    LoginPage loginPage;
    RegisterPage registerPage;
	LoginPageTest() {
		super();
	}
	@BeforeTest()
	public void setUp(){
		initialization(); 
	     loginPage=new LoginPage();
	}
	
	@Test(priority=1)
	public void gotoRegisterPageTest(){
		loginPage.SignUpBtnClick();
		
	}
	@Test(priority=2)
	public void verifyLoginPageTitleTest(){
		loginPage.validateLoginPageTitle();
		
	}
	
	@AfterTest()
	public void tearDown(){
		driver.quit();
		
	}
	

}
