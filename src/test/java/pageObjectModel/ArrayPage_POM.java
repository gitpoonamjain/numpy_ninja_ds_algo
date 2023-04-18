package pageObjectModel;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import utils.Configreader;
import utils.LoggerLoad;
import utils.Utility;

public class ArrayPage_POM {
public static WebDriver driver =BaseClass.getdriver();
	
	Utility util=new Utility();
	String signinurl = Configreader.SigninPage();
	
	
	String tryEditorURL=Configreader.tryEditorURL();
	String url =Configreader.applicationUrl();
	String arrayPageurl=Configreader.arrayPageURL();
	
//	@FindBy(xpath= "//a[@href='/login']")WebElement signin;
//	@FindBy (xpath="//input[@id='id_username']")WebElement Username ;
//	@FindBy (xpath="//input[@id='id_password']")WebElement password ;
//	@FindBy (xpath="//input[@value='Login']") WebElement login;
	@FindBy (xpath="//a[@href='arrays-in-python']")WebElement arraysInPythonLink;
	@FindBy (xpath="//a[@href='arrays-using-list']")WebElement arraysUsingListLink;
	@FindBy (xpath="//a[text()='Basic Operations in Lists']") WebElement basicOperationsInListsLink;
	@FindBy (xpath="//a[@href='applications-of-array']") WebElement applicationsOfArrayLink;
	@FindBy (xpath="//a[text()='Practice Questions']") WebElement practiceQuestionsLink;
	@FindBy (xpath="//a[text()='Search the array']") WebElement searchTheArrayLink;
	@FindBy (xpath="//a[text()='Max Consecutive Ones']")WebElement maxConsecutiveOnesLink;
	@FindBy (xpath="//a[text()='Find Numbers with Even Number of Digits']") WebElement findNumbersWithEvenNumberOfDigitsLink;
	@FindBy (xpath="//a[text()='Squares of  a Sorted Array']") WebElement squaresOfASortedArrayLink;
	
	@FindBy (xpath = "//a[@href ='array']")WebElement getStartedarray;
	@FindBy (xpath="//a[@href='/tryEditor']")WebElement tryHereLink;
	@FindBy (xpath="//textarea[@tabindex='0']")WebElement editorInput;
	@FindBy (xpath="//button[text()='Run']") WebElement runButton;
	@FindBy (xpath="//pre[@id='output']") WebElement output;
	@FindBy (id="answer_form") WebElement answerform;
	@FindBy (xpath="//input[@value='Submit']") WebElement submitButton;
	
	
	public   ArrayPage_POM () {
		PageFactory.initElements(driver,this);
	}
//	public void SigninPageUrl() {
//		driver.get(signinurl);
//	}

//	public void signinclick() {
//		signin.click();
//	}
//	public void enterUserName(String username) {
//		Username.click();
//		Username.clear();
//		Username.sendKeys(username);
//	}
//
//	public void enterPassword(String pwd) {
//		password.click();
//		password.clear();
//		password.sendKeys(pwd);
//	}
//	public void loginbtn(){
//		login.click();
//		LoggerLoad.info("user enter valid username and password pom ds");
//	}
	
	public void arraypage() {
		driver.get(arrayPageurl);
		
	}
	public void  navigateTo(String pagename)
	{
		String urlName= Configreader.geturl(pagename);
		driver.get(urlName);
	}

	
	public void clickArraysInPythonLink()
	{
		LoggerLoad.info("User clicks on " +arraysInPythonLink.getText() + " in Array Page");
		arraysInPythonLink.click();
	}
	public String getPageTitle()
	{
		String Title=driver.getTitle();
		return Title;
	}
	
	public void getStartedArrayButton() {
		
		getStartedarray.click();
		
	}
	public void clickTryHereLink(String buttonName, String dataStructureName) {
		
		tryHereLink.click();
	}
	
	public void fetchPythonCode(String PythonCode)
	{
		editorInput.sendKeys(PythonCode);
	}
	
	public void clickRunButton() {
		
		runButton.click();
	}
	
	public String fetchOutput()
	{
		util.waitForElement(output);
		String Result = output.getText();
		return Result;
	}
	
	public String fetchErrorMessage()
	{
		String errorMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMessage;
	}
	
	public void clickArraysUsingListLink()
	{
		arraysUsingListLink.click();
	}
	
	public void clickbasicOperationsInListsLink()
	{
		basicOperationsInListsLink.click();
		
	}
	
	public void clickapplicationsOfArrayLink()
	{
		applicationsOfArrayLink.click();
	}
	
	public void clickpracticeQuestionsLink()
	{
		practiceQuestionsLink.click();
		
	}
	
	public void clickSearchTheArrayLink()
	{
		searchTheArrayLink.click();
	}
	
	public void enterPracticeQuestions(String sheetname, int rownumber) throws InvalidFormatException, IOException
	{
		util.waitForElement(answerform);
		String code=Utility.getCodefromExcel(sheetname, rownumber);
		util.enterPythonCodeForPractice(code, editorInput);
		
	}
	public String getExpectedResult(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException
	{
		String expectedResult=util.getResultfromExcel(sheetName, rowNumber);
		return expectedResult;
	}
	public String getActualResult()
	{
		util.waitForElement(output);
		return output.getText();
	}
	
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	public void clickMaxConsecutiveOnesLink()
	{
		maxConsecutiveOnesLink.click();
	}
	
	public void clickFindNumbersWithEvenNumberOfDigitsLink()
	{
		findNumbersWithEvenNumberOfDigitsLink.click();
	}
	
	public void clickSquaresOfASortedArrayLink()
	{
		squaresOfASortedArrayLink.click();
	}
}
