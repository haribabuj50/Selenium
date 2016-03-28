package COM.FTR.ASR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage_VFO extends Setup_CreateOrder {
	
	// Variable declaration and data initialization
	WebDriver driver;	
	By UserName = By.id("loginName");
	By Password = By.id("password");
	By Module = By.name("serviceRequestType");
	By LoginVFO = By.xpath("html/body/table/tbody/tr[2]/th/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/th/form/table/tbody/tr[5]/th[3]/div/a/img");
	By ChangePassword = By.name("changePassword");
			
public LoginPage_VFO(WebDriver driver)
{
	this.driver = driver;	
}
//Enter User name
public void setUName(String Uname){
	driver.findElement(UserName).sendKeys(Uname);	
}
//Enter Password
public void setPword(String Pname){
	driver.findElement(Password).sendKeys(Pname);
}
//Select module
public void setModule(String Mdle){
	
	Select dropdown = new Select(driver.findElement(Module));
	  dropdown.selectByVisibleText("Access");
}
//click on Login button
public void Login(){
	driver.findElement(LoginVFO).click();
		
}
public void LoginVfoHomePage(){
	setUName(p.getProperty("User_Name"));
	setPword(p.getProperty("Password"));
	setModule(p.getProperty("Module"));	Login();

}

}
