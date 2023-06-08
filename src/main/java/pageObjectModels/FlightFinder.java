package pageObjectModels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder 
{
	WebDriver driver;
	
	public FlightFinder(WebDriver drv) 
	{
		driver=drv;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(linkText="Flights") WebElement flight;
	
	By type1= By.name("tripType");
	//@FindBy(name="tripType") List<WebElement> type;
	@FindBy(name="Passengers") WebElement pasnger;
	@FindBy(name="fromPort")WebElement depart;
	@FindBy(name="fromMonth")WebElement month;
	@FindBy(name="fromDay")WebElement day;
	@FindBy(name="toPort")WebElement ariving;
	@FindBy(name="toMonth")WebElement tmonth;
	@FindBy(name="toDay")WebElement tday;
	@FindBy(name="servClass")WebElement servicecls;
	@FindBy(name="airline")WebElement airlne;
	@FindBy(name="findFlights")WebElement continu;

	
	public void clickFlight() {
		flight.click();
		
		if(driver.getPageSource().contains("iframe")) {
		driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
		driver.findElement(By.id("dismiss-button")).click();
		driver.switchTo().defaultContent();
		}
	}
	
	public void setType(String t) {
		
		List<WebElement> tpe= driver.findElements(type1);
		for(WebElement tp: tpe)
		{
			System.out.println(tp);
			System.out.println(t);
			if(tp.getText().contentEquals(t))
				{
				tp.click();
				};
		}
	}
	
	public void setPasnger(String pc) {
			
		Select sl= new Select(pasnger);
		sl.selectByValue(pc);
	}
	
	public void setDepart(WebElement depart) {
		
	}
	
	public void setMonth(WebElement month) {
		
	}
	
	public void setDay(WebElement day) {
	
	}
	
	public void setAriving(WebElement ariving) {
	
	}
	
	public void setTmonth(WebElement tmonth) {
		
	}

	public void setTday(WebElement tday) {
		
	}
	
	public void setServicecls(WebElement servicecls) {
		
	}
	
	public void setAirlne(WebElement airlne) {
		
	}
	
	public void setContinu(WebElement continu) {
		
	}
	
	
	
	
		
	
	
	
	
	
	
	
	
	
}
