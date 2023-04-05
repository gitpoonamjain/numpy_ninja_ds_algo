package stepDefination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjectModel.ResisterPage_POM;
import utils.Configreader;
import utils.Excelreader;
import utils.LoggerLoad;

public class ResisterPage_SD {
	ResisterPage_POM ResisterPage=new ResisterPage_POM();
	
	String excelpath=Configreader.excelPath();
	static String username;
	static String password;
	static String confirmpwd;
	static String errorMessage;
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		ResisterPage.ResisterPageUrl();
	}

	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String string) {
		ResisterPage.ResisterPageClick();
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String string) {
		ResisterPage.warringUserName();
	    
	}
	@When("User click Register with username as {string} only")
	public void user_click_register_with_username_as_only(String string) {
		ResisterPage.SetUsernameField(string);
		ResisterPage.ResisterPageClick();
	}

	@Then("User verify the message at password on Register Page as {string}")
	public void user_verify_the_message_at_password_on_register_page_as(String string) {
		
		ResisterPage.warringPassword(string);
	    
	}
	@When("User click Register with password as {string} only")
	public void user_click_register_with_password_as_only(String string) {
		ResisterPage.SetPasswordField(string);
		ResisterPage.ResisterPageClick();
	    
	}

	@Then("User verify the message at confirmation password on Register Page as {string}")
	public void user_verify_the_message_at_confirmation_password_on_register_page_as(String string) {
		ResisterPage.warringconfirmPassword(string);
	    
	}
	
	/*
	@Given("The user is on Register Page")
	public void the_user_is_on_register_page() {
	    
	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String Sheetname , Integer RowNumber) throws InvalidFormatException, IOException {
		Excelreader reader = new Excelreader();
	    List<Map<String, String>> testdata = reader.getData(excelpath,Sheetname);
		
		username = testdata.get(RowNumber).get("username");
		password = testdata.get(RowNumber).get("password");
		confirmpwd = testdata.get(RowNumber).get("confirmpassword");	
	    errorMessage = testdata.get(RowNumber).get("expectedresult");
		
		LoggerLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" Confirm password as\" "+ confirmpwd);
		if (username != null || password != null || confirmpwd != null)
		{
		ResisterPage.SetUsernameField(username);
		ResisterPage.SetPasswordField(password);
		ResisterPage.SetConfirmPasswordField(confirmpwd);
		}
		
		ResisterPage.ResisterPageClick();
		
	}

	@Then("User clicks Register button")
	public void user_clicks_register_button() {
		//ResisterPage.ResisterPageClick();
	    String mes2 =ResisterPage.GetErrorMsg();
	    assertEquals(mes2, errorMessage);	    
	    //assertEquals(mes2, message);
	    LoggerLoad.info("Message from Register click SD: " + mes2 + " -- " + errorMessage);
	}
	*/

	@When("user enter the sheetname {string} and row number {int}")
	public void user_enter_the_sheetname_and_row_number(String string, Integer int1) throws EncryptedDocumentException, IOException {
		Excelreader reader = new Excelreader();
	    List<Map<String, String>> testdata = reader.getData(excelpath,string);
		
		username = testdata.get(int1).get("username");
		password = testdata.get(int1).get("password");
		confirmpwd = testdata.get(int1).get("confirmpassword");	
	    errorMessage = testdata.get(int1).get("expectedresult");
		
		LoggerLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" Confirm password as\" "+ confirmpwd);
		if (username != null || password != null || confirmpwd != null)
		{
		ResisterPage.SetUsernameField(username);
		ResisterPage.SetPasswordField(password);
		ResisterPage.SetConfirmPasswordField(confirmpwd);
		}
	}

	@Then("user click on Register button")
	public void user_click_on_register_button() {
		ResisterPage.ResisterPageClick();
		String mes2 =ResisterPage.GetErrorMsg();
		LoggerLoad.info(mes2 + " --- " + errorMessage);
	    assertEquals(mes2, errorMessage);	    
	    //assertEquals(mes2, message);
	    LoggerLoad.info("Message from Register click SD: " + mes2 + " -- " + errorMessage);
	}
	
	@Given("The user clicks on signin  link on register page")
	public void the_user_clicks_on_signin_link_on_register_page() {
		
		ResisterPage.signinclick();
	    
	}

	@Then("The user redirected to signinpage from registerpage")
	public void the_user_redirected_to_signinpage_from_registerpage() {
		
		 LoggerLoad.info("user is on login page");
	    
	}


	
	}


