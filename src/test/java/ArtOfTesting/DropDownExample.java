package ArtOfTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		Select sl= new Select(driver.findElement(By.id("testingDropdown")));
		sl.selectByIndex(3);
		sl.selectByValue("Performance");
		sl.selectByVisibleText("Database Testing");
		List<WebElement> ls= sl.getAllSelectedOptions();
		//sl.isMultiple();
		for(WebElement l: ls)
		{
		System.out.println(l.getText());
		}
		List<WebElement> ls1= sl.getOptions();
		for(WebElement l: ls1)
		{
		System.out.println(l.getText());
		}
		

	}

}
