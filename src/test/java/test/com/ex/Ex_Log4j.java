package test.com.ex;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
//import org.testng.log4testng.Logger;
import org.apache.log4j.Logger;

public class Ex_Log4j {
  @Test
  public void Log4jTest() {
	  
	//  WebDriver driver = new FirefoxDriver();
	  
	  
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\hjj446\\Desktop\\Automation\\IE\\IEDriverServer.exe");
	  WebDriver driver = new InternetExplorerDriver();
	 // driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	    
	 Logger log = Logger.getLogger("hari");
 	
	PropertyConfigurator.configure("C:\\Users\\hjj446\\Desktop\\Automation\\ASR_NEW_ORDER\\ASR_NEW_ORDER\\src\\main\\java\\Log4j.Properties");
	  	
 		log.debug("opening webiste");
	  	driver.get("http://www.google.com");
      
	  	log.debug("entring hari as search key word");
   //   driver.findElement(By.name("q")).sendKeys("hari");
      
      log.debug("Clicking on search button");
    //  driver.findElement(By.name("btnG")).click();

   driver.quit();
   log.debug("close the browser");
  }
}
