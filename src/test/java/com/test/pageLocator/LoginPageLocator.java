package com.test.pageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.util.TestBase;

public class LoginPageLocator extends TestBase {
	
	public LoginPageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID ,using="email")
	public WebElement FBUserName;
	
	@FindBy(how=How.ID ,using="pass")
	public WebElement FBPassword;
	
	@FindBy(how=How.XPATH ,using="//*[@id=\"u_0_2\"]")
	public WebElement FBSigninbutton;

}
