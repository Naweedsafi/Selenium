package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.BasePage;

public class RequestTalenPage extends BasePage {
	
	//////////// OBJECT//////////
	
	private final String enterText = "JobFunction";
	private final String enterPositionByXpath = "//input[@name='PositionHiringFor']";
	private final String toclickDropDownByName = "PositionType";
	private final String enterZipCodeByPath = "//input[@name='ZipCode']";
	private final String enterMessegeByXpath = "//textarea[@name='your-message']";
	private final String enterFirstNameByXpath = "//input[@name='FirstName']";
	private final String enterLastNameByXpath = "//input[@name='LastName']";
	private final String enterEmailByXpath = "//input[@name='WorkEmail']";
	private final String enterPhoneByXpath = "//input[@name='tel']";
	private final String enterCompanyByXpath = "//input[@name='Company']";
	private final String enterJobTitleByXpath = "//input[@name='JobTitle']";
	private final String uploadFileByXpath = "//input[@name='file-99']";
	private final String clickSendKeyByXpath = "//input[@class='wpcf7-form-control wpcf7-submit']";
	
	//////// GETTER OBJECT METHOD///////
	
	public WebElement getClickSendKeyByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(clickSendKeyByXpath));}

	public WebElement getEnterText() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.name(enterText));}
	
	public WebElement getEnterPositionByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(enterPositionByXpath));}
	
	public WebElement getToclickDropDownByName() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.name(toclickDropDownByName));}

	public WebElement getEnterZipCodeByPath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(enterZipCodeByPath));}

	public WebElement getEnterMessegeByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(enterMessegeByXpath));}

	public WebElement getEnterFirstNameByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(enterFirstNameByXpath));}

	public WebElement getEnterLastNameByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(enterLastNameByXpath));}

	public WebElement getEnterEmailByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(enterEmailByXpath));}

	public WebElement getEnterPhoneByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(enterPhoneByXpath));}

	public WebElement getEnterCompanyByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(enterCompanyByXpath));}

	public WebElement getEnterJobTitleByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(enterJobTitleByXpath));}
	
	public WebElement getUploadFileByXpath() throws Exception {
		  return  wrapper.findApplicationObjectDynamically(By.xpath(uploadFileByXpath));
	}

	public static void main(String[] args) {
	
//C:/Users/13018/Desktop/ClassCodes/CucumberFramework/TestAutomationFramework/src/main/java/TestData/New Rich Text Document.rtf

	}

}
