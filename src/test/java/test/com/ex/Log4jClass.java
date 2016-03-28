package test.com.ex;

import org.testng.log4testng.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jClass {

	static final Logger log = Logger.getLogger(Log4jClass.class);
	public static void main(String[] args) {
					  
		PropertyConfigurator.configure("C:\\Users\\hjj446\\Desktop\\Automation\\ASR_NEW_ORDER\\ASR_NEW_ORDER\\src\\main\\java\\Log4j.Properties");
       System.out.println("configuration done");
		log.debug("Hello world!");	

	}

}
