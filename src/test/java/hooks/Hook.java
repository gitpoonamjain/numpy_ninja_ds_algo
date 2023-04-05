package hooks;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utils.LoggerLoad;
import org.openqa.selenium.WebDriver;
import base.BaseClass;
import utils.Configreader;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.ByteArrayInputStream;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;


public class Hook {
	private static WebDriver driver;
	private static BaseClass base;

	@BeforeAll
	public static void launchbrowser()  throws Throwable {
		//Get Browser Type
		LoggerLoad.info("Loading Config file");
		System.out.println("in hooks.Hook");
		Configreader.readConfig(); //reads config.properties file and load them into properties object
		//Configreader.setbrowser(Configreader.prop.getProperty("browser"));
		String browser = Configreader.getbrowser(); //gets the browser property from the properties object
		System.out.println(Configreader.getbrowser());
		//System.out.println(Configreader.browser());
		//Initialize driver from baseclass
		base = new BaseClass(); //creates BaseClass object
		driver = base.initialize(browser); // creates and returns Webdriver object for the browser passed as parameter
		LoggerLoad.info("Intializing" + browser +"driver");
		
	}
	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			LoggerLoad.error("Steps Failed , Taking Screenshot");
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.attachment("Myscreenshot",new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
	
	}
	}

//	@AfterAll
//	public static void after() throws InterruptedException {
//		LoggerLoad.info("Closing Driver");
//		Thread.sleep(5000);
//		base.closeallDriver();
//		}

	}





