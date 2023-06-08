package TestSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/ajax.html");
	List<WebElement> lis = driver.findElements(By.name("name"));
	System.out.println(lis.size());
	for (WebElement l:lis)
	{
	System.out.println(l.getAttribute("value")+"\n");	
	}
	

}
}
