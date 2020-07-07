package stepDefs;

import com.test.pageAction.LoginPageAction;
import com.test.util.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends TestBase{
	LoginPageAction action = new LoginPageAction();
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	    getDriver(URL);
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String username, String password) throws Throwable {
	    action.enterUserCredential(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Then("^user click Signin$")
	public void user_click_Signin() throws Throwable {
	    action.clickFBlogin();
	

	}
}
