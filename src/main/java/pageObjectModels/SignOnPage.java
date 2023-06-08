package pageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOnPage
{
	WebDriver driver;
	
	@FindBy(linkText="SIGN-ON") WebElement signon;
	@FindBy(name="userName") WebElement uname;
	@FindBy(name="password") WebElement pasw;
	@FindBy(name="submit") WebElement submt;
	@FindBy(id="dismiss-button") WebElement ads;
	//constructor
	public  SignOnPage(WebDriver drv) 
	{
		driver=drv;
		PageFactory.initElements(driver, this);	
	}
	
	public void clicksignon() {signon.click();}
	public void clickDismiss()
	{
		driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
		ads.click();
	}
	public void setUsername(String un) {uname.sendKeys(un);}
	public void setPassword(String pw) {pasw.sendKeys(pw);}
	public void clicksubmit() {submt.click();}
}
