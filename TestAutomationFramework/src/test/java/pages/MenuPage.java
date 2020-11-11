package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BasePage;

public class MenuPage extends BasePage {
	
	//######### Objects  ############
	
	private final String HomeByXpath =			"//li[@id='menu-item-2725']";
	private final String AboutUsByXpath =  		"//li[@id='menu-item-2548']";
	private final String OurServiceByXpath =    "//li[@id='menu-item-2726']";
	private final String CareerByXpath =        "//li[@id='menu-item-2959']";
	private final String faqByXpath = 			"//li[@id='menu-item-2549']";
	private final String ContactUsByXpath =     "//li[@id='menu-item-2727']";
	
	
	//####### Getter Method #########
	
	
	public WebElement getHomeByXpath() throws Exception {return wrapper.findApplicationObjectDynamically(By.xpath(HomeByXpath));}
	public WebElement getAboutUsByXpath() throws Exception {return wrapper.findApplicationObjectDynamically(By.xpath(AboutUsByXpath));}
	public WebElement getOurServiceByXpath() throws Exception {return wrapper.findApplicationObjectDynamically(By.xpath(OurServiceByXpath));}
	public WebElement getCareerByXpath() throws Exception {return wrapper.findApplicationObjectDynamically(By.xpath(CareerByXpath));}
	public WebElement getFaqByXpath() throws Exception {return wrapper.findApplicationObjectDynamically(By.xpath(faqByXpath));}
	public WebElement getContactUsByXpath() throws Exception {return wrapper.findApplicationObjectDynamically(By.xpath(ContactUsByXpath));}
	
}
