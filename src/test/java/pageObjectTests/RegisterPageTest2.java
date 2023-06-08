package pageObjectTests;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjectModels.RegisterPage;

public class RegisterPageTest2 
{
	@Test
	public void VerifyRegistration() throws IOException, InterruptedException
	{
		WebDriver driver = new FirefoxDriver();		
		RegisterPage regpage= new RegisterPage(driver);
		//reading properties file
		FileReader reader=new FileReader("C:\\dev\\workspace\\Sample\\src\\main\\java\\Peroperties.properties");
		Properties prop= new Properties();
		prop.load(reader);		
		driver.get(prop.getProperty("url"));
		Reporter.log("url is opened");
		String csvpath="C:\\Users\\hindumathi.matike\\Documents\\Test.csv";
		Reader reader1= Files.newBufferedReader(Paths.get(csvpath));
		CSVParser parser= new CSVParser(reader1, CSVFormat.DEFAULT);

		int flag = 0;
		for (CSVRecord csvrecord: parser)
		{
			regpage.ClickonRegister();
			Thread.sleep(1000);
			
			String funame=csvrecord.get(0);
			String lastunmae=csvrecord.get(1);	
			String ph=csvrecord.get(2);
			String eml=csvrecord.get(3);
			String adr=csvrecord.get(4);
			String pc= csvrecord.get(5);
			String cty= csvrecord.get(6);
			String st= csvrecord.get(7);
			String con= csvrecord.get(8);	
			String usern= csvrecord.get(9);
			String psw= csvrecord.get(10);
			String cpw= csvrecord.get(11);
			
			regpage.setLastName(lastunmae);
			Reporter.log("firstname is entered ");
			regpage.setFirstName(funame);
			Reporter.log("lastname is entered ");
			regpage.SetEmail(eml);
			Reporter.log("email is entered ");
			regpage.SetAdrress(adr);
			Reporter.log("adrress is entered ");
			regpage.SetCity(cty);
			Reporter.log("city is entered ");
			regpage.setPhone(ph);
			regpage.SetPostalCode(pc);
			regpage.SetState(st);
			regpage.setCountry(con);
			regpage.setUsername(usern);
			regpage.setPassword(psw);
			regpage.setConfirmPassword(cpw);
	Thread.sleep(3000);
			regpage.Submit();
			
			if(driver.getPageSource().contains("Thank you for registering. "))
			{
				Assert.assertTrue(true);
				flag=flag+1;
				System.out.println("Registration is successful for " + flag);
			}
		}	
	}
}
