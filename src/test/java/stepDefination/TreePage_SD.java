package stepDefination;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjectModel.ResisterPage_POM;
import pageObjectModel.TreePage_POM;
import pageObjectModel.HomePage_POM;



import utils.Configreader;
import utils.Excelreader;
import utils.LoggerLoad;

public class TreePage_SD {
	
	TreePage_POM TreePage=new TreePage_POM();
	HomePage_POM HomePagePOM=new HomePage_POM();
	
	SigninPage_SD Signin_1=new SigninPage_SD();
	HomePage_SD HomePage_1=new HomePage_SD();
	TreePage_TryEditor tryeditorlink = new TreePage_TryEditor();
	
	
		@Given("User on tree page after loggedin")
	public void user_on_tree_page_after_loggedin() {
			HomePage_1.user_opens_the_dsalgo_portal_link();
			HomePage_1.user_clicks_on_button("Get Started");
			
			HomePage_1.the_user_opens_home_page();
			Signin_1.user_click_on_loginbtn();
			Signin_1.the_user_enter_invalid_and("bahnisikha.dalbehera@gmail.com", "Bahnirupa");
			//Signin_1.click_login_button();
			System.out.println("Logged in poonam");
			//HomePage_1.the_user_is_on_home_page();
			//HomePage_1.the_user_click_any_of_the_get_started_button_in_home_page("Tree");
			
			HomePagePOM.getTitleofPage();
			//System.out.println("GOT title");
			//System.out.println(HomePagePOM.getTitleofPage());
			//HomePagePOM.getStarted_home("Tree");
			//System.out.println("Clicked Data Structures");
//			HomePagePOM.dropDown();
	//		HomePagePOM.clickDropdown("Tree");
			//System.out.println("Damn did i ckick tree?");
			//TreePage.TreeGetstartedclick();
				
			
			
			
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on overview of trees link")
	public void user_clicks_on_overview_of_trees_link() {
	    // Write code here that turns the phrase above into concrete actions
				TreePage.TreePageUrl();
		TreePage.overviewclick();
		
		
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("Overview of trees page should open")
	public void overview_of_trees_page_should_open() {
		
	
		System.out.println("on Overview Page poonam");
		
		
		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Title of page should be overview of trees")
	public void title_of_page_should_be_overview_of_trees() {

		tryeditorlink.user_is_on_tree_subpage("Overview of Trees");
		tryeditorlink.user_clicks_on_try_editor_link();
		tryeditorlink.redirect_to_a_page_having_an_try_editor_with_a_run_button_to_test();
		tryeditorlink.runcode_in_try_editor_page_with_valid_input();
		tryeditorlink.runcode_in_try_editor_page_invalid_input_error();
		
		
		
		Signin_1.the_user_clicks("Sign out");
		//HomePage_POM.driver.close();




		//System.out.println("Overview Page title");
		//tring Titlestatus= TreePage.TreeSubpageTitle("Overview of Trees");
		
//if (Titlestatus=="True"	)
//{
	//System.out.println("Tryeditor clicking");
	
//TreePage.tryeditorclick();
//}

//else
//{ LoggerLoad.error("Not on Tree Overview Page");
//System.out.println("user Not on tree overview page");
//System.out.println("title status is " + Titlestatus);


 
// }


	

		
		

		// Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	
	

}
