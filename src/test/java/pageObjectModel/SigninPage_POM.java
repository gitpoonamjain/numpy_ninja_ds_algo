package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import utils.Configreader;
import utils.LoggerLoad;

public class SigninPage_POM {
	public static WebDriver driver =BaseClass.getdriver();
	String signinurl = Configreader.SigninPage();
	String resisterurl = Configreader.ResisterPage();
	
	@FindBy (xpath= "//a[text()='Register!']") WebElement RegisterClick;
	@FindBy(xpath= "//a[text()='Sign in']")WebElement signin;
	@FindBy (xpath="//input[@id='id_username']")WebElement Username ;
	@FindBy (xpath="//input[@id='id_password']")WebElement password ;
	@FindBy (xpath="//input[@value='Login']") WebElement login;
	@FindBy(xpath = "//div[contains(text(),'Invalid Username and Password')]")WebElement invalidusernameandpassword;
	@FindBy(xpath="//a[@href='/logout']")WebElement signoutbtn;
	
	
	public   SigninPage_POM () {
		PageFactory.initElements(driver,this);
		}
	public void SigninPageUrl() {
		driver.get(signinurl);
	}
	//User Clicks on Register link
	
   public void registerclick() {
		RegisterClick.click();	
	}
   
    public String getTitleofPage() {
		String title=driver.getTitle();
		return title;
	}
	
	public void signinclick() {
	signin.click();
	}
	
	public void enterUserName(String username) {
		Username.click();
		Username.clear();
		Username.sendKeys(username);
		
	}
	
	public void enterPassword(String pwd) {
		password.click();
		password.clear();
		password.sendKeys(pwd);
		
		
	}
	
	public void loginbtn(){
	login.click();
	LoggerLoad.info("user enter invalid username and password pom");	
		
	}
	public String geterrordetail() {
		return invalidusernameandpassword.getText();
	}
	public void logoutbtn(){
		signoutbtn.click();
	}
	
}
