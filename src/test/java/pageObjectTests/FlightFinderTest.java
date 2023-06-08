package pageObjectTests;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageObjectModels.FlightFinder;
@Test
public class FlightFinderTest {
	
	
	@Test
	public void bookFlight() throws IOException, InterruptedException 
	{
	WebDriver driver = new FirefoxDriver();
	FlightFinder flight= new FlightFinder(driver);
	FileReader reader=new FileReader("C:\\dev\\workspace\\Sample\\src\\main\\java\\Peroperties.properties");
	Properties prop= new Properties();
	prop.load(reader);
	driver.get(prop.getProperty("url"));
	flight.clickFlight();
	Thread.sleep(2000);
	flight.setType("One Way");
	flight.setPasnger("2");
	
	}
}
