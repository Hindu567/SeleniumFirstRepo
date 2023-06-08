package testNgTest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

/*
 * priority order, -1, 0, 1
 * enable-will inclue or exclude
 */
public class TestngExample
{
	@Test(priority=1)
	public void Testmethod1()
	{System.out.println("this is test1");}
	
	@Test(groups= {"group1"})
	public void Testmethod2()
	{System.out.println("this is test2");	}
	
	@Test(enabled=true, priority=-1)
	public void Testmethod3()
	{	System.out.println("this is test3");}
	@Ignore
	@Test( priority=2, groups= {"group1"})
	public void Testmethod4()
	{	System.out.println("this is test4");}
	
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("this is beforemethod");
	}
	@AfterMethod
	public void AfterMethod()
	{	System.out.println("this is aftermethod");}
	@BeforeTest
	public void Beforetest() {System.out.println("this before test");}
	@AfterTest
	public void Aftertest() {System.out.println("this is after test");}
	@BeforeClass
	public void Beforeclass() {System.out.println("this is beforeclass");}
	@AfterClass
	public void Afterclass() {System.out.println("this is after class");}

}
