package pageObjectTests;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageObjectModels.RegisterPage;

public class RegisterPageTest 
{
	@Test
	public void VerifyRegistration() throws IOException
	{
		WebDriver driver = new FirefoxDriver();		
		RegisterPage regpage= new RegisterPage(driver);
		//reading properties file
		FileReader reader=new FileReader("C:\\dev\\workspace\\Sample\\src\\main\\java\\Peroperties.properties");
		Properties prop= new Properties();
		prop.load(reader);
		
		driver.get(prop.getProperty("url"));
		
		regpage.ClickonRegister();
		regpage.setFirstName("Hindu");
		regpage.setLastName("M");
		regpage.setPhone("9753423456");
		regpage.SetEmail("hindumathi1234@gmail.com");
		regpage.SetAdrress("Uppal");
		regpage.SetPostalCode("500902");
		regpage.SetCity("Hyderabad");
		regpage.SetState("TS");
		regpage.setCountry("INDIA");
		
		regpage.setUsername("Hindu1");
		regpage.setPassword("password123");
		regpage.setConfirmPassword("password123");
		regpage.Submit();
		if(driver.getPageSource().contains("Thank you for registering. "))
		{
			System.out.println("Registration is successful");
		}
		
	}

}
