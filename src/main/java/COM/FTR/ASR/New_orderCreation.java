package COM.FTR.ASR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;



public class New_orderCreation{
  WebDriver driver;
 
  
 // private Actions action;
  
  public New_orderCreation(WebDriver driver){
	  this.driver = driver;
	  	  
	  //this.action = new Actions(driver);
	  
  }
	
  public void SelectNewFromOrderTab() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.switchTo().frame("mainFrame");		 
	  WebElement ele = driver.findElement(By.xpath(".//*[@id='image2']"));
	  Actions action = new Actions(driver);
	  action.moveToElement(ele).build().perform();
	  Thread.sleep(1000);	
	  
	  System.out.println("Order tab selected");		 
		 
	  String parentHandle = driver.getWindowHandle(); // get the current window handle		 
	  driver.findElement(By.id("menuItem48")).click(); // click some link that opens a new window		  
	  System.out.println("New option selected");

	  for (String winHandle : driver.getWindowHandles()) {
	      driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
	      System.out.println("New window identified");
	  }
	      		      
	      driver.findElement(By.id("ICSC")).clear();
	      driver.findElement(By.id("ICSC")).sendKeys("GT10");
	      driver.findElement(By.id("ICSC")).click();		      
	      driver.findElement(By.id("ICSC")).sendKeys(Keys.TAB);
  }
  
 // public void setPonNum(String PNum){
	//  driver.findElement(By.name("orderNumber")).sendKeys("Pnum");
 // }
  
/*  public void setReceiverCode(){
	  
      driver.findElement(By.id("ICSC")).clear();
      driver.findElement(By.id("ICSC")).sendKeys("GT10");
      driver.findElement(By.id("ICSC")).click();		      
      driver.findElement(By.id("ICSC")).sendKeys(Keys.TAB);
	  
  } */
  
  public void setService(){
	  Select service = new Select(driver.findElement(By.xpath("html/body/table/tbody/tr[3]/th/table/tbody/tr[6]/th[3]/div/select")));
      service.selectByIndex(3);
  }
  
  public void setActivity(){
	  Select activity = new Select(driver.findElement(By.xpath("html/body/table/tbody/tr[3]/th/table/tbody/tr[7]/th[3]/div/select")));
	  activity.selectByIndex(4);
  }
  
  public void clikOrderInitiation() throws InterruptedException{
	  Thread.sleep(1000);
	  driver.findElement(By.id("initiate_button")).click();
      System.out.println("Initate button");	      
  }
  private void setTemplate() throws InterruptedException{
	  Thread.sleep(1000);
	  Select temp = new Select(driver.findElement(By.name("template")));
	  temp.selectByIndex(2);
  }
  public void createNewPon() throws InterruptedException{
	  
	  SelectNewFromOrderTab();
	  //setPonNum();
	 // setReceiverCode();
	  setService();
	  setActivity();
	  clikOrderInitiation();
  }

public void createNewCheckoutPon() throws InterruptedException {
	SelectNewFromOrderTab();
	 setService();
	 setActivity();
	 setTemplate();
	 clikOrderInitiation();
	 
}

}
  

