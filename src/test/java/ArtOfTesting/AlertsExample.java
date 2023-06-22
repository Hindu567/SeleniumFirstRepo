package ArtOfTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AlertsExample {

	public static void main(String[] args) {
		
		FirefoxOptions fr= new FirefoxOptions();
		fr.addArguments("--disable-notifications");
		
		WebDriver driver=new FirefoxDriver(fr);
		driver.get("https://www.redbus.in/");
		
		//if a url asks for login and popup
		
		// syntax ------https://username:password@URL

	}

}
