package TestSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		 driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");
		 List<WebElement> col = driver.findElements(By.xpath("//table[@Class='dataTable']/thead/tr/th"));
		 
		 List<WebElement> row= driver.findElements(By.xpath("//table[@Class='dataTable']/tbody/tr"));
		 
		 List<WebElement> rowtd=driver.findElements(By.xpath("//table[@Class='dataTable']/tbody/tr[1]/td"));

		 System.out.println(col.size()+"\n" + row.size());
		 System.out.println(col.get(3).getText());
		 for(WebElement r: row)
		 {
			for (WebElement rd:rowtd) 
			{
				System.out.println(rd.getText());
			}
		 }
	}

}
