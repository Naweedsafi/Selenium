package stepDefinitions;

import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BasePage;

public class Home extends BasePage {
	
	// this is the home page of Whizport
	
	@Then("^user scroll down '\"([^\"]*)\"'$")
	public void user_scroll_down(String arg1) throws Throwable {
		wrapper.scrollingInThePageByPixels(arg1);
	    Thread.sleep(2000);
	}

	@When("^user click on hire from software talent pool$")
	public void user_click_on_hire_from_software_talent_pool() throws Throwable {
		wrapper.clickHiddenElement(home.getHireFromSoftwareTestersPoolByXpath());
		Thread.sleep(3000);
	}
	@When("^user click on Join Our Software Testers Pool$")
	public void user_click_on_Join_Our_Software_Testers_Pool() throws Throwable {
	    wrapper.clickHiddenElement(home.getJoinOurSoftwareTestersPool());
	    Thread.sleep(3000);
	}

	@When("^user click on About Us$")
	public void user_click_on_About_Us() throws Throwable {
	    wrapper.clickWebElement(home.getAboutUsByXpath());
	    Thread.sleep(3000);
	}

	@Then("^user click on Contact Us$")
	public void user_click_on_Contact_Us() throws Throwable {
	   // wrapper.clickWebElement(home.getContactUsByXpath());
		//home.getContactUsByXpath();
		Actions action  = new Actions(driver);
		action.doubleClick(home.getContactUsByXpath()).build().perform();
	    wrapper.getEmbedScreenShot();
	    Thread.sleep(3000);
	}
	
}
	
