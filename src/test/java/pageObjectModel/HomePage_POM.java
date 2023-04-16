package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import utils.Configreader;
import utils.LoggerLoad;

public class HomePage_POM {
	
	public static WebDriver driver =BaseClass.getdriver();
	String url =Configreader.applicationUrl();
	String homePageurl=Configreader.homePage();
	//start button
	@FindBy (xpath="//button[@class='btn']")WebElement getStartedbtn;
	@FindBy (xpath="/html/body/div[2]")WebElement alertMessage;

	//User is on Home page and click getstarted link on  home page without sign in

	//Home Page
	@FindBy(xpath = "//h5[text()='Data Structures-Introduction']/..//a[text()='Get Started']") WebElement getStartedBtn_DS;
		
	@FindBy(xpath = "//h5[text()='Array']/..//a[text()='Get Started']") WebElement getStartedBtn_array;	
	
	@FindBy(xpath = "//h5[text()='Linked List']/..//a[text()='Get Started']") WebElement getStartedBtn_linkedlist;
	
	@FindBy(xpath = "//h5[text()='Stack']/..//a[text()='Get Started']") WebElement getStartedBtn_stack;
	
	@FindBy(xpath = "//h5[text()='Queue']/..//a[text()='Get Started']") WebElement getStartedBtn_queue;
	
	@FindBy(xpath = "//h5[text()='Tree']/..//a[text()='Get Started']") 	WebElement getStartedBtn_tree;	
	
	@FindBy (xpath="//h5[text()='Graph']/..//a[text()='Get Started']")  WebElement getStartedBtn_graph;
	
	
	//dropdown
		@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']") WebElement dsDropdown;
		//@FindBy (xpath="//div[@class='dropdown-menu']")WebElement dsDropdwn;
		@FindBy(xpath = "//div[@class='dropdown-menu show']/a[1]") WebElement dropDownarray;
		@FindBy(xpath = "//div[@class='dropdown-menu show']/a[2]") WebElement dropDownlinkedlist;
		@FindBy(xpath = "//a[text()='Stack']") WebElement dropDownstack;
		@FindBy(xpath = "//div[@class='dropdown-menu show']/a[4]") WebElement dropDownqueue;
		@FindBy(xpath = "//div[@class='dropdown-menu show']/a[5]") WebElement dropDowntree;
		@FindBy(xpath = "//div[@class='dropdown-menu show']/a[6]") WebElement dropDowngraph;

		//SignIn
		@FindBy(xpath="//a[@href ='/login']")WebElement signin;
		
		//Register
		@FindBy(xpath="//a[@href ='/register']")WebElement register;


	public  HomePage_POM() {

		PageFactory.initElements(driver,this);
		System.out.println("Branch testing");
	}
	public void geturl() {
		driver.get(url);
	}
	public void getstarted() {
		getStartedbtn.click();
	}
	public String getTitleofPage() {
		String title=driver.getTitle();
		return title;
	}
		public String getAlert() {
			LoggerLoad.info("checking alert message you are not logged in");
			return alertMessage.getText();
			
			}
	
	
	public void getStarted_home(String String) {
		
		switch (String) {
		case "Data Structures-Introduction":
			LoggerLoad.info("click on ds");
			//Utils.webSendKeys(getStartedBtn_DS, string);
			getStartedBtn_DS.click();
			break;
		case "Array":
			LoggerLoad.info("Click on array");
			//Utils.webSendKeys(getStartedBtn_array, string);
			getStartedBtn_array.click();
			break;
		case "Linked List":
			LoggerLoad.info("click LinkedList ");
			//Utils.webSendKeys(getStartedBtn_linkedlist, string);
			getStartedBtn_linkedlist.click();
			break;
		case "Stack":
			LoggerLoad.info("click stack");
			//Utils.webSendKeys(getStartedBtn_stack, string);
			getStartedBtn_stack.click();
			break;
		case "Queue":
			LoggerLoad.info("click  queue ");
			//Utils.webSendKeys(getStartedBtn_queue, string);
			getStartedBtn_queue.click();
			break;
		case "Tree":
			LoggerLoad.info("click  Tree ");
			//Utils.webSendKeys(getStartedBtn_tree, string);
			getStartedBtn_tree.click();
			break;
		case "Graph":
			LoggerLoad.info("Click  Graph ");
			//Utils.webSendKeys(getStartedBtn_graph, string);
			//Utils.webClick(getStartedBtn_graph);
			getStartedBtn_graph.click();
			System.out.println("Clicked on Graph Get started button.");
			break;
		}
		
	}
		public void homepage() {
		driver.get(homePageurl);
		}
		public void dropDown() {
		dsDropdown.click();
	}
		
		public void clickDropdown(String String) {
			switch(String) {
			case "Arrays":
				dropDownarray.click();
				LoggerLoad.info("Checking array logger in pom "+ String);
				break;
			case "Linked list":
				dropDownlinkedlist.click();
				LoggerLoad.info("Checking linkedlist logger in pom " + String);
				break;
			case "Stack":
				LoggerLoad.info("Checking stack logger in pom " + String);
				dropDownstack.click();				
				break;
			case "Queue":
				dropDownqueue.click();
				LoggerLoad.info("Checking queuelogger in pom "  + String);
				break;
			case "Tree":
				dropDowntree.click();
				LoggerLoad.info("Checking tree logger in pom "  + String);
				break;
			case "Graph":
				dropDowngraph.click();
				LoggerLoad.info("Checking graph logger in pom " + String);
				break;
			}
			
		}
				public void clickSignOrRegister(String string) {
					switch(string) {
					case "Sign in":
						signin.click();
						break;
					case "Register":
						register.click();
						break;
					}
				}
				

}



