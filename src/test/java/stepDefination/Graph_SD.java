package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.GraphPage_POM;
import pageObjectModel.HomePage_POM;

import pageObjectModel.SigninPage_POM;

//import utils.logger_log4j;
import utils.LoggerLoad;

public class Graph_SD {
    
	
	HomePage_POM home_page =new HomePage_POM();
	SigninPage_POM spom = new SigninPage_POM();
	GraphPage_POM graphPage=new GraphPage_POM();
	
	
	@Given("user is on Signin of DS Algo portal")
	public void user_is_on_signin_of_ds_algo_portal() {
		graphPage.click_signin();
	}

	
	@When("user enters {string} and {string}")
    public void user_enters_and(String string, String string2) {
		 spom.enterUserName(string);   
		 spom.enterPassword(string2);
	      
    	}
	

	@When("user clicks on login button")
    public void the_user_click_on_login_button() {
    
		 spom.signinclick();
	}


	@Then("user redirected to Home Page of DsAlgo Portal")
	public void user_redirected_to_home_page_of_ds_algo_portal() {
		 //  graphPage.home_page();
		}

	@Given("User is on Home Page of DsAlgo Portal")
	public void user_is_on_home_page_of_ds_algo_portal() {
	   graphPage.home_page();
	}

	@When("User clicks on Graph Get started button")
	public void user_clicks_on_graph_get_started_button() {
		LoggerLoad.info("----------------User clicks on Graph Get started button----------------------");
	    graphPage.getstartedbutton_graph();
	}

	@Then("User re-directed to Graph Page")
	public void user_re_directed_to_graph_page() {
		LoggerLoad.info("----------------User is on Graph Page----------------------");
	}

	@Given("User is on Graph Data Structure Page")
	public void user_is_on_graph_data_structure_page() {
		LoggerLoad.info("----------------User is on Graph Data Structure Page----------------------");
	}

	@When("User clicks on Graph link in Graph Page")
	public void user_clicks_on_graph_link_in_graph_page() {
		LoggerLoad.info("----------------User clicks on Graph link in Graph Page----------------------");
		graphPage.grph_link();
	}

	@Then("User is re-directed to Graphlink of Graph Page")
	public void user_is_re_directed_to_graphlink_of_graph_page() {
		LoggerLoad.info("----------------User is re-directed to Graphlink of Graph Page----------------------");
	}

	@Given("User is on Graph link of Graph Page")
	public void user_is_on_graph_link_of_graph_page() {
		LoggerLoad.info("----------------User is on Graph link of Graph Page----------------------");
	}

	
	
	@When("User clicks on Try here button of Graph page")
	public void user_clicks_on_try_here_button_of_Graph_page() {
		LoggerLoad.info("----------------User clicks on Try here button----------------------");
		graphPage.clck_try_button();  
	}

	@Then("User is re-directed to tryEditor Page")
	public void user_is_re_directed_to_try_editor_page() {
		LoggerLoad.info("----------------User is re-directed to tryEditor Page----------------------");   
	}

	@Given("User is on tryEditor Page")
	public void user_is_on_try_editor_page() {
		LoggerLoad.info("----------------User is on tryEditor Page----------------------");   
	}

	@When("User enters Valid Python code {string}")
	public void user_enters_valid_python_code(String string) {
		LoggerLoad.info("----------------User enters Valid Python code----------------------");
	    graphPage.pass_code_txtarea(string);
	}
	
	

	@When("clicks on Run button")
	public void clicks_on_run_button() {
		LoggerLoad.info("----------------clicks on Run button---------------------");
		graphPage.run_button();
	}

	@Then("User is presented with the Result")
	public void user_is_presented_with_the_result() {
		LoggerLoad.info("----------------User is presented with the Result---------------------");
		graphPage.result();
		
	 }
	@Given("User is on Graph Page")
	public void user_is_on_graph_page() {
		LoggerLoad.info("---------------User is on graph Page---------------------");
		graphPage.grph_link();
		LoggerLoad.info("---------------User is NAVIGATED TO graph Page---------------------");
	}

    
//	@Given("User is on graph Page")
//public void user_is_on_graph_page() {
//		logger_log4j.info("---------------User is on graph Page---------------------");
//		graphPage.grph_link();
//		logger_log4j.info("---------------User is NAVIGATED TO graph Page---------------------");
//	}
	@When("User clicks on  Graph Representations link")
	public void user_clicks_on_graph_representations_link() {
		LoggerLoad.info("----------------User clicks on  Graph Representations link---------------------");
		graphPage.grph_rep_link();
	}
	
	@When("User enters  code {string}")
	public void user_enters_code(String string) {
		LoggerLoad.info("----------------User clicks on  Graph Representations link---------------------");
		graphPage.pass_code_txtarea(string);
		//graphPage.grph_rep_link();
	}
	

	@Then("User is presented with Error Message")
	public void user_is_presented_with_error_message() {
		LoggerLoad.info("----------------User is presented with Error Message---------------------");
	    graphPage.capture_alert();
	}


	

	@Then("User is navigated to Graph Representations Page")
	public void user_is_navigated_to_graph_representations_page() {
	    
		LoggerLoad.info("--------------User is navigated to Graph Representations Page---------------------");
	}

	
	@Given("User is on Graph Representations Page")
	public void user_is_on_graph_representations_page() {
	   
		LoggerLoad.info("--------------User is on Graph Representations Page---------------------");
	}
	
	
	@When("User clicks on Try here button of Graph Representations page")//n
	public void user_clicks_on_try_here_button_of_graph_representations_page() {
		LoggerLoad.info("--------------User clicks on Practice Questions link---------------------");
		graphPage.clck_try_button();  
	   
	}
	

	@When("User clicks on  Practice Questions of Graph page")
	public void user_clicks_on_practice_questions_of_graph_page() {
		LoggerLoad.info("--------------User clicks on Practice Questions link---------------------");
		graphPage.grph_prac_quest();
	   
	}

	@Then("The user should be redirected to Practice Questions of Graph page")
	public void the_user_should_be_redirected_to_practice_questions_of_graph_page() {
		LoggerLoad.info("--------------User is navigated to Practice Questions Page---------------------");
	}
	
	
	
}
