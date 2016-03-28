package COM.FTR.ASR;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class Setup_CreateOrder {

	public static WebDriver driver = null;
	FileInputStream fi = null;	
	Properties p = new Properties();
	
//Provide path to read and load property file in contractor.
  public Setup_CreateOrder() {
	  try
	  {
		  		  fi = new FileInputStream(System.getProperty("user.dir")
		+"/src/main/java/COM/FTR/ASR/LoginFields.Properties");
		  
			  
		  try{
			  p.load(fi);
		  
		  }catch(IOException e){
			  e.printStackTrace();
		  }
		  
	  } catch (FileNotFoundException e){
		  e.printStackTrace();
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  //get login details from property file and open browser
	  if(p.getProperty("browser").equalsIgnoreCase("firefox")){
		  driver = new FirefoxDriver();		  
	  }else if (p.getProperty("browser").equalsIgnoreCase("chrome")){
		  driver = new ChromeDriver();		  
	  }else if (p.getProperty("browser").equalsIgnoreCase("ie")){
		  System.setProperty("webdriver.ie.driver", "C:\\Users\\hjj446\\Desktop\\Automation\\IE\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();
	  }
	  
	  driver.get(p.getProperty("Vfo_Convo1"));
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }

 @AfterTest
 
 public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
	 
     //Convert web driver object to TakeScreenshot

     TakesScreenshot scrShot =((TakesScreenshot)webdriver);

     //Call getScreenshotAs method to create image file

             File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

         //Move image file to new destination

             File DestFile=new File(fileWithPath);

             //Copy file at destination

             FileUtils.copyFile(SrcFile, DestFile);
 }

 public void afterTest() {
	 driver.close();
  driver.quit();
 }
}
