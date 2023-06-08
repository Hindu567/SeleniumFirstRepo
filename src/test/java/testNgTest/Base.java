package testNgTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Base {
	public static WebDriver driver;
	public static void success()
	{
		
		File File = ((TakesScreenshot)driver)
                 .getScreenshotAs(OutputType.FILE);
		 File Dest=new File("C:\\Users\\hindumathi.matike\\Documents\\Backup Documents\\success.pgn");
		 try {
			FileUtils.copyFile(File, Dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
