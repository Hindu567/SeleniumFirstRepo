package ArtOfTesting;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 

{
	@Test
	public void AssertExample()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		SoftAssert soft= new SoftAssert();
		String act=driver.getTitle();
		String exp= "Test";
		soft.assertNotEquals(act, exp, "this is not expected");
		soft.assertAll();
	}

}
