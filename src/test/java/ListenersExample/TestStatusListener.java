package ListenersExample;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestStatusListener extends BaseClass implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		Screenshot(result.getName());
		System.out.println("Test case id passed");
	}

}
