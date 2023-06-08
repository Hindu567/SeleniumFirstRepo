package TestSampleExtend;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import TestSample.BaseInitialization;

public class Testextend extends BaseInitialization {

	public static void main(String[] args) throws IOException {
		
		BaseInitialization BaseInti1 = new BaseInitialization();
		Testextend Testextend1 = new Testextend();
		//Testextend1.test="test";
		//System.out.println(Testextend1.test);
		
		Testextend1.BaseInti();
		BaseInti1.BaseInti();
		//BaseInti1.Prop();
		//BaseInti1.test();
		String expectedTitle = "Welcome: Mercury Tours";
		Properties prop= new Properties();
		InputStream input = new FileInputStream((System.getProperty("user.dir")+ "/src/main/java/Data.properties"));
		prop.load(input);
		BaseInti1.BaseInti().get(prop.getProperty("url"));
		String actTitle= BaseInti1.BaseInti().getTitle();
		if(actTitle.contentEquals(expectedTitle))
		{
			System.out.println("Macthed");
		}
		else {
			System.out.println("not macthed");
		}
		
	}
}

