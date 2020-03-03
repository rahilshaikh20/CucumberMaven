package stepDefinition;

import cucumber.api.java.en.But;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GoogleFeature {
	
	
	/*
	 * public static WebDriver driver= Hooks.getDriver();
	 * 
	 */

@Given("^CRM application is logged in$")
public void crm_application_is_logged_in() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("**User successfully Loggedin *** ");
    
}

@When("^User creates a customer$")
public void user_creates_a_customer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("**Customer successfully created *** ");
	Assert.assertTrue(true);
   
}

@When("^User provides the documents$")
public void user_provides_the_documents() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("**Documents provided to the user *** ");
    
}

@Then("^User can see it's information updated$")
public void user_can_see_it_s_information_updated() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("**** Info updated *** ");
	Assert.assertTrue(false);
    
}


}
