package TestNgpractice.TestNgpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {

  @Test
  public void TestA() {
	  System.out.println("This is a test A method ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is a beforeMethod ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is a afterMetho ");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is a beforeClass ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is a afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is a beforeTest ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is a afterTest ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is a beforeSuite ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is a afterSuite ");
  }

}
