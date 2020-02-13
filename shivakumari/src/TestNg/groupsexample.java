package TestNg;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groupsexample {
	
	@BeforeGroups("Regression")
	public void group1(){
		System.out.println("i'm in regression group");
	}
	
	@AfterGroups("Regression")
	public void aftergroup1(){
		System.out.println("i'm in after regression group");
	}
	
	@BeforeGroups("sanity")
	public void group2(){
		System.out.println("i'm in sanity group");
	}
	
	@AfterGroups("sanity")
	public void aftergroup2(){
		System.out.println("i'm in aftersanity group");
	}
	
	@Test(groups="Regression")
	public void sam(){
		System.out.println("i'm in regression test1");
	}
	
	@Test(groups="Regression")
	public void red(){
		System.out.println("i'm in regression test2");
	}
	
	@Test(groups="sanity")
	public void add(){
		System.out.println("i'm in sanity test3");
	}
	
	@Test(groups="sanity")
	public void green(){
		System.out.println("i'm in sanity test4");
	}



}
