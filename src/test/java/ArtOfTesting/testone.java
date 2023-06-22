package ArtOfTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
	}

}
