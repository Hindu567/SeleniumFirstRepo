package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	WebDriver driver;
	By reglink= By.linkText("REGISTER");
	By firstname= By.name("firstName");
	By lastname= By.name("lastName");
	By phone= By.name("phone");
	By email= By.id("userName");
	By adr1= By.name("address1");
	By cit=By.name("city");
	By state1=By.name("state");
	By postalCode=By.name("postalCode");
	By country1=By.name("country");
	By username1=By.name("email");
	By Password=By.name("password");
	By confirmPassword=By.name("confirmPassword");
	
	By sub= By.name("submit");
	
	public RegisterPage(WebDriver d)
	{
		driver=d;
	}
	public void ClickonRegister()
	{driver.findElement(reglink).click();}
	
	public void setFirstName(String fname)
	{driver.findElement(firstname).sendKeys(fname);}
	
	public void setLastName(String lname)
	{driver.findElement(lastname).sendKeys(lname);}
	
	public void setPhone(String phonenumber)
	{driver.findElement(phone).sendKeys(phonenumber);}
	
	public void SetEmail(String emailadr)
	{driver.findElement(email).sendKeys(emailadr);}
	
	public void SetAdrress(String address)
	{driver.findElement(adr1).sendKeys(address);}
	
	public void SetCity(String city)
	{driver.findElement(cit).sendKeys(city);}
	public void SetState(String state) {driver.findElement(state1).sendKeys(state);}
	public void SetPostalCode(String pcode) {driver.findElement(postalCode).sendKeys(pcode);}
	
	public void setCountry(String c) 
	{
		WebElement Con= driver.findElement(country1);
		Select drop= new Select(Con);
		drop.selectByVisibleText(c);
	}
	public void setUsername(String username) {driver.findElement(username1).sendKeys(username);}
	public void setPassword(String password) {driver.findElement(Password).sendKeys(password);}
	public void setConfirmPassword(String cpassword) {driver.findElement(confirmPassword).sendKeys(cpassword);}
	
	public void Submit() {driver.findElement(sub).click();}
	
	
	
	
	
	
	
	
}

