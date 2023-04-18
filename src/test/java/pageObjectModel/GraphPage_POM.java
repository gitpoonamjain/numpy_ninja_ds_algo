package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import utils.LoggerLoad;
import utils.Configreader;
//import utils.logger_log4j;

public class GraphPage_POM {

	public static WebDriver driver =BaseClass.getdriver();
	String hm_pg_url = Configreader.homePage();
	String graphurl = Configreader.GraphPage();
	String graphlinkurl = Configreader.GraphlinkPage();
	String gr_replinkurl = Configreader.GraphReplinkPage();
	String gr_prc_linkurl = Configreader.GraphPQlinkPage();
	String sign_in = Configreader.sigin();
	
	public GraphPage_POM()
	{
		PageFactory.initElements(driver,this);
	}
	
	// Defining WebElement
	
	@FindBy(xpath="//div[7][@class='col']//a") WebElement gst_queue_button;
	@FindBy(xpath="//ul[2]/a[text()='Graph']") WebElement graph_link;
	@FindBy(linkText="//a[contains(text(),'Graph Representations')]") WebElement gra_rep;
	
	//@FindBy (xpath ="//a[contains(text(),'Graph Representations')]")WebElement graphrep_link;
	@FindBy(linkText="Try here>>>") WebElement try_hr;
	//@FindBy (xpath ="//form/div/div/div/textarea")
//	WebElement textEditor; 
//	@FindBy(xpath="//form//div[@class='input']/textarea") WebElement txt_area;
	@FindBy(xpath="//form/div/div/div/textarea") WebElement txt_area;
	//@FindBy(xpath="//button[text()='Run']") WebElement Run_button;
	@FindBy(xpath="//button[text()='Run']") WebElement Grap_Run;
	@FindBy(xpath="//div/pre[@id='output']") WebElement out_put;
	 @FindBy(linkText="Sign in") WebElement Signin;
	public void home_page()
	{
		driver.get(hm_pg_url);
	}
	public void click_signin() {
		driver.get(sign_in);
		//Signin.click();
	}
	
	public void getstartedbutton_graph()
	{
		gst_queue_button.click();
		
	}
	public void grph_link()
	{
	    // graph_link.click();
		driver.get(graphlinkurl);
	
	}
	public void clck_try_button()
	{
		try_hr.click();
	}
	public String pass_code_txtarea(String val)
	{
		txt_area.sendKeys(val );
		return val;
	}
	
	public void run_button()
	{
		Grap_Run.click();
	}
	
	
	public void grph_rep_link()
	{
		//gra_rep.click();
		driver.get(gr_replinkurl);
	}
	public void grph_prac_quest()
	{
		driver.get(gr_prc_linkurl);   
	}
	
	public void result()
	{
		String res=out_put.getText();
		System.out.println("***********RESULT:"+res); 
		
	}
	
	public String capture_alert()
	{
		String gt_text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		LoggerLoad.warn("--------------ERROR MESSAGE FROM ALERT-------------"+gt_text);
		return gt_text;
		
	}
	// 


}
