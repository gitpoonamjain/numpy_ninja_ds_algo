package numpy_ninja_ds_algo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class HelloWorld {

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
		InputStream Input = new FileInputStream("C:\\Users\\14377\\eclipse-workspace\\numpy_ninja_ds_algo\\src\\test\\resources\\config\\config.properties");
		prop.load(Input);
		System.out.println(prop.getProperty("browser"));
		
	}catch(Exception e){
		e.printStackTrace();
	}
		
		
	}

}
