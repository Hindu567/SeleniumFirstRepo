package TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ToolTipExample {

	public static void main(String[] args) {
		
		String baseUrl = "https://demo.guru99.com/test/social-icon.html";
		WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		String act=driver.findElement(By.xpath("//div[@Class='socialbtns']/div/a[4]")).getText();
		String exp = "Github";
	if(	act.equals(exp))
	{
		System.out.println("Both values are equal");
	}
	driver.get("https://demo.guru99.com/test/tooltip.html");
	WebElement dow= driver.findElement(By.xpath("//div[@Class='tooltip']/a"));
	String actv= "What's new in 3.2";
	Actions actn= new Actions(driver);
	actn.clickAndHold().moveToElement(dow);
	actn.moveToElement(dow).build().perform();
	WebElement link= driver.findElement(By.xpath("//div[@Class='tooltip']/"));
	Assert.assertEquals(actv, link);
	}

}
