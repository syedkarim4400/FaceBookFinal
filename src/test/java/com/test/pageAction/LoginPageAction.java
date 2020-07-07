package com.test.pageAction;

import com.test.pageLocator.LoginPageLocator;

public class LoginPageAction {
	
	LoginPageLocator locator= new LoginPageLocator();
	
	
	
	public void enterUserCredential (String username , String password) {
		
		locator.FBUserName.clear();
		locator.FBUserName.sendKeys(username);
		locator.FBPassword.clear();
		locator.FBPassword.sendKeys(password);
		
		
	}
	public void clickFBlogin() {
		locator.FBSigninbutton.click();
	}
		
	
	}


