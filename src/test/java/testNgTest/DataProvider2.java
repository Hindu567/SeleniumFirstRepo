package testNgTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 
{
	@Test(dataProvider="TestData")
	public void DataProviderTest(String name, String place)
	{
		System.out.println( name +" "+ place);
	}

	@DataProvider(name="TestData")
	public Object[][] testDataProvider(){
	return new Object[][] 
	    	{
	            { "Guru99", "India" },
	            { "Krishna", "UK" },
	            { "Bhupesh", "USA" },
	            {"test1", "qa1"}
	        };
}}
