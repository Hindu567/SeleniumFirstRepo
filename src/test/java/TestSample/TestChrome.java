package TestSample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class TestChrome {
 WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		  
		// System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "C:/Users/hindumathi.matike/Desktop/chromedriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		 String expectedTitle = "Welcome: Mercury Tours";
		 String url = "http://demo.guru99.com/test/newtours/";
		 String acttitle=driver.getTitle();
		
		 File File = ((TakesScreenshot)driver)
                 .getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(File, new File("location"));
		
		
		 if(acttitle.contentEquals(expectedTitle))
		 {
			 System.out.println("passed");
		 }
		 else {
			 System.out.println("not correct");
		 }
	}

	
	
}
