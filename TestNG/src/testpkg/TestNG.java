package testpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	WebDriver driver;
	@BeforeTest
	public void test() {
		System.out.println("testttt");
		//Webdrivermanager.
		
	}
	@Test
	public void tstt() {
		System.out.println();
	}
}
