
package pageObjectTests;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	WebDriver driver;
	
	@BeforeMethod
	public  void readProps() throws IOException
	{
		WebDriver driver = new FirefoxDriver();
		FileReader reader=new FileReader("C:\\dev\\workspace\\Sample\\src\\main\\java\\Peroperties.properties");
		Properties prop= new Properties();
		prop.load(reader);
		driver.get(prop.getProperty("url"));
	}

}
