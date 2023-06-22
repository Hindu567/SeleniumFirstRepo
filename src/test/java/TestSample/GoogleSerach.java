package TestSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSerach {

	public static void main(String[] args) throws InterruptedException {

		// WebDriver driver = new FirefoxDriver();
		 WebDriver driver= new FirefoxDriver();
		 driver.get("https://www.google.com/");
		 driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
		 driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		List<WebElement> ls= driver.findElements(By.xpath("//li[@class='sbct']/div/div[2]/div/div/span"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 250)");
		//js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(1000);
		
		
		for(WebElement s: ls)
		{
			System.out.println(s.getText());
			s.getText().contains("interview");
			s.click();
			break;
		}

	}

}
