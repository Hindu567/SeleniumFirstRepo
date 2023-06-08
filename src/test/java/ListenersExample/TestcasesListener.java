package ListenersExample;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersExample.TestStatusListener.class)
public class TestcasesListener extends BaseClass {
	 
	public void setup() {
		Init();
	}
	@Test
	public void Test1() {
		
		System.out.println("test case executed");
	}

}
