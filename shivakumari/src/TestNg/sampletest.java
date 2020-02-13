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

public class sampletest {
	
	@BeforeSuite
	public void beforesuitemethod(){
		System.out.println("i'm in beforesuitemethod1");
	}
	
	@BeforeTest
	public void beforetestmethod(){
		System.out.println("i'm in beforetestmethod1");
	}
	
	@BeforeMethod
	public void befoermethod(){
		System.out.println("i'm in befoermethod1");
	}
	
	@BeforeClass
	public void beforeclassmethod(){
		System.out.println("i'm in beforeclassmethod1");
	}
	
	@AfterSuite
	public void aftersuitemethod(){
		System.out.println("i'm in aftersuitemethod1");
	}
	
	@AfterTest
	public void aftertestmethod(){
		System.out.println("i'm in aftertestmethod1");
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("i'm in aftermethod1");
	}
	
	@AfterClass
	public void afterclassmethod(){
		System.out.println("i'm in afterclassmethod1");
	}
	
	@Test(priority=0,enabled=false)
	public void add(){
		System.out.println("the add of 2 values is 10");
	}
	
	@Test(priority=1,enabled=true)
	public void sam(){
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,enabled=false)
	public void sub(){
		System.out.println("the sub of 2 values is -10");
	}
	

}
