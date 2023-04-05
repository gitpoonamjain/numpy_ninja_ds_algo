package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {

	public static Properties prop;
	private final static String propertyFilePath = ".\\src\\test\\resources\\config\\config.properties";
	private static String browserType = null;

	public static void readConfig() throws Throwable{
		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			prop = new Properties();

			try {
				prop.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Config.properties not found at" + propertyFilePath);
		}
	}
	// Browser Type
	public static void setbrowser(String browser) {
		browserType = browser;
	}
	public static String getbrowser() throws Throwable {
		String browserType = prop.getProperty("browser");
		if (browserType != null)
			return browserType;
		else
			throw new RuntimeException("browser not specified in the testng.xml");
	}
	
	// Base URL
		public static String applicationUrl() {
			String url = prop.getProperty("baseurl");
			if (url != null)
				return url;
			else
				throw new RuntimeException("url not specified in the Config.properties file");
		}

		// HomePage URL
		public static String homePage() {
			String homePageurl = prop.getProperty("homepageurl");
			if (homePageurl != null)
				return homePageurl;
			else
				throw new RuntimeException("HomePageurl not specified in the Config.properties file");
		}
		
		//ResisterPage URL
		
		public static String ResisterPage(){
			String resisterurl=prop.getProperty("resisterurl");
			if (resisterurl != null)
				return resisterurl;
			else 
				throw new RuntimeException("ResisterPage not specified in the Config.properties file");
		}
		
		//Excel reader
		
		public static String excelPath(){
			String excelpath=prop.getProperty("excelpath");
			if (excelpath != null)
				return excelpath;
			else 
				throw new RuntimeException("ResisterPage not specified in the Config.properties file");
		}
		
		//SigninPage URL
		
		public static String SigninPage(){
			String signinurl=prop.getProperty("signinurl");
			if (signinurl != null)
				return signinurl;
			else 
				throw new RuntimeException("ResisterPage not specified in the Config.properties file");
		
		
	}
}
	

