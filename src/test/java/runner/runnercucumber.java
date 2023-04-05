package runner;

import utils.Configreader;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
//import org.junit.runner.RunWith;
import org.testng.annotations.Parameters;


//import io.cucumber.junit.Cucumber;


//@RunWith(Cucumber.class)
	
       // @RunWith(Cucumber.class)
		@CucumberOptions(features="src/test/resources/features"
		,glue ={"stepDefination","hooks"}
		,monochrome=true,//dryRun = false,  
		//tags = " @check",
		publish=true,
		plugin= {"pretty","html:target/cucumber.html"
				,"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})
		
        //@Test
		public class runnercucumber extends AbstractTestNGCucumberTests{

		
//			@Override
//		    @DataProvider(parallel = false)
//		    public Object[][] scenarios() {					
//				return super.scenarios();
// }
//		@BeforeTest
//@Parameters({"browser"})
//		public void defineBrowser(String browser) throws Throwable {
//			Configreader.readConfig();
//			Configreader.setbrowser(browser);
//			System.out.println("hello");
//		} 
//////			
////			@BeforeTest
////			//@Parameters({"browser"})
////			public void Setup() throws Throwable {
////				Configreader.readConfig();
////				Configreader.setbrowser("Edge");
////				System.out.println("in Setup");		
////		}	*/
	}
	



