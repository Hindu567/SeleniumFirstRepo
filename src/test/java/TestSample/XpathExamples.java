package TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathExamples {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.lambdatest.com/register/");
		
		//XPath = //tagname[@Attribute=’Value’]
		driver.findElement(By.xpath("//img[@alt='LambdaTest']"));
		
		//tagname[contains(@attribute,constantvalue)]
		driver.findElement(By.xpath("//button[contains(@type,'sub')]"));
		
		//or & and
		
		driver.findElement(By.xpath("//input[@name='email' or  contains(@placeholder, 'Email')]"));
		
		////tagname[text()=’Text of the Web Element’]
		
		driver.findElement(By.xpath("//span[text()='Sign up with Google']"));
		
		////tagname[starts-with(@attribute,value)]
		driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Phone')]"));
		////tagname[@attribute=’value’][Index Number]
		driver.findElement(By.xpath(""));
		
		////div[contains(@class,'password-group')]//following::div//input[@type='phone']
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		//dropdown example
		driver.findElement(By.xpath("//option[@value='ALGERIA']//following-sibling::option[2]"));
		driver.findElement(By.xpath("//option[@value='ANGOLA']//preceding-sibling::option[2]"));
		
		//preceding
		driver.findElement(By.xpath("//div[@Class='w-full custom__border xl:mt-20 mt-10']//preceding::input[@type='password']"));
		
		//child
		//tagname[@attribute=’value’]//child::tagname
		//under a there are two nodes span and img
		driver.findElement(By.xpath("//a[contains(@class,'googleSignInBtn')]//child::span"));
		driver.findElement(By.xpath("//a[contains(@class,'googleSignInBtn')]//child::imag"));
		//parent
		driver.findElement(By.xpath("//input[@type='email']//parent::div//following-sibling::div//input[@type='password']"));
		//descendant-any child or grndchild node
		driver.findElement(By.xpath("//div[contains(@class,'w-full custom__border xls:mt-20 mt-10')][2]//descendant::span"));
		//Ancestors refer to the parent nodes, grandparent nodes, 
		
		//last
		driver.findElement(By.xpath("//div[@class='pagination']/ul/li[last()]"));
		

	}

}
