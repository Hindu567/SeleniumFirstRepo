package testNgTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class ParameterExample 
{
	
 @Parameters({"name", "name1"})
 @Test(invocationCount=10)
  public void ParameterExample(String name, String name1) {
	  System.out.println("print  "+ name + "   "+ name1);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
