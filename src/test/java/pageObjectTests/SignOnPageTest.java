package pageObjectTests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModels.SignOnPage;

public class SignOnPageTest extends BaseClass{
	
	@Test
	public void verifySignOn() throws IOException 
	{
		//WebDriver driver = new FirefoxDriver();	
		SignOnPage sign= new SignOnPage(driver);		
		/*
		
		FileReader reader=new FileReader("C:\\dev\\workspace\\Sample\\src\\main\\java\\Peroperties.properties");
		Properties prop= new Properties();
		prop.load(reader);
		driver.get(prop.getProperty("url"));
		
		*/
		
		sign.clicksignon();		
		//sign.clickDismiss();
		sign.setUsername("Hindu");
	sign.setPassword("password");
	
		
		
		sign.clicksubmit();
		
		if (driver.getPageSource().contentEquals("Login Successfully"))
		{
			Assert.assertTrue(true);
		}
	}
}
