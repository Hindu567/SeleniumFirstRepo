package ArtOfTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		WebElement textBoxElement=	driver.findElement(By.xpath("//input[@type='text']"));
	
		Actions act = new Actions(driver);
		Action typeincaps=act.keyDown(textBoxElement, Keys.SHIFT)
				.sendKeys("text").keyUp(textBoxElement, Keys.SHIFT).build();
		typeincaps.perform();
		
	}

}
