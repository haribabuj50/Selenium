package COM.FTR.ASR;

import org.testng.annotations.Test;

public class ASR_ED_Order_REG extends Setup_CreateOrder {
  @Test(priority = 1)
  public void ASR_ED_OrderCreation() throws Exception {
	  //Login VFO home page
	  LoginPage_VFO lp = new LoginPage_VFO(driver);
	  lp.LoginVfoHomePage();
	//  lp.takeSnapShot(driver, "C://Users//hjj446//Desktop//Automation//Screenshots//test1.png");
	  
	  //Select new order and login
	  New_orderCreation noc = new New_orderCreation(driver);
	  noc.createNewCheckoutPon();  	
	//  lp.takeSnapShot(driver, "C://Users//hjj446//Desktop//Automation//Screenshots//test2.png");
	  
	//Enter ASR form details
	  ED_ASRForm af = new ED_ASRForm(driver);
	  af.submitAsrEDCheckoutForm();
	  lp.takeSnapShot(driver, "C://Users//hjj446//Desktop//Automation//Screenshots//test3.png");	  
  }
}
