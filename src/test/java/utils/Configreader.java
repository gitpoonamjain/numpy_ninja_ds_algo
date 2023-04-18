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
		
		//DataStructure URL		
		public static String DataStructureIntroPage(){
			String dsurl=prop.getProperty("datastructureintrourl");
			if (dsurl != null)
				return dsurl;
			else 
				throw new RuntimeException("DataStructure Intro URL not specified in the Config.properties file");				
		}
		
		public static String DataStructureTimeComplexityPage(){
			String dsurl=prop.getProperty("datastructuretimecomplexity");
			if (dsurl != null)
				return dsurl;
			else 
				throw new RuntimeException("DataStructure time complexity URL not specified in the Config.properties file");				
		}
		
		public static String DataStructureTryEditorPage(){
			String dsurl=prop.getProperty("datastrcuturetryeditor");
			if (dsurl != null)
				return dsurl;
			else 
				throw new RuntimeException("DataStructure try editor URL not specified in the Config.properties file");				
		}
		
		//stack URL		
		public static String StackIntroPage(){
			String stackurl=prop.getProperty("stackhomepage");
			if (stackurl != null)
				return stackurl;
			else 
				throw new RuntimeException("Stack Intro URL not specified in the Config.properties file");				
		}
		public static String StackOperationPage(){
			String stacoperationkurl=prop.getProperty("operationstackpage");
			if (stacoperationkurl != null)
				return stacoperationkurl;
			else 
				throw new RuntimeException("Stack operation URL not specified in the Config.properties file");	
		
}
		public static String StacktryherePage(){
			String stactryherekurl=prop.getProperty("tryherestackpage");
	if (stactryherekurl != null)
		return stactryherekurl;
	else 
		throw new RuntimeException("Stack tryhere URL not specified in the Config.properties file");	
}
		public static String StacktryeditorPage(){
			String stacktryeditorkurl=prop.getProperty("tryherestackpage");
if (stacktryeditorkurl != null)
	return stacktryeditorkurl;
else 
	throw new RuntimeException("Stack tryhereeditor URL not specified in the Config.properties file");	
}
		public static String Stackpracticspage(){
					String stackpracticskurl=prop.getProperty("tryherestackpage");
					if (stackpracticskurl != null)
						return stackpracticskurl;
					else 
						throw new RuntimeException("Stack practics URL not specified in the Config.properties file");	
}

		//Array URL
		public static String arrayPageURL() {
			String arrayPageurl = prop.getProperty("Arraypage");
			if (arrayPageurl != null)
				return arrayPageurl;
			else
				throw new RuntimeException("Array Page url not specified in the Configuration.properties file.");
		}
		public static String tryEditorURL() {
			String tryeditorurl = prop.getProperty("TryEditorPage");
			if (tryeditorurl != null)
				return tryeditorurl;
			else
				throw new RuntimeException("tryeditorurl not specified in the Configuration.properties file.");
		}
		// Linked list	
		public static String getLinkedListUrl() {								  
				String linkedlisturl = prop.getProperty("linkedlisturl");
				if (linkedlisturl != null)
					return linkedlisturl;
				else
					throw new RuntimeException("linked list url not specified in the Configuration.properties file.");
	  
			}
		public static String geturl(String pagename) {
			String url = prop.getProperty(pagename);
			if (url != null)
				return url;
			else
				throw new RuntimeException(pagename + " url not specified in the Configuration.properties file.");
		}
		public static String getexcelfilepath() {
			String excelfilelpath = prop.getProperty("excelFilePath");
			if (excelfilelpath != null)
				return excelfilelpath;
			else
				throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
		}
		
		public static String  sigin()
		{
			String sin_url = prop.getProperty("signinurl");
			if(sin_url != null)
			{
				return sin_url;
			}
				else
			{
				throw new RuntimeException("SignIn  page url not specified in config file");
			}	
				
			
		}
		
		public static String linktoqueue()
		{
			String read_queue = prop.getProperty("Queue");
			if (read_queue !=null)
			{
				return read_queue;
			}
			else
			{
				throw new RuntimeException("QUEUE  page url not specified in config file");
			}
		}
			
			public static String linktoQueue_Implem()
			{
				String read_linkq = prop.getProperty("Queue_Implem");
				if(read_linkq != null)
				{	
					return read_linkq;
				}
				else
			      throw new RuntimeException("Queue Implementation  page not specified in config file");
				
			}
			public static String py_editor()
			{
				String ed = prop.getProperty("Editor");
				if (ed != null)
				{
					return ed;
				}
				else
					throw new RuntimeException("Editor page url not specified in config file");
			}
			
			public static String queue_collect()
			{
				String coln = prop.getProperty("Queue_collect");
				if(coln!=null)
					return coln;
				else
					throw new RuntimeException("Collection page url not specified in config file");
					
			}
			
			public static String queue_array()
			{
				String arr = prop.getProperty("Queue_imp_array");
				if(arr!=null)
					return arr;
				else
					throw new RuntimeException("Queue Implementatiom Array page url not specified in config file");
					
			}
			
			public static String queue_opns()
			{
				String q_opr = prop.getProperty("Queue_operations");
				if(q_opr!=null)
					return q_opr;
				else
					throw new RuntimeException("Queue Opeartions page url not specified in config file");
					
			}
			public static String pr_quest()
			{
				String p_qt = prop.getProperty("Prac_quest");
				if(p_qt!=null)
					return p_qt;
				else
					throw new RuntimeException("Practice Question page url not specified in config file");
					
			}
			
			// GraphPage URL

			public static String GraphPage() {
				String graphurl = prop.getProperty("graphpageurl");
				if (graphurl != null)
					return graphurl;
				else
					throw new RuntimeException("GraphPage not specified in the Config.properties file");

			}

			// GraphPageLink URL

			public static String GraphlinkPage() {
				String glinkurl = prop.getProperty("graphlinkurl");
				if (glinkurl != null)
					return glinkurl;
				else
					throw new RuntimeException("GraphPage link not specified in the Config.properties file");

			}
		//GraphRepresntationPageLink URL

			public static String GraphReplinkPage() {
				String greplinkurl = prop.getProperty("graphrepresentationslinkurl");
				if (greplinkurl != null)
					return greplinkurl;
				else
					throw new RuntimeException("Graph Representations Page link not specified in the Config.properties file");

			}

		//GraphPracticeQuestionLink URL

			public static String GraphPQlinkPage() {
				String gpracqlinkurl = prop.getProperty("graphpracticelinkurl");
				if (gpracqlinkurl != null)
					return gpracqlinkurl;
				else
					throw new RuntimeException("Graph Representations Page link not specified in the Config.properties file");

			}
			
			public static String TreePage(){
				String treepageurl=prop.getProperty("treepageurl");
				if (treepageurl != null)
					return treepageurl;
				else 
					throw new RuntimeException("treepage not specified in the Config.properties file");
			
			
		}
			
			public static String TreeOverviewPage(){
				String overviewtreepageurl=prop.getProperty("treeoverviewurl");
				if (overviewtreepageurl != null)
					return overviewtreepageurl;
				else 
					throw new RuntimeException("treepageoverview not specified in the Config.properties file");
			
			
		}
			
			public static String TryEditorPage(){
				String tryeditorpageurl=prop.getProperty("treetryeditorurl");
				if (tryeditorpageurl != null)
					return tryeditorpageurl;
				else 
					throw new RuntimeException("treetryeditor page url not specified in the Config.properties file");
			
			
		}
		
			

}
	

