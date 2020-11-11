package utility;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import pages.HomePage;
import pages.MenuPage;
import pages.RequestTalenPage;
import pages.searchPage;
public class BasePage {

	
	//################################################		
	//# 										 	 # 
	//# 				Page Objects		         #
	//# 										 	 # 
	//################################################
	

	public static final searchPage searchPage = new searchPage();
	public static final HomePage home = new HomePage();
	public static final RequestTalenPage talentPage = new RequestTalenPage();
	public static final MenuPage menu = new MenuPage();
	
	

	// ################################################
	// # 											  #
	// #			   utility Objects                #
	// # 											  #
	// ################################################

	public static WebDriver driver;
	public static Wrapper wrapper;
	public static ConfigFileReader configProperty;
	public static BrowserSetUp browser;
	public static final ProjectSpecificSupportFunctions NLMSupportFunctions=new ProjectSpecificSupportFunctions();
	public static DatabaseManager DatabaseManager = new DatabaseManager();
	


	// ################################################
	// # 											  #
	// # 			Class Configuration               #
	// # 											  #
	// ################################################

	
	@BeforeClass
	public static void beforeAllTestStart() {

		configProperty = new ConfigFileReader("config.properties");		
	  
	}
		
	
	@AfterClass
	public static void afterAllTestsComplete(){

		 Reporter.loadXMLConfig(new File(configProperty.readProperty("reportConfigPath")));
		 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		 Reporter.setSystemInfo("OS Name", System.getProperty("os.name"));
		 Reporter.setSystemInfo("OS Version", System.getProperty("os.version"));
		 Reporter.setSystemInfo("Application", configProperty.readProperty("ApplicationName"));
		 Reporter.setSystemInfo("Application", "SourceVu");
		 Reporter.setSystemInfo("Application Environment", System.getProperty("environmentT"));
		 Reporter.setSystemInfo("Build number", System.getProperty("jenkins.buildNumber"));
		 Reporter.setSystemInfo("Browser Type", browser.browserName);
	
		 if(driver!=null) {
			 driver.quit();
		 }
	}
}
