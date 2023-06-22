package ArtOfTesting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parent= driver.getWindowHandle();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,250)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(1000);
		//driver.switchTo().defaultContent();
		Set<String> wins=	driver.getWindowHandles();
		Iterator<String> it= wins.iterator();
		//it.next();
		System.out.println("parent ID "+ it.next() );
		System.out.println("child ID "+ it.next() );
		
		List<String> winsl= new ArrayList(wins);
		
		System.out.println("parent ID  array "+ winsl.get(0) );
		System.out.println("child ID array "+ winsl.get(1));
		//switching between windows
		String parentw= winsl.get(0);
		String childw= winsl.get(1);
		Thread.sleep(1000);
		driver.switchTo().window(parentw);
		System.out.println("parent title" + driver.getTitle());
		Thread.sleep(1000);
		//driver.switchTo().window(childw);
		//System.out.println("child title" + driver.getTitle());
		
		

	}

}
