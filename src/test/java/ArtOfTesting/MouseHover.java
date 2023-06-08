package ArtOfTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		WebElement btn= driver.findElement(By.id("idOfButton"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,200)");
		js.executeScript("scrollBy(0, 250)");
		
		Actions act= new Actions(driver);
		act.moveToElement(btn).perform();
		Thread.sleep(2000);

	}

}
