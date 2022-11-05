package org.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Welcome {

	@BeforeClass
	private void beforeclass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	private void afterclass() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	private void bmethod() {
		System.out.println("before method");
	}
	
	@AfterMethod
	private void amethod() {
		System.out.println("after method");
	}
	
	@Test
	private void test1() {
		System.out.println("Test1 method");
	}
}
