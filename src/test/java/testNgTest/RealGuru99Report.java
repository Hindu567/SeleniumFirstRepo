package testNgTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class RealGuru99Report extends Base implements ITestListener{
WebDriver driver;

	public void onTestStart(ITestResult result) {
		driver = new FirefoxDriver();
		System.out.println("your test started");
		File File = ((TakesScreenshot)driver)
                .getScreenshotAs(OutputType.FILE);
		 File Dest=new File("C:\\Users\\hindumathi.matike\\Documents\\Backup Documents\\Failed.png");
		 try {
			FileUtils.copyFile(File, Dest);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("your test is success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("your test is failed");
	}

}
