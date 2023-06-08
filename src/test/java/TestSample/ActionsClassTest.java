package TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {
	public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	Actions builder = new Actions(driver);
	WebElement el= driver.findElement(By.id("Email"));
	
	Action sr=builder.moveToElement(el).keyDown(el, Keys.SHIFT).sendKeys(el, "TEST").contextClick(el)
	.build();
  sr.perform() ;
/*
 * .keyUp(el, Keys.SHIFT)
.doubleClick(el)
.contextClick()
*/
 

}
	
}
