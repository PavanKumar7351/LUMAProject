package com.telus.projectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.seleniumframework.logs.Log;
import com.telus.basePackage.TestBase;

public class CreateAccountPage extends TestBase {


	// webelements
	By create=By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
	By firstName = By.id("firstname");
	By lastName = By.id("lastname");
	By subscribed = By.id("is_subscribed");
	By email = By.id("email_address");
	By password = By.id("password");
	By confirmPass = By.id("password-confirmation");
	By SubmitBtn = By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]");

	// Action Methods
	public void createA() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		driver.navigate().refresh();
		Thread.sleep(1000);
		WebElement c=driver.findElement(create);

		boolean a1 = c.isDisplayed();
		soft.assertTrue(a1, "CreateAccount is not displayed");
		Log.info("CreateAccount is displayed");
		c.click();
		soft.assertAll();
		Thread.sleep(1000);

	}
	public void setFirstName(String fname) throws InterruptedException {

		driver.navigate().refresh();
		Thread.sleep(3000);
		SoftAssert soft = new SoftAssert();

		WebElement f = driver.findElement(firstName);
		f.sendKeys(fname);
		boolean a1 = f.isDisplayed();
		soft.assertTrue(a1, "First Name is not displayed");
		Log.info("First Name is displayed" + fname);
		soft.assertAll();

	}

	public void setLastName(String lname) {
		SoftAssert soft = new SoftAssert();

		WebElement f = driver.findElement(lastName);
		f.sendKeys(lname);
		boolean a1 = f.isDisplayed();
		soft.assertTrue(a1, "Last Name is not displayed");
		Log.info("Last Name is displayed" + lname);
		soft.assertAll();

	}

	public void clickSubscribed() {
		SoftAssert soft = new SoftAssert();

		WebElement f = driver.findElement(subscribed);
		f.click();
		boolean a1 = f.isDisplayed();
		soft.assertTrue(a1, "subscribed is not displayed");
		Log.info("subscribed is displayed");
		soft.assertAll();
	}

	public void setEmail(String e_mail) {

		SoftAssert soft = new SoftAssert();

		WebElement f = driver.findElement(email);
		f.sendKeys(e_mail);
		boolean a1 = f.isDisplayed();
		soft.assertTrue(a1, "Email is not displayed");
		Log.info("Email is displayed" + e_mail);
		soft.assertAll();
	}

	public void setPassword(String password2) {
		SoftAssert soft = new SoftAssert();

		WebElement f = driver.findElement(password);
		f.sendKeys(password2);
		boolean a1 = f.isDisplayed();
		soft.assertTrue(a1, "Password is not displayed");
		Log.info("Password is displayed" + password2);
		soft.assertAll();
	}

	public void setConfirmPassword(String cpword) {

		SoftAssert soft = new SoftAssert();

		WebElement f = driver.findElement(confirmPass);
		f.sendKeys(cpword);
		boolean a1 = f.isDisplayed();
		soft.assertTrue(a1, "confirmPass is not displayed");
		Log.info("Email is displayed" + cpword);
		soft.assertAll();
	}

	public void clickSubmitButton() {

		SoftAssert soft = new SoftAssert();

		WebElement f = driver.findElement(SubmitBtn);
		boolean a1 = f.isEnabled();
		soft.assertTrue(a1, "SubmitBtn is not Enabled");
		f.click();
		Log.info("Submit is Enabled");
		soft.assertAll();
	}

}
