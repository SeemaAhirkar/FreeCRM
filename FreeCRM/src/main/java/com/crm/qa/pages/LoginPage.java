package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.testbase.Testbase;

public class LoginPage extends Testbase{
	
	 
	//Page Factory
	@FindBy(linkText="Sign Up")
	WebElement signUpBtn;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
		
	}
	
	public RegisterPage SignUpBtnClick(){
	
		signUpBtn.click();
		return new RegisterPage();
		
	}
	
	

}
