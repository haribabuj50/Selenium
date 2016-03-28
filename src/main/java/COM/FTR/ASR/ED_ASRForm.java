package COM.FTR.ASR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ED_ASRForm extends Setup_CreateOrder {
WebDriver driver;

  public ED_ASRForm(WebDriver driver){
	  this.driver = driver;
  }    
  private void selectCustomerCode(String Ccode){
	 
	  Select custcode = new Select(driver.findElement(By.name("selectedccna")));
      custcode.selectByVisibleText(Ccode);
      System.out.println("ATX selected");
  }
  
  private void setDueDate(String Ddate){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#ADMIN::0#DDD::0']")).sendKeys(Ddate);
	  System.out.println("Due date selected");
  }
  
  private void setQSA(String qsa){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#ADMIN::0#QSA::0']")).sendKeys(qsa);
	  System.out.println("QSA selected");
  }
    
  private void setRTR(String rtr){
	  Select rt = new Select(driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#ADMIN::0#RTR::0']")));
      rt.selectByVisibleText(rtr);
      System.out.println("RTR selected");
  }
  
  private void setUnit(String unit){
	  Select unit1 = new Select(driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#ADMIN::0#UNIT::0']")));
      unit1.selectByVisibleText(unit);
  }
  
  private void setPIU(String piu){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#ADMIN::0#PIU::0']")).sendKeys(piu);
  }
  private void setQTY(String qty){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#ADMIN::0#QTY::0']")).sendKeys(qty);
  }
  private void setBAN(String ban){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#ADMIN::0#BAN::0']")).sendKeys(ban);
  }
  private void setACNA(String acna){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#BILLING::0#ACNA::0']")).sendKeys(acna);
  }
  private void setFUSF(String fusf){
	  Select fusf1 = new Select(driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#BILLING::0#FUSF::0']")));
	  fusf1.selectByVisibleText(fusf);  
  }
  private void setINIT(String init){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#CONTACT::0#INIT::0']")).sendKeys(init); 
  }
  private void setINIT_TEL(String init_tel){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#CONTACT::0#INITIATOR_TEL::0']")).sendKeys(init_tel);
  }
 private void setDSGCON(String dsgcon){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#CONTACT::0#DSGCON::0']")).sendKeys(dsgcon);
 }
 private void setDSG_Tel(String dsg_tel){
	 driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#CONTACT::0#DSGCON_TEL::0']")).sendKeys(dsg_tel);
 }
 private void setDSG_Fax(String dsgfax){
	 driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#CONTACT::0#DSG_FAX_NO::0']")).sendKeys(dsgfax);  
 }
 private void setIMPCON(String impcon){
	 driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#CONTACT::0#IMPCON::0']")).sendKeys(impcon);
 }
 private void setIMPCON_Tel(String impcon_tel) {
	 driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#ASR::0#CONTACT::0#IMPCON_TEL::0']")).sendKeys(impcon_tel);
 }
 
 private void VALIDATE_Check() throws InterruptedException{
	 driver.findElement(By.xpath(".//*[@id='validateicon']/div/a/img")).click();
	  Thread.sleep(1000);
}

private void SUBMIT_Check() throws InterruptedException{
	driver.findElement(By.xpath(".//*[@id='orderformicons']/div/table/tbody/tr/th[3]/div/a/img")).click();
	  Thread.sleep(1000);	
}

private void REFRESH_Check(){
	driver.findElement(By.xpath(".//*[@id='orderformicons']/div/table/tbody/tr/th[9]/a/img")).click();
}
 public void submitAsrForm(){
	 selectCustomerCode(p.getProperty("CUSTOMER_CODE"));
	 setDueDate(p.getProperty("DDD"));
	 setQSA(p.getProperty("QSA"));
	 setRTR(p.getProperty("RTR"));
	 setUnit(p.getProperty("UNIT"));
	 setPIU(p.getProperty("PIU"));
	 setQTY(p.getProperty("QTY"));
	 setBAN(p.getProperty("BAN"));
	 setACNA(p.getProperty("ACNA"));
	 setFUSF(p.getProperty("FUSF"));
	 setINIT(p.getProperty("INIT"));
	 setINIT_TEL(p.getProperty("INITIATOR_TEL"));
	 setDSGCON(p.getProperty("DSGCON"));
	 setDSG_Tel(p.getProperty("DSGCON_TEL"));
	 setDSG_Fax(p.getProperty("DSG_FAX_NO"));
	 setIMPCON(p.getProperty("IMPCON"));
	 setIMPCON_Tel(p.getProperty("IMPCON_TEL"));
		 
 }
 public void submitAsrEDCheckoutForm() throws InterruptedException{
	 selectCustomerCode(p.getProperty("CUSTOMER_CODE"));
	 System.out.println("customercode selected");
	 setDueDate(p.getProperty("DDD"));
	 VALIDATE_Check();
	 SUBMIT_Check();
	 REFRESH_Check();	 
 }
 @AfterMethod
 public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
 	if (testResult.getStatus() == ITestResult.FAILURE){
 		System.out.println(testResult.getStatus()); 
 		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
 		FileUtils.copyFile(scrFile, new File("C:\\Users\\hjj446\\Desktop\\Automation\\Screenshot\\testScreenShot.jpg")); 
 	}				
 	}
 
 public void submitAsrSDCheckoutForm() throws InterruptedException{
	 selectCustomerCode(p.getProperty("CUSTOMER_CODE"));
	 System.out.println("customercode selected");
	 setDueDate(p.getProperty("DDD"));
	 VALIDATE_Check();
	 SUBMIT_Check();
	 REFRESH_Check();	 
 }
 public void submitAsrEDuniCheckoutForm() throws InterruptedException{
	 selectCustomerCode(p.getProperty("CUSTOMER_CODE"));
	 System.out.println("customercode selected");
	 setDueDate(p.getProperty("DDD"));
	 VALIDATE_Check();
	 SUBMIT_Check();
	 REFRESH_Check(); 
 }
 
}
