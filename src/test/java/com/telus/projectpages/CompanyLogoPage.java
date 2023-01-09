package com.telus.projectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.seleniumframework.logs.Log;
import com.telus.basePackage.TestBase;

public class CompanyLogoPage extends TestBase {

	By logo=By.xpath("//a[@aria-label='store logo']//img");

	public void companyLogo() {
		driver.navigate().refresh();
		SoftAssert soft=new SoftAssert();
		WebElement l=driver.findElement(logo);
		boolean a=l.isDisplayed();
		soft.assertTrue(a,"Logo is Not Displayed");
		Log.info("is Displayed");

	}

}
