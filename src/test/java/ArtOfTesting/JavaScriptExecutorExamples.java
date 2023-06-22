package ArtOfTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorExamples {

	public static void main(String[] args) {
		
		 WebDriver driver = new FirefoxDriver();
		 
		 
		driver.get("https://www.google.com/");
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.location='https://www.toolsqa.com/selenium-webdriver/javascript-and-selenium-javascriptexecutor/'");
		 
		 js.executeScript("location.reload()");
		// js.executeScript("alert(�hello world�);");
		// WebElement java = driver.findElement(By.xpath("///button[@class='M6CB1c rr4y5c']"));
		// js.executeScript("arguments[0].click();", java);
		 String sText =  js.executeScript("return document.documentElement.innerText;").toString();
		 String title=js.executeScript("return document.title;").toString();
		 System.out.println(sText +  title);
		 
		 
	}

}
