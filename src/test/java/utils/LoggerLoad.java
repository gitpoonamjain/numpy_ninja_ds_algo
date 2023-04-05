package utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerLoad {
	private static Logger logger = LogManager.getLogger();// getLogger() method of the LogManager class, which returns a value and store it in logger
	public static void info(String message) {
		//System.out.println("in info");
		logger.info(message);
		//System.out.println("in info after logging");
	}
	public static void warn(String message) {
		logger.warn(message);
	}
	
	public static void error(String message) {
		logger.info(message);
	}
	public static void fatal(String message) {
		logger.fatal(message);
	}
	
	public static void debug(String message) {
		logger.debug(message);
	}
	

}

	
	


