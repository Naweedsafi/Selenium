package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BasePage;

public class HomePage extends BasePage {
	
	
	// ################################################
	// # 											  #
	// # 				Page Object 				  #
	// # 										      #
	// ################################################
	
	private final String hireFromSoftwareTestersPoolByXpath = "(//a[contains(text(), 'Hire From Software Testers Pool')])[1]";
	private final String joinOurSoftwareTestersPool = "(//a[contains(text(),' Join Our Software Testers Pool')])[0]";
	private final String aboutUsByXpath = "(//a[contains(text(),'About Us')])[1]";
	private final String contactUsByXpath = "(//a[contains(text(),'Contact Us')])[1]";
	
	
	//################################################		
	//# 										 	 # 
	//# 		Getter Object Methods			     #
	//# 										 	 # 
	//################################################

	
	public WebElement getHireFromSoftwareTestersPoolByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(hireFromSoftwareTestersPoolByXpath));}
	
	public WebElement getJoinOurSoftwareTestersPool() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(joinOurSoftwareTestersPool));}
	
	public WebElement getAboutUsByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(aboutUsByXpath));}	
	
	public WebElement getContactUsByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(contactUsByXpath));}
		
}
			
	
	


