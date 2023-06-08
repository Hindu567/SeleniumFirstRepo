package ArtOfTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		WebElement txt= driver.findElement(By.id("fname"));
		Actions act= new Actions(driver);
		act.contextClick(txt).perform();
		Thread.sleep(2000);
		//doubleclick
		driver.navigate().refresh();
		act.doubleClick(txt).perform();

	}

}
