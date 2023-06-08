package TestSample;

import java.io.IOException;

import TestSample.BaseInitialization;

public class Testextend extends BaseInitialization {

	public static void main(String[] args) throws IOException {
		
		BaseInitialization BaseInti1 = new BaseInitialization();
		BaseInti1.BaseInti();
		BaseInti1.test();
		String expectedTitle = "Welcome: Mercury Tours";
		
	}
}

