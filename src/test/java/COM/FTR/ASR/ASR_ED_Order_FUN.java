package COM.FTR.ASR;

import org.testng.annotations.Test;

public class ASR_ED_Order_FUN extends Setup_CreateOrder {
  @Test(priority = 1)
  public void ASR_ED_OrderCreation() throws InterruptedException {
	  //Login VFO home page
	  LoginPage_VFO lp = new LoginPage_VFO(driver);
	  lp.LoginVfoHomePage();
	  
	  //Select new order and login
	  New_orderCreation noc = new New_orderCreation(driver);
	  noc.createNewPon();
	  
	  //Enter ASR form details
	  ED_ASRForm af = new ED_ASRForm(driver);
	  af.submitAsrForm();
	  
	  //Enter EUSA form details
	  ED_EUSAform euf = new ED_EUSAform(driver);
	  euf.submitEUSAForm();
	  
  }
}
