package stepDefination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Datastructure_POM;
import pageObjectModel.HomePage_POM;
import pageObjectModel.SigninPage_POM;
import utils.Configreader;
import utils.Excelreader;
import utils.LoggerLoad;

public class DatastructurePage_SD {
	SigninPage_POM Signinpage =new SigninPage_POM();
	HomePage_POM homePage= new HomePage_POM();
	Datastructure_POM datastructure = new Datastructure_POM();
	String excelpath=Configreader.excelPath();
	static String phythoncode;
	
	
	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {

	}

	@Then("The user clicl signinbtn")
	public void the_user_clicl_signinbtn() {
		datastructure.signinclick();
	}

	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String string, String string2) {
		datastructure.enterUserName(string);
		datastructure.enterPassword(string2);
	}

	@When("The user click on login button")
	public void the_user_click_on_login_button() {
		datastructure.loginbtn();
	}
	@When("The user clicks the {string} button in Data Structure Page introduction Panel")
	public void the_user_clicks_the_button_in_data_structure_page_introduction_panel(String string) {
		datastructure.dsclick();
	    
	}
	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String string) {
		LoggerLoad.info("User is on data structure page SDDS");
	    
	}

	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
		
		datastructure.timecomplexity();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		LoggerLoad.info("The user should be redirected to Time Complexity page SDDS");
	    
	}

	@When("The user clicks {string} button on {string} page")
	public void the_user_clicks_button_on_page(String string, String string2) {
		datastructure.tryhere();
	}
	
	@Given("The user is in page having an tryEditor with a Run button to test")
	public void the_user_is_in_page_having_an_try_editor_with_a_run_button_to_test() {
	   datastructure.loadTryEditorpage();
	}
	
	@When("user enter the Python code | print\"DataStructure Introduction\" |")
	public void user_enter_the_python_code_print_data_structure_introduction() {
		datastructure.tryeditor("print\"DataStructure Introduction\"");
	}

//	@When("The user gets input from sheet {string} and {int}")
//	public void the_user_gets_input_from_sheet_and(String string, Integer int1) throws EncryptedDocumentException, IOException {
//		
//		 Excelreader reader = new Excelreader();
//		    List<Map<String, String>> testdata = reader.getData(excelpath,string);
//			
//		    phythoncode = testdata.get(int1).get("code");
//			String output = testdata.get(int1).get("output");
//			
//			
//			LoggerLoad.info("python code : " + phythoncode);
//			if (phythoncode != null )
//			{
//				datastructure.tryeditor(phythoncode);	
				
			//}			
		//}
	    
	

	@When("The user clicks on Run button")
	public void the_user_clicks_on_run_button() {
	    datastructure.runPython();
	}

	@Then("The user should be presented with Run output")
	public void the_user_should_be_presented_with_run_output() {
		assertEquals(datastructure.readOutput(), "DataStructure Introduction");
	}
	
	@Given("The user is in a page having an tryEditor")
	public void the_user_is_in_a_page_having_an_try_editor() {
		datastructure.loadTryEditorpage();
		LoggerLoad.info("user try to do negative test");
	   
	}

	@When("user enter the  code | print DataStructure Introduction\" |")
	public void user_enter_the_code_print_data_structure_introduction() {
		datastructure.tryeditor("print DataStructure Introduction\"");
	    
	}

	@When("The user clicks on button")
	public void the_user_clicks_on_button() {
		
		datastructure.runPython();
	    
	}

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
	   String message=datastructure.alert();
	}

	
	
	
	

	


	



}
