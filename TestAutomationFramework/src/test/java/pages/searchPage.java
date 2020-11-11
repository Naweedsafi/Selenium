package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.BasePage;

public class searchPage extends BasePage {


	// ################################################
	// # 											  #
	// # 				Page Object 				  #
	// # 										      #
	// ################################################
	
	private final String searchfieldById="realbox";
	
	private final String searchBoxByName = "q";
	private final String computerImageFoundByXpath = "//h3[text()='Computers: PC, Laptop & Tablet Options - Best Buy']";
	
	
	
	
	
	//################################################		
	//# 										 	 # 
	//# 		Getter Object Methods			     #
	//# 										 	 # 
	//################################################

		public WebElement getSearchBoxByName() throws Exception {return wrapper.findApplicationObjectDynamically(By.name(searchBoxByName));}
		public WebElement getComputerImageFoundByXpath() throws Exception {return wrapper.findApplicationObjectDynamically(By.xpath(computerImageFoundByXpath));}
		
		
	
		
}
