package COM.FTR.ASR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ED_EUSAform extends Setup_CreateOrder {

	WebDriver driver;
  
	public ED_EUSAform(WebDriver driver) {
	  this.driver = driver;
	  
	}
  
  private void clickEUSAMenu(){
	  driver.findElement(By.id("EUSAMenu")).click();
  }
  
  private void NCcode(String nc_code){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_SVC_DETAILS::0#NC::0']")).sendKeys(nc_code);
  }
  
  private void NCI_code(String nci_code){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_SVC_DETAILS::0#NCI::0']")).sendKeys(nci_code);
  }
  
  private void SECNIC_code(String secnic_code){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_SVC_DETAILS::0#SECNCI::0']")).sendKeys(secnic_code);
  }
  
  private void PRILOC(String priloc){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#PRILOC::0']")).sendKeys(priloc); 
  }
  
  private void PRILOC_A25(String priloc_A25){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#PRILOC_S25::0']")).sendKeys(priloc_A25);
  }
    
  
  //SERVICE ADDRESS INFO
  private void PRILOC_IND(String priloc_ind){
	  Select priloc = new Select(driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#SALI::0#PI::0']")));
	  priloc.selectByVisibleText(priloc_ind); 
  }
  
  private void EUNAME(String euname){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#SALI::0#EUNAME::0']")).sendKeys(euname);	  
  }
  
  private void SANO(String sano){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#SALI::0#ADDR::0#SANO::0']")).sendKeys(sano);  
  }
  
  private void SASN(String sasn){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#SALI::0#ADDR::0#SASN::0']")).sendKeys(sasn);
  }
  
  private void SATH(String sath){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#SALI::0#ADDR::0#SATH::0']")).sendKeys(sath);  
  } 
  
  private void CITY(String city){
	  driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#SALI::0#ADDR::0#CITY::0']")).sendKeys(city);
  }
  
 private void STATE(String state){
	 driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#SALI::0#ADDR::0#STATE::0']")).sendKeys(state); 
 }
 
private void ZIP(String zip ){
	driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#SALI::0#ADDR::0#ZIP::0']")).sendKeys(zip);	
}
 
private void JD (String jd ){
	Select JS = new Select(driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#SALI::0#JS::0']")));
	  JS.selectByVisibleText(jd);
}

private void LCON(String lcon ){
	driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#SALI::0#LCON::0']")).sendKeys(lcon);
}

private void LCON_ACTL (String lcon_actl ){
	driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#SALI::0#ACTEL::0']")).sendKeys(lcon_actl);
}

private void LCON_MAIL(String lcon_mail){
	driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_PRILOC::0#SALI::0#LCON_EMAIL::0']")).sendKeys(lcon_mail);
}

private void SECLOC(String secloc ){
	driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_SECLOC::0#SECLOC::0']")).sendKeys(secloc);
}

private void SECLOC_A25(String secloc_a25 ){
	driver.findElement(By.xpath(".//*[@id='ASR_SERVICE_REQUEST::0#END_USER_SA_SVC::0#EUSA::0#EUSA_SECLOC::0#S25::0']")).sendKeys(secloc_a25);
}

private void VALIDATE() throws InterruptedException{
	 driver.findElement(By.xpath(".//*[@id='validateicon']/div/a/img")).click();
	  Thread.sleep(1000);
}

private void SUBMIT() throws InterruptedException{
	driver.findElement(By.xpath(".//*[@id='orderformicons']/div/table/tbody/tr/th[3]/div/a/img")).click();
	  Thread.sleep(1000);	
}

private void REFRESH(){
	driver.findElement(By.xpath(".//*[@id='orderformicons']/div/table/tbody/tr/th[9]/a/img")).click();
}

public void submitEUSAForm() throws InterruptedException{
	clickEUSAMenu();
	NCcode(p.getProperty("NC"));
	NCI_code(p.getProperty("NCI"));
	SECNIC_code(p.getProperty("SECNIC"));
	PRILOC(p.getProperty("PRILOC"));
	PRILOC_A25(p.getProperty("PRILOC_A25"));
	PRILOC_IND(p.getProperty("PRILOC_IND"));
	EUNAME(p.getProperty("EUNAME"));
	SANO(p.getProperty("SANO"));
	SASN(p.getProperty("SASN"));
	SATH(p.getProperty("SATH"));
	CITY(p.getProperty("CITY"));
	STATE(p.getProperty("STATE"));
	ZIP(p.getProperty("ZIP"));
	JD (p.getProperty("JD"));
	LCON(p.getProperty("LCON"));
	LCON_ACTL (p.getProperty("LCON_ACTL"));
	LCON_MAIL(p.getProperty("LCON_MAIL"));
	SECLOC(p.getProperty("SECLOC") );
	SECLOC_A25(p.getProperty("SECLOC_A25") );
	VALIDATE();
	System.out.println("validated successfully");
	SUBMIT();
	System.out.println("submitted successfully");
	REFRESH();
		
}
 
}
 



