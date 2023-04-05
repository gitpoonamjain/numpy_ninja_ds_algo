package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public  WebDriver initialize(String browser)throws  Exception  {
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions CO= new ChromeOptions();
			CO.addArguments("--remote-allow-origins=*");	
			 driver = new ChromeDriver(CO);
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			throw new RuntimeException("BrowserType Not Supported");
		}
		//Setting implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		//Setting WebDriverWait with max timeout value of 20 seconds
		wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		return driver;
	}
	public static  WebDriver getdriver() {
		return driver;

	}
	public void closeallDriver() {
		driver.close();
	}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions CO= new ChromeOptions();
		//CO.addArguments("--remote-allow-origins=*");	
		//WebDriver driver = new ChromeDriver(CO);
		
		//driver.get("http://google.com");
		//driver.close();
	
	}


