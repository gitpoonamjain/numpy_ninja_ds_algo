package pageObjectModel;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseClass;
import utils.Configreader;
import utils.LoggerLoad;

public class ResisterPage_POM {
	
	public static WebDriver driver =BaseClass.getdriver();
	String resisterurl = Configreader.ResisterPage();
	String signinurl = Configreader.SigninPage();
	
	//click on resister button
	
	@FindBy (xpath="//input[@value='Register']")WebElement resisterClick;
	@FindBy (name="username")WebElement username;
	@FindBy (name="password1")WebElement password;
	@FindBy (name="password2")WebElement confirmPassword;
	@FindBy (xpath="//div[@class='alert alert-primary']" ) WebElement errorMsg;
	@FindBy(xpath="//a[@href ='/login']")WebElement signin;
	
		public   ResisterPage_POM () {
		PageFactory.initElements(driver,this);
		}
	
		public void ResisterPageUrl() {
			driver.get(resisterurl);
		}
		
		public void warringUserName() {
	
			@SuppressWarnings("unused")
			String validationMessage = username.getAttribute("validationMessage");
			LoggerLoad.info("Please fill out username field");
		}
	
		public void SetUsernameField(String uname) {
			
			username.click();
			username.clear();
			username.sendKeys(uname);
			//resisterClick.click();
		}
		public void warringPassword(String String) {
			
			@SuppressWarnings("unused")
			String validationMessage = username.getAttribute("validationMessage");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			LoggerLoad.info("Please fill out password  field");
		
		}
		
		public void SetPasswordField(String PWD) {

			password.click();
			password.clear();
			password.sendKeys(PWD);
			//resisterClick.click();
	
		}
		
		public void SetConfirmPasswordField(String confPwd) {

			confirmPassword.click();
			confirmPassword.clear();
			confirmPassword.sendKeys(confPwd);
			//resisterClick.click();
	
		}
		
		public void ResisterPageClick() {
			resisterClick.click();
		}
		
		public void warringconfirmPassword(String String) {

			@SuppressWarnings("unused")
			String validationMessage = confirmPassword.getAttribute("validationMessage");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			LoggerLoad.info("Please fill out password confirmation field");
		
		}
		
		public String GetErrorMsg() {
			//LoggerLoad.info("verify the warn message");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String wmes1=errorMsg.getText();
			//LoggerLoad.warn(wmes1);
			return wmes1;
		}
		
		public void signinclick() {
			signin.click();
		}
}
	

