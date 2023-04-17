package stepDefination;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjectModel.ResisterPage_POM;
import pageObjectModel.TreePage_POM;
import pageObjectModel.HomePage_POM;



import utils.Configreader;
import utils.Excelreader;
import utils.LoggerLoad;

public class TreePage_TryEditor {
	TreePage_POM TreePage=new TreePage_POM();

	String tryeditorpageurl = Configreader.TryEditorPage();
	

@Given("User is on Tree Subpage {string}")
public void user_is_on_tree_subpage(String Subpagename) {
    // Write code here that turns the phrase above into concrete actions
	
	
	String Titlestatus= TreePage.TreeSubpageTitle(Subpagename);
	
if (Titlestatus=="True"	)
{
System.out.println("on page" + Subpagename);
LoggerLoad.info("User on" + Subpagename);
//System.out.println("title status is " + Titlestatus);

}

else
{ LoggerLoad.error("Not on "+ Subpagename);
//System.out.println("user Not on tree overview page");
//System.out.println("title status is " + Titlestatus);



}

	
    //throw new io.cucumber.java.PendingException();
}

@When("User Clicks on TryEditor link")
public void user_clicks_on_try_editor_link() {
    // Write code here that turns the phrase above into concrete actions
	TreePage.tryeditorclick();
System.out.println("When when when Inside when of try editor link");
   // throw new io.cucumber.java.PendingException();
}

@Then("redirect to a page having an tryEditor with a Run button to test")
public void redirect_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
    // Write code here that turns the phrase above into concrete actions
	//String homePageTitle;
	//System.out.println("Inside redirect to a page with run test button 11:00 PM");
	String Trypagename="Assessment";
	String TryTitlestatus= TreePage.TreeSubpageTitle(Trypagename);
	
	if (TryTitlestatus=="True"	)
	{
System.out.println("Tryeditor clicking" + Trypagename);
	LoggerLoad.info("User on" + Trypagename);

	}

	else
	{ LoggerLoad.error("Not on "+ Trypagename);
	//System.out.println("user Not on tree overview page");
	//System.out.println("title status is " + Titlestatus);



	}

		
	   // throw new io.cucumber.java.PendingException();
	}

@Then("runcode in try editor page with valid input")
public void runcode_in_try_editor_page_with_valid_input() {
    // Write code here that turns the phrase above into concrete actions
System.out.println("inside the valid input");
	
    TreePage.tryeditorinput("print 2+3");
    TreePage.runcodebutton();
    TreePage.runresult();
    
    
   // throw new io.cucumber.java.PendingException();

    
    
}

@Then("runcode in try editor page invalid input error")
public void runcode_in_try_editor_page_invalid_input_error() {
    // Write code here that turns the phrase above into concrete actions
	TreePage.driver.navigate().refresh();
	
	TreePage.tryeditorinput("PRINT TEST");
    TreePage.runcodebutton();
TreePage.handlealert();
    TreePage.runresult();
System.out.println("navigate ready");
	TreePage.driver.navigate().to("https://dsportalapp.herokuapp.com/home");
    //throw new io.cucumber.java.PendingException();
}

}
