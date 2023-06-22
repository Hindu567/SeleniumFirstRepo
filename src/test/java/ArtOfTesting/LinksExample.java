package ArtOfTesting;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksExample {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://deadlinkcity.com/");
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		int blinkcount=0;
		
		for(WebElement l: links)
		{
			//System.out.println(l.getText());
			String url=l.getAttribute("href");
			if(url==null|| url.isEmpty())
			{
				System.out.println("url is empty");
				continue;
			}
			
			URL ul= new URL(url);
			HttpURLConnection con= (HttpURLConnection) ul.openConnection();
			con.connect();
			if(con.getResponseCode()>=400)
			{
				System.out.println(con.getResponseCode()+ " "+ url + " is a broken link");
				blinkcount++;
				
			}
			else
			{
				System.out.println(con.getResponseCode()+ " "+url +" url is valid");
			}
		}
		System.out.println(blinkcount);
	}

}
