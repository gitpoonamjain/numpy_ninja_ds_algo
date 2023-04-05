package stepDefination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.HomePage_POM;
import pageObjectModel.SigninPage_POM;
import utils.Configreader;
import utils.Excelreader;
import utils.LoggerLoad;

public class SigninPage_SD {
	
	SigninPage_POM Signinpage =new SigninPage_POM();
	HomePage_POM homePage= new HomePage_POM();
	String excelpath=Configreader.excelPath();
	static String username;
	static String password;
	static String errorMessage;
	
	@Given("User is on SignIn page")
	public void user_is_on_sign_in_page() {
		
		LoggerLoad.info("Usser is on signin page");
		Signinpage.SigninPageUrl();
	    
	}

	@When("User Clicks on Register link")
	public void user_clicks_on_register_link() {
		Signinpage.registerclick();
		
	    
	}

	@Then("User should be redirected to Register page")
	public void user_should_be_redirected_to_register_page() {
		
		LoggerLoad.info("User succesfully rediredct to registerpage");
	    
	}
	
	@Given("User is on register page")
	public void user_is_on_register_page() {
		LoggerLoad.info("user is on register page SD");
	    
	}

	@When("user click on loginbtn")
	public void user_click_on_loginbtn() {
		
		Signinpage.signinclick();
		
		
	    
	}

	@Then("user in on loginpage")
	public void user_in_on_loginpage() {
	LoggerLoad.info("user is on signin page SD");
	    
	}
	
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
	LoggerLoad.info("user is on signin page SD");	
	    
	}

	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String string, String string2) {
		Signinpage.enterUserName(string);
		Signinpage.enterPassword(string2);
		Signinpage.loginbtn();
	}

	@Then("click login button to verify")
	public void click_login_button_to_verify() {
	 LoggerLoad.info("Invalid username and password");
	 String errormsg= Signinpage.geterrordetail();
	 assertEquals(errormsg, "Invalid Username and Password");
	}
	
	@Given("The user is on login page")
	public void the_user_is_on_login_page() {
	LoggerLoad.info("user is on loginpage SD");
	Signinpage.SigninPageUrl();  

	}
	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String string, Integer int1) throws EncryptedDocumentException, IOException {
	    
	    Excelreader reader = new Excelreader();
	    List<Map<String, String>> testdata = reader.getData(excelpath,string);
		
		username = testdata.get(int1).get("username");
		password = testdata.get(int1).get("password");
	    errorMessage = testdata.get(int1).get("expectedresult");
		
		LoggerLoad.info("user enter username and password");
		if (username != null || password != null )
		{
			Signinpage.enterUserName(username);
			Signinpage.enterPassword(password);
			
		}			
	}
	
	@Then("click login button")
	public void click_login_button()
	{
		LoggerLoad.info("Invalid username and password");
		Signinpage.loginbtn();
		//String message=Signinpage.geterrordetail();
		//assertEquals(message, errorMessage);
		
		//String homePageTitle;
		String signinPageTitle = Signinpage.getTitleofPage();
		LoggerLoad.info("message from soumya title page " + signinPageTitle);
		String message;
		
		
		if (Signinpage.getTitleofPage().equals("Login")) {
		
			 message=Signinpage.geterrordetail();
				
		}		
		else
		{
			 message=homePage.getAlert();
			
		}
		assertEquals(message, errorMessage);		
	}
	
	@Given("The user is in the Home page with valid  log in")
	public void the_user_is_in_the_home_page_with_valid_log_in() {
	    LoggerLoad.info("user is on home page SD");
	}

	@When("The user clicks {string}")
	public void the_user_clicks(String string) {
		Signinpage.logoutbtn();
	    
	}

	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
		LoggerLoad.info("user successfully logout SD");
	    
	}


}
	
		

	




