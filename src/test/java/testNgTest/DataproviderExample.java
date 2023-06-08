package testNgTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample

{
	@DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "Guru99", "India" },
            { "Krishna", "UK" },
            { "Bhupesh", "USA" }
        };
	
	}
	@Test(dataProvider="SearchProvider")
    public void testMethod(String author,String searchKey) 
	{
	System.out.println(author  +  "" + searchKey);
}
}
