package TestSampleExtend;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionButton {

	public static void main(String[] args) {
WebDriver driver= new FirefoxDriver();
driver.get("https://demo.guru99.com/test/newtours/");
	driver.findElement(By.name("userName")).click();
	driver.findElement(By.name("password")).click();
	WebElement btn= driver.findElement(By.name("submit"));
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",btn );
	/*
		Actions act= new Actions(driver);
		act.moveToElement(btn).click().build().perform();
*/
	}

}
