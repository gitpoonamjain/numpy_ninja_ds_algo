package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Configreader;
import utils.LoggerLoad;
//import utils.logger_log4j;
import base.BaseClass;

public class Queue_POM {

	public static WebDriver driver = BaseClass.getdriver();
	
	String qu_ue = Configreader.linktoqueue();
	String im_que = Configreader.linktoQueue_Implem();
	String py_ed = Configreader.py_editor();
	String q_colln= Configreader.queue_collect();
	String q_im_arr = Configreader.queue_array();
	String q_op = Configreader.queue_opns();
	String pq=Configreader.pr_quest();
	
	// Defining WebElement
	
	@FindBy(xpath="//div[5][@class='col']//a") WebElement gst_queue_button;
	@FindBy(xpath = "//a[@href='implementation-lists']") WebElement im_que_pyt;
	@FindBy(xpath = "//a[@href='/tryEditor']") WebElement try_here_button;
	@FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[1]/textarea") WebElement textarea_box;
	@FindBy(xpath="//button[text()='Run']") WebElement Run_button;
	@FindBy(xpath="//div/pre[@id='output']") WebElement out_put;
	
	public Queue_POM()
	{
		PageFactory.initElements(driver,this);
	}
	
    public void getstart_queue()
{
	gst_queue_button.click();
	
}

public void implement_queue()
{
	im_que_pyt.click();
}
public void call_que_implement()
{
	driver.get(im_que);
}

public void call_que_colln()
{
    System.out.println("------------QUEUE COLLECTION IMPLEMENTTATION:------"+q_colln);
	driver.get(q_colln);
	
}

public void call_qu_imp_array()
{
	driver.get(q_im_arr);
}

public void call_array_op()
{
	driver.get(q_op);
}

public void  call_prt_qut()
{
	driver.get(pq);
}

public void try_button()
{
	try_here_button.click();
}

public String textarea(String str)
{
	textarea_box.sendKeys(str);
	return str;
}
public void run_but()
{
	Run_button.click();
	
}
	
	
public void result()
{
	String res=out_put.getText();
	System.out.println("***********RESULT:"+res); 
	
}

public String cap_alert()
{
	String gt_text = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	LoggerLoad.warn("--------------ERROR MESSAGE FROM ALERT-------------"+gt_text);
	return gt_text;
	
}

}

