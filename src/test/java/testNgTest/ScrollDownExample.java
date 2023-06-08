package testNgTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDownExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		Actions acts= new Actions(driver);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@Class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
	WebElement web=	driver.findElement(By.xpath("//*[@Class='_3704LK']"));
	web.sendKeys("budha");
	web.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@Class='L0Z3Pu']\"")).click();
		Thread.sleep(3000);

	JavascriptExecutor jv= (JavascriptExecutor)driver;	
	jv.executeScript("scrollBy(0,2500)");
	}

}
