package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.cucumber.listener.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BasePage;

public class RequestTalent extends BasePage {

	@Given("^user send keys$")
	public void user_send_keys() throws Throwable {
		wrapper.enterTextField(talentPage.getEnterText(), "Information Technology");
		Thread.sleep(3000);
	}

	@When("^user send key for position$")
	public void user_send_key_for_position() throws Throwable {
		wrapper.enterTextField(talentPage.getEnterPositionByXpath(), "Test Engineer");
	}

	@When("^user click on dropdown$")
	public void user_click_on_dropdown() throws Throwable {
		wrapper.selectDropDown(talentPage.getToclickDropDownByName(), 1);
		Thread.sleep(3000);
	}

	@When("^user send keys Zip Code$")
	public void user_send_keys_Zip_Code() throws Throwable {
		wrapper.enterTextField(talentPage.getEnterZipCodeByPath(), "20785");
	}

	@When("^user send keys input messege$")
	public void user_send_keys_input_messege() throws Throwable {
		wrapper.enterTextField(talentPage.getEnterMessegeByXpath(), "Software testing is an investigation conducted to provide stakeholders with informa. ");	
	}

	@When("^user send keys First Name$")
	public void user_send_keys_First_Name() throws Throwable {
		wrapper.enterTextField(talentPage.getEnterFirstNameByXpath(), "Ahmad");	
	}

	@When("^user send keys Last Name$")
	public void user_send_keys_Last_Name() throws Throwable {
		wrapper.enterTextField(talentPage.getEnterLastNameByXpath(), "Fayaz");
	}

	@When("^user send keys Email$")
	public void user_send_keys_Email() throws Throwable {
		wrapper.enterTextField(talentPage.getEnterEmailByXpath(), "Ahmad.Fayaz@gmail.com");
	}

	@When("^user send keys Phone No$")
	public void user_send_keys_Phone_No() throws Throwable {
		wrapper.enterTextField(talentPage.getEnterPhoneByXpath(), "(301)860 4433");
	}

	@When("^user send keys company$")
	public void user_send_keys_company() throws Throwable {
		wrapper.enterTextField(talentPage.getEnterCompanyByXpath(), "AMC");	
	}

	@When("^user send keys job title$")
	public void user_send_keys_job_title() throws Throwable {
		wrapper.enterTextField(talentPage.getEnterJobTitleByXpath(), " ");
	}

	@Then("^user to upload file$")
	public void user_to_upload_file() throws Throwable {
		driver.findElement(By.xpath("//input[@name='file-99']")).click();
		Runtime.getRuntime().exec("C:\\Users\\13018\\Desktop\\AutoIT\\Fileupload.exe");
		
//		wrapper.fileUpload(talentPage.getUploadFileByXpath(), "C:/Users/13018/Desktop/ClassCodes/CucumberFramework/TestAutomationFramework/src/main/java/TestData/New Rich Text Document.rtf");
		Thread.sleep(3000);	
	}
	
	@Then("^user click on send key$")
	public void user_click_on_send_key() throws Throwable {
		wrapper.clickWebElement(talentPage.getClickSendKeyByXpath());
		Thread.sleep(4000);
		String actualMessege = driver.findElement(By.xpath("(//span[@class='wpcf7-not-valid-tip'])[9]")).getText();
		String expectedMessege = "The field is required.";
		Assert.assertEquals(expectedMessege, actualMessege);
		System.out.println("Actual Message is " + actualMessege);
		Reporter.addStepLog(actualMessege);
		
		//driver.findElement(By.xpath(xpathExpression))
		
	}

}



