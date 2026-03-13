package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest { // - LoginTest inherits driver from BaseTest

	@Test
	public void testValidLogin() {
		
		LoginPage loginPage = new LoginPage(driver); //- LoginPage doesn’t inherit anything — it just accepts driver as a parameter.

		loginPage.enterUserName("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();
		
		System.out.println("The Title of the page is "+ driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
	}

	

}
