package ArtOfTesting;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResizeBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		Dimension dm= new Dimension(200, 300);
		driver.manage().window().setSize(dm);
		
	}

}
