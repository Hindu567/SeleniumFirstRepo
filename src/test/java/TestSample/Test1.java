package TestSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
static WebDriver driver;
	public static void main(String[] args) 
	{
		BaseInitialization BaseInti = new BaseInitialization();
		try {
			driver=new ChromeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		
	//	driver.findElement(By.cssSelector(a[href='/b/32702023031?node=32702023031&amp;ld=AZINSOANavDesktop_T3&amp;ref_=nav_cs_sell_T3'])));
		driver.findElement(By.linkText("Sell"));
		
		List<WebElement> elem= driver.findElements(By.tagName("a"));
		
		}

}
