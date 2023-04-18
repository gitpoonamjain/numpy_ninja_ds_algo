package pageObjectModel;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.BaseClass;
import utils.Configreader;
import utils.LoggerLoad;

public class TreePage_POM {

	public static WebDriver driver =BaseClass.getdriver();
	String resisterurl = Configreader.ResisterPage();
	String signinurl = Configreader.SigninPage();
	String treeurl = Configreader.TreePage();
	String overviewtreeurl=Configreader.TreeOverviewPage();
	String tryeditorurl= Configreader.TreeOverviewPage();
	
	
	//click on getstarted tree button

	@FindBy(xpath = "//h5[text()='Tree']/..//a[text()='Get Started']") 	WebElement StartedBtn_tree;	

    @FindBy(xpath= "//a[@href='overview-of-trees']") WebElement Overviewtree;
    
    @FindBy(xpath= "//a[@href='terminologies']") WebElement Terminologies;
    @FindBy(xpath= "//a[@href='types-of-trees']") WebElement TreeType;
    @FindBy(xpath= "//a[@href='tree-traversals']") WebElement TreeTrav;
    @FindBy(xpath= "//a[@href='traversals-illustration']") WebElement TreeTravIlis;
    @FindBy(xpath= "//a[@href='binary-trees']") WebElement Binarytree;
    @FindBy(xpath= "//a[@href='types-of-binary-trees']") WebElement BinarytreeTypes;
    @FindBy(xpath= "//a[@href='implementation-in-python']") WebElement ImpPython;
    @FindBy(xpath= "//a[@href='binary-tree-traversals']") WebElement BinaryTreeTraversal;
    @FindBy(xpath= "//a[@href='implementation-of-binary-trees']") WebElement BinaryTreeImple;
    @FindBy(xpath= "//a[@href='applications-of-binary-trees']") WebElement BinaryApplication;
    @FindBy(xpath= "//a[@href='binary-search-trees']") WebElement Binarytreesearch;
    @FindBy(xpath= "//a[@href='implementation-of-bst']") WebElement BSTimplem;
    @FindBy(xpath="//a[@href='/tryEditor']") WebElement TryEditorlink;
    @FindBy(xpath="//form/div/div/div/textarea") WebElement Inputcode;
    @FindBy(xpath="//div/div/form/button") WebElement Runcode;
@FindBy(xpath="//*[@id=\"output\"]") WebElement RunResult;

    
    
    
    
    public   TreePage_POM() {
		PageFactory.initElements(driver,this);
		}

    public void TreePageUrl() {
		driver.get(treeurl);
	}
    
    public void  OverviewTreePageUrl() {
		driver.get(overviewtreeurl);
	}
    
    
    
    public void TreeGetstartedclick()
    {
    	StartedBtn_tree.click();
    }
    
    public String TreeSubpageTitle(String SubpageTitle) {
    	String status;
    	String pagetitle= driver.getTitle();
    	//System.out.println("Captured page title is" + pagetitle);
		assertEquals(pagetitle,SubpageTitle);
		
		 LoggerLoad.info("Title of current page of tree is:" + pagetitle);
		 LoggerLoad.info("Title of SubpageTitle page of tree is:" + SubpageTitle);

    	
    	if (pagetitle.equals(SubpageTitle))
    		{assertEquals(pagetitle,SubpageTitle);
    	 status = "True";
    	 return status;}
    	 else 
    	 { status="Not True";
    	 //System.out.println("pagetitle subpagetitle is" + pagetitle +SubpageTitle);
    		 		return status;}
    	
    }
    		
    	
    
    public void overviewclick()
    {
    	Overviewtree.click();
    }
    public void terminologiesclick()
    {
    	Terminologies.click();
    }
    
    public void Typesoftreeclick()
    {
    	TreeType.click();
    }
    
    public void tryeditorclick()
    {
    	TryEditorlink.click();
    }

public String tryeditorpagetitle() {
	String title=driver.getTitle();
	return title;
}

public void tryeditorinput(String entercode)  {
	//System.out.println("Entered code is" + entercode);
	//Inputcode.clear();
	
	Inputcode.sendKeys(entercode);
	//System.out.println("Post enter code. This should come twice");
}
public void runcodebutton() {
	Runcode.click();
}

public void homepagenavigate()
{
    driver.get("https://dsportalapp.herokuapp.com/home");

}

public void runresult() {
	String result = RunResult.getText();
	if (!result.isBlank())
	{
		LoggerLoad.info(result);
	System.out.println("Try run successful");
	}
	else 
		{LoggerLoad.info("invalid"+ result);
	System.out.println("Try run not successful");
	

    // return alertText;
}}
public void handlealert()
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());

	// Get the text of the alert
	String alertText = alert.getText();
	alert.accept(); // To accept the alert

	 driver.switchTo().parentFrame();
	 
	
	// Accept or dismiss the alert
	
	
    LoggerLoad.warn("checking alert message from tryeditor "+ alertText );
}



}

	

