package testNgTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnExample {

	@Test(groups="smoke")
	public void Test1() {
		
		String act="Test";
		String exp="Test1";
		Assert.assertEquals(act, exp);
		System.out.println("this 1 is under smoke and failed");}
	
	@Test(groups="sanity", dependsOnMethods= {"Test1"}, alwaysRun=true)
	public void Test2() {System.out.println("this 2 is under sanity");}
	
	@Test(groups="sanity", timeOut=200)
	public void Test3() throws InterruptedException {
		Thread.sleep(210);
		System.out.println("this 3 is under sanity");}
	
	@Test(groups="smoke" ,priority = -2,invocationCount=2)
	public void Test4() {System.out.println("this 4 is under smoke");}
}
