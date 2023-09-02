package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {

	@BeforeSuite
	public void befrSuite() {
		System.out.println("Before Suite Execution Started");

	}

	@AfterSuite
	public void aftrsuite() {
		System.out.println("After Suite Execution started");

	}

	@BeforeTest
	public void beforeTestPackage() {
		System.out.println("Before Test package execution started");

	}

	@AfterTest
	public void afterTestPackage() {
		System.out.println("After Test package execution started");

	}

	@BeforeClass
	public void befrclass() {
		System.out.println("Before Class  execution started");

	}

	@AfterClass
	public void aftrclass() {
		System.out.println("After Class  execution started");

	}

	@BeforeMethod
	public void befrMehtod() {
		System.out.println("Before Method  execution started");

	}

	@AfterMethod
	public void aftrMehtod() {
		System.out.println("After Method  execution started");

	}

	@Test
	public void test01() {
		System.out.println("Test01");

	}
	@Test
	public void test02() {
		System.out.println("Test02");

	}
}
