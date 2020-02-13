package TestNg;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampletest2 {
	
	@BeforeSuite
	public void beforesuitemethod(){
		System.out.println("i'm in beforesuitemethod2");
	}
	
	@BeforeTest
	public void beforetestmethod(){
		System.out.println("i'm in beforetestmethod2");
	}
	
	@BeforeMethod
	public void befoermethod(){
		System.out.println("i'm in befoermethod2");
	}
	
	@BeforeClass
	public void beforeclassmethod(){
		System.out.println("i'm in beforeclassmethod2");
	}
	
	@AfterSuite
	public void aftersuitemethod(){
		System.out.println("i'm in aftersuitemethod2");
	}
	
	@AfterTest
	public void aftertestmethod(){
		System.out.println("i'm in aftertestmethod2");
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("i'm in aftermethod2");
	}
	
	@AfterClass
	public void afterclassmethod(){
		System.out.println("i'm in afterclassmethod2");
	}
	
	@Test(priority=0,enabled=true)
	public void div(){
		System.out.println("the divof 2 values is 5");
	}
	
	@Test(priority=1,enabled=false)
	public void sam(){
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,enabled=true)
	public void mul(){
		System.out.println("the mul of 2 values is 2");
	}

}
