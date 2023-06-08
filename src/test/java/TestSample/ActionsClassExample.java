package TestSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassExample {

	public static void main(String[] args) throws IOException 
	{
		//Taking values from properties file
		
		Properties prop= new Properties();
		FileInputStream input= new FileInputStream("C:\\dev\\workspace\\Sample\\src\\test\\resources\\Properties.properties");
		prop.load(input);
		WebDriver driver = new FirefoxDriver();
		driver.get(prop.getProperty("baseurl"));
		
		driver.findElement(By.name("userName"));
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.name("submit")))
		.click()
		.build()
		.perform();

		
}
}
