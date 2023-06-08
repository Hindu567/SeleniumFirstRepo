package TestSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
//import java.util.Properties;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseInitialization {
	//public String test="test";

	public  WebDriver BaseInti() throws IOException {
		 WebDriver driver;
		
			Properties prop= new Properties();
			InputStream input = new FileInputStream((System.getProperty("user.dir")+ "/src/main/java/Data.properties"));
			prop.load(input);
			String brow= prop.getProperty("browser");
		   
		 if( brow.equals("chrome") )
				 {
		//System.setProperty("webdriver.chrome.driver", "C:/dev/workspace/Sample/src/test/resources/driver/chromedriver.exe");
			 System.setProperty("webdriver.chrome.driver", "C:/Users/hindumathi.matike/Downloads/chromedriver_win32/chromedriver.exe");
			 driver= new ChromeDriver();
		return driver;
		 }
		 if (brow.equals("Edge")) 
		 {
			 System.setProperty("webdriver.edge.driver", "C:/dev/workspace/Sample/src/test/resources/driver/msedgedriver.exe");
				 driver= new EdgeDriver(); 
				return driver;
		 }
		return null;

	}
	
	public void test() {
		System.out.println("test");
	}
}
