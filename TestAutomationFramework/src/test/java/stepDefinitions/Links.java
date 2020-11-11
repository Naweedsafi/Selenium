package stepDefinitions;

import org.openqa.selenium.interactions.Actions;

import com.cucumber.listener.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import junit.framework.Assert;
import utility.BasePage;

public class Links extends BasePage {
	
	@Given("^User to navigate to application$")
	public void user_to_navigate_to_application() throws Throwable {
	    driver.get(configProperty.readProperty("ApplicationTestURL"));
	    wrapper.waitForPageToBeFullyLoaded(driver);
	    
	}

	@And("^user to check all broken links$")
	public void user_to_check_all_broken_links() throws Throwable {
		
	    wrapper.checkBrokenLink("a", "href");
	    wrapper.checkBrokenLink("img", "src");
	    Reporter.addStepLog(menu.getHomeByXpath().getText());
	    
	    wrapper.clickWebElement(menu.getAboutUsByXpath());
	    wrapper.checkBrokenLink("a", "href");
	    wrapper.checkBrokenLink("img", "src");
	    Reporter.addStepLog(menu.getAboutUsByXpath().getText());
	    
	    wrapper.clickWebElement(menu.getOurServiceByXpath());
	    wrapper.checkBrokenLink("a", "href");
	    wrapper.checkBrokenLink("img", "src");
	    Reporter.addStepLog(menu.getOurServiceByXpath().getText());
	    
	    wrapper.clickWebElement(menu.getCareerByXpath());
	    wrapper.checkBrokenLink("a", "href");
	    wrapper.checkBrokenLink("img", "src");
	    Reporter.addStepLog(menu.getCareerByXpath().getText());
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    wrapper.clickWebElement(menu.getFaqByXpath());
	    wrapper.checkBrokenLink("a", "href");
	    wrapper.checkBrokenLink("img", "src");
	    Reporter.addStepLog(menu.getFaqByXpath().getText());
	    
	    wrapper.clickWebElement(menu.getContactUsByXpath());
	    Actions action = new Actions(driver);
	    action.doubleClick(menu.getContactUsByXpath()).build().perform();
	    wrapper.checkBrokenLink("a", "href");
	    wrapper.checkBrokenLink("img", "src");
	    Reporter.addStepLog(menu.getContactUsByXpath().getText());
	    
	    if (wrapper.checkError) {
			Assert.assertTrue(false);
		} else {
			// do nothing
		}

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
