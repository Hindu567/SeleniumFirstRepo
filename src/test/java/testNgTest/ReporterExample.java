package testNgTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(RealGuru99Report.class)
public class ReporterExample {
	WebDriver driver;
	@BeforeMethod
	public void before()
	{
		String baseUrl = "https://demo.guru99.com/test/social-icon.html";
		driver = new FirefoxDriver();
		 Reporter.log("Launched browser");
		 driver.get(baseUrl);
		 Reporter.log("url opened");
	}
	@AfterMethod
	public void after() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void ActualTest()
	{
		String act=driver.findElement(By.xpath("//div[@Class='socialbtns']/div/a[4]")).getText();
		Reporter.log("Actual text");
		String exp = "Github";
		if(	act.equals(exp))
		{
			System.out.println("Both values are equal");
		}
	}
	@Test
	public void test2()
	{
		System.out.println("this is second case");
	}
	}

