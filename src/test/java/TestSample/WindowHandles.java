package TestSample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.Timeout;

public class WindowHandles {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		/*
		String orgwin= driver.getWindowHandle();
		//driver.switchTo().newWindow(WindowType.TAB);
		System.out.println(orgwin);
		driver.switchTo().newWindow(WindowType.WINDOW);
		String secwin=driver.getWindowHandle();
		System.out.println(secwin);
		Thread.sleep(2000);
		driver.switchTo().window(orgwin);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		*/
		
		//taking screenshot
		TakesScreenshot sc= (TakesScreenshot)driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\hindumathi.matike\\Desktop\\Backup Desktop\\test.png");
		FileUtils.copyFile(src, dest);
		System.out.println("screenshot has been taken and File is created");
		//screenshot of an element
		//TakesScreenshot sce= (TakesScreenshot)driver;
		//WebElement webe=driver.findElement(By.cssSelector("input[name='username']"));
		WebElement webe= driver.findElement(By.name("userName"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement webelm= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		File srce=webe.getScreenshotAs(OutputType.FILE);
		File deste= new File("C:\\Users\\hindumathi.matike\\Desktop\\Backup Desktop\\teste.png");
		FileUtils.copyFile(srce, deste);
		
		//print options-only in chrome headlessmode
		 Path printPage = Paths.get("C:\\Users\\hindumathi.matike\\Desktop\\Backup Desktop\\PrintPageFirefox.pdf");
		PrintsPage	printer=(PrintsPage)driver;
		PrintOptions printOptions = new PrintOptions();
	    printOptions.setPageRanges("1-2");
	    Pdf pdf = printer.print(printOptions);
	    String content = pdf.getContent();
	   // Files.write(printPage, OutputType.BYTES.convertFromBase64Png(content));
	    //FileUtils.copyFile(printPage, content);
	   // Files.write(printPage, content);
		System.out.println("printed");
		
		// Set<String> allWindowHandles = driver.getWindowHandles();
		List<WebElement> ls= driver.findElements(By.id(""));
	}

}
