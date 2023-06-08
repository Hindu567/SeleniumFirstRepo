package TestSample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDrop {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");	
	
	/*WebElement drag=	driver.findElement(By.xpath(".//*[@Class='ui-widget-content']/ul/li[5]/a"));
	WebElement drop= driver.findElement(By.xpath("//*[@id='bank']/li"));	
	Actions act= new Actions(driver);
	act.dragAndDrop(drag, drop)
	.build().perform();
	*/
	//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(1000)).until(ExpectedConditions.elementToBeClickable("//*[@id='bank']/li"));

	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement el= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("\"//*[@id='bank']/li\"")));
	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
         		
         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
		
         Actions act=new Actions(driver);						
         act.dragAndDrop(From, To).build().perform();	

	}

}
