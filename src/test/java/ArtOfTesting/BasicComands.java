package ArtOfTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicComands {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("");
		driver.navigate().to("");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		//or
		driver.findElement(By.id("")).sendKeys(Keys.F5);
		driver.findElement(By.id("")).click();
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.className("")).clear();
		driver.findElement(By.id("")).getText();
		driver.close();
		driver.quit();

	}

}
