package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BasePage;

public class Search extends BasePage{
	
	
	// ################################################
	// #											  #
	// # 		Cucumber Step Action Methods     	  #
	// # 								              #
	// ################################################
	
	
	  @Given("^User navigate to application$") public void
	  user_navigate_to_application() throws Throwable {
	  driver.get(configProperty.readProperty("ApplicationTestURL"));
	  wrapper.waitForPageToBeFullyLoaded(driver); }
	 
	
	
	@When("^User enter following text '\"([^\"]*)\"'in search box$")
	public void user_enter_following_text_in_search_box(String arg1) throws Throwable {
	    wrapper.enterTextField(searchPage.getSearchBoxByName(), arg1 +Keys.ENTER);
	}


	@Then("^User should see the result of the search$")
	public void user_should_see_the_result_of_the_search() throws Throwable {
		wrapper.scrollingThePageByWebObject(searchPage.getComputerImageFoundByXpath());
		
	   assertTrue(searchPage.getComputerImageFoundByXpath().isDisplayed());
	   wrapper.getEmbedScreenShot();   
	}
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
