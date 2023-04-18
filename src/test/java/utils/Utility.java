package utils;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class Utility {
	
		//Utility for methods
	public static WebDriver driver =BaseClass.getdriver();
		
		public static String ExcelPath = Configreader.getexcelfilepath();
		public void waitForElement(WebElement element) {
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));

		}
		
		public void enterPythonCodeForPractice(String code, WebElement element)
		{
			new Actions(driver)
			.keyDown(Keys.CONTROL)
			.sendKeys("a")
			.sendKeys(Keys.DELETE)
			.keyUp(Keys.CONTROL)
			.perform();
			
			//LoggerLoad.info("Clearing text before entering code in "+element.getText()+" enterCodePractice");
		
			String[] str1 = code.split("\n");
			
			for (int i = 0; i < str1.length; i++)
			{
				if (str1[i].equalsIgnoreCase("\\b")) 
				{
					element.sendKeys(Keys.BACK_SPACE);
				} 
				else
				{
					element.sendKeys(str1[i]);
					element.sendKeys(Keys.RETURN);
				}
			}
			
		}
		public void enterCode(String code, WebElement element)
		{
			new Actions(driver)
			.sendKeys(element,code)
			.perform();
			
		}
		

		public static String getResultfromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
			Excelreader reader = new Excelreader();
			List<Map<String, String>> testdata = reader.getData(ExcelPath, sheetname);
			String result = testdata.get(rownumber).get("Output");
			LoggerLoad.info("Expected result from Excel sheetname " + sheetname + " and " + rownumber + " : " + result);
			return result;
		}
		
		public static String getCodefromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
			Excelreader reader = new Excelreader();
			List<Map<String, String>> testdata = reader.getData(ExcelPath, sheetname);
			String code = testdata.get(rownumber).get("PythonCode");
			return code;
		}
		

	}


