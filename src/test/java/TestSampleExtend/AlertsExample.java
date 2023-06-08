package TestSampleExtend;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.findElement(By.xpath("//button[contains(@onclick,'generateAlertBox')]")).click();
		Thread.sleep(2000);
	//	driver.switchTo().alert().accept();
		Alert al= driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@onclick,'generateConfirmBox()')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

}
