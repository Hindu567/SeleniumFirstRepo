package ArtOfTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class paginationExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'close')]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-4']/li[1]")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		String pages= text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1);
		int tpages= Integer.valueOf(pages);
		System.out.println(tpages);
		
		for(int p=1;p<=2;p++)
		{
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(2000);
			WebElement activepage= driver.findElement(By.xpath("//ul[@class='pagination']/li/span"));
			activepage.click();
			
		int trows=driver.findElements(By.xpath("//table[contains(@class,'table table-bordered table-hover')]/tbody/tr")).size();
		int tcol= driver.findElements(By.xpath("//table[contains(@class,'table table-bordered table-hover')]/thead/tr/td")).size();
		System.out.println(trows);
		System.out.println(tcol);
		String pagen= Integer.toString(p+1);
		driver.findElement(By.xpath("//ul[@class='pagination']/li/a[text()='"+pagen+"']")).click();
		for(int r=1;r<=trows;r++)
		{
			String orderID= driver.findElement(By.xpath("//table[contains(@class,'table table-bordered table-hover')]/tbody/tr["+r+"]/td[2]")).getText();
			String customer= driver.findElement(By.xpath("//table[contains(@class,'table table-bordered table-hover')]/tbody/tr["+r+"]/td[4]")).getText();
			
			System.out.println("order ID is  "+ orderID+ "   customer is  " + customer );
		}
		
		
		}

	}

}
