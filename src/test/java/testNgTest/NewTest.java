package testNgTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  @Parameters("brow")
  public void f(String brow) {
	 if (brow.equalsIgnoreCase("FireFox"))
	 {
	  	WebDriver driver = new FirefoxDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
	 }
	 else if(brow.equalsIgnoreCase("chrome"))
	 {
		 WebDriver driver = new ChromeDriver();
			driver.get("https://artoftesting.com/samplesiteforselenium");
	 }
	 else
	 {
		System.out.println("no browser is launched");
	 }
  }

}
