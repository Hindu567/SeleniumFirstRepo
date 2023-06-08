package ListenersExample;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	  
	WebDriver driver = new FirefoxDriver();;
	public void Init()
	{
		System.out.println("init is executed");
		driver.get("http://demo.guru99.com/test/newtours/");
		
	}
	
	public void Screenshot(String testMethodName)
	{
		 File srcfile = ((TakesScreenshot)driver)
                 .getScreenshotAs(OutputType.FILE);
		 Date d= new Date();
		 String timestamp=d.toString().replace(":", "_").replace(" ", "_");
		 File Dest=new File("C:/dev/workspace/Sample/Screenshots/" + testMethodName +"_"+ timestamp + ".png");
		 try {
			FileUtils.copyFile(srcfile, Dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}

}

