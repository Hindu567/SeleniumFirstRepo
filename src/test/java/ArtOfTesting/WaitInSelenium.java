package ArtOfTesting;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitInSelenium {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.manage().timeouts().pageLoadTimeout(0, null);
		
		//Explicitly wait
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
	//	wait.until(ExpectedConditions.visibilityOf()));
		
	
		//fluentwait
		Wait<WebDriver> wat = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(30))
				 .pollingEvery(Duration.ofSeconds(5))
				 .ignoring(NoSuchElementException.class);
		
	/*	 WebElement foo = wat.until(new Function<WebDriver, WebElement>()
		 {
		     public WebElement apply(WebDriver driver) 
		     {
		       return driver.findElement(By.id("foo"));
		     }	 
		 }
	*/	
}
}

