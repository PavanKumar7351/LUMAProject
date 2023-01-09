package com.telus.testcases;

import java.text.ParseException;

import org.testng.annotations.Test;

import com.telus.objectManager.ObjectManager;
import com.telus.utilities.ReadXLSData;
import com.telus.utilities.TestUtilites;

public class TestMethodsTest extends ObjectManager {

	TestUtilites t=new TestUtilites();

	@Test(priority = 1, enabled = false)
	public void logo() {

		logo.companyLogo();

	}

	@Test(priority = 2, enabled = false)
	public void links() {

		links.verifyLinks();
	}

	@Test(priority = 3, enabled = false)
	public void dropDown() throws InterruptedException {

		drop.womenTops();
		drop.womemBottoms();
		drop.menTops();
		drop.menBottoms();
		drop.gears();

	}

	@Test(priority = 4, enabled = false)
	public void mensProductsName() throws InterruptedException {

		menProduct.productNames();
	}

	@Test(priority = 5, enabled = false)
	public void womenroductsName() throws InterruptedException {

		womenProduct.productNames();

	}

	@Test(priority = 6, enabled = false)
	public void productSelection() throws InterruptedException, ParseException {

		product.productSelection();
		product.category();
		product.productSelect();

	}
	@Test(dataProviderClass = ReadXLSData.class,dataProvider = "testdata",priority = 7,enabled=true)
	public void Sheet1(String firstName,String lastName,String password) throws InterruptedException {
		createAccount.createA();
		createAccount.setFirstName(firstName);
		createAccount.setLastName(lastName);
		createAccount.clickSubscribed();
		createAccount.setEmail(t.email);
		createAccount.setPassword(password);
		createAccount.setConfirmPassword(password);
		createAccount.clickSubmitButton();


	}

	@Test(priority = 8)
	public void closeApplicstion() {
		driver.quit();
	}

}
