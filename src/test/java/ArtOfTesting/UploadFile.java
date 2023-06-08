package ArtOfTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();
		
		StringSelection select = new StringSelection("C:\\Users\\hindumathi.matike\\Desktop\\eCertificate.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		driver.get("https://www.foundit.in/seeker/registration");
		 Thread.sleep(1000);
        // Find the upload textbox
       WebElement cl=  driver.findElement(By.xpath("/html/body/div[3]/div/section/div/div[1]/div[4]/div[1]/div/div/i"));
       //cl.click();
   
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].click();", cl);
        Thread.sleep(1000);
		//driver.switchTo().frame("uploadframe");
		//driver.findElement(By.id("uploadfile_0")).click();
         Robot robot = new Robot();
         Thread.sleep(1000);
         
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
         Thread.sleep(1000);

         // Release CTRL+V
         robot.keyRelease(KeyEvent.VK_CONTROL);
         robot.keyRelease(KeyEvent.VK_V);
         robot.setAutoDelay(1000);

         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
         
         driver.findElement(By.xpath("//input[@type= 'checkbox']")).click();
         driver.findElement(By.xpath("//button[@type= 'button']")).click();
         
         String UploadImage = driver.findElement(By.name("url1[]")).getText();
         //https://demo.guru99.com/test/upload/
         if (UploadImage.contains("has been successfully uploaded")) {
             System.out.println("Image Uploaded Successfully");
         } else {
             System.out.println("Image Upload Failed");
         }
	}

}
