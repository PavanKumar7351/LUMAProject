package com.telus.projectpages;

import java.text.NumberFormat;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import com.seleniumframework.logs.Log;
import com.telus.basePackage.TestBase;

public class ProductSelection extends TestBase{



	By men=By.xpath("//*[@id=\"ui-id-5\"]/span[2]");
	By menT=By.xpath("//*[@id=\"ui-id-17\"]/span[2]");
	By ce=By.xpath("//div[normalize-space()='Category']");
	By jacket=By.xpath("//a[contains(text(),'Jackets')]");
	By gt=By.xpath("//*[@id=\"layered-filter-block\"]/div[2]/div[1]/ol/li/span[2]");
	By pr=By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img");
	By pn=By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span");
	By price=By.xpath("//*[@id=\"product-price-430\"]/span");
	By des=By.xpath("//*[@id=\"description\"]");
	By img=By.xpath("//img[@alt='Proteus Fitness Jackshirt']");
	By si=By.xpath("//*[@id=\"option-label-size-143-item-166\"]");
	By s1=By.id("option-label-size-143-item-166");
	By s2=By.id("option-label-size-143-item-167");
	By s3=By.id("option-label-size-143-item-168");
	By s4=By.id("option-label-size-143-item-169");
	By s5=By.id("option-label-size-143-item-170");
	By s6=By.id("option-label-color-93-item-49");
	By s7=By.id("option-label-color-93-item-50");
	By s8=By.id("option-label-color-93-item-56");



	public void productSelection() {
		Actions action=new Actions(driver);
		WebElement m=driver.findElement(men);
		action.moveToElement(m).perform();
		WebElement mt=driver.findElement(menT);
		action.moveToElement(mt).click().perform();
	}
	public void category() throws InterruptedException {
		SoftAssert st=new SoftAssert();
		Actions action =new Actions(driver);
		WebElement cat=driver.findElement(ce);
		action.moveToElement(cat).click().perform();
		WebElement j=driver.findElement(jacket);
		action.moveToElement(j).click().perform();
		Thread.sleep(2000);
		WebElement tg=driver.findElement(gt);
		String text=tg.getText();
		st.assertEquals(text,"Jackets", "Seraching category getting wrong");
		st.assertAll();

	}
	public void productSelect() throws InterruptedException, ParseException {
		SoftAssert st=new SoftAssert();
		driver.findElement(pr).click();
		Thread.sleep(2000);
		WebElement pname=driver.findElement(pn);
		String name=pname.getText();
		boolean n1=pname.isDisplayed();
		boolean n2=pname.isEnabled();
		st.assertTrue(n1,"Product is not Displayed");
		st.assertTrue(n2,"Product is not Enabled");
		st.assertEquals(name,"Proteus Fitness Jackshirt", "Seraching product getting wrong");

		WebElement pri=driver.findElement(price);
		String amount=pri.getText();
		NumberFormat format2 = NumberFormat.getCurrencyInstance();
		 Number number2 = format2.parse(amount);
		 String paaa2=(number2.toString());
		 float totalAmount = Float.parseFloat(paaa2);
		 Log.info("Product Price :"+totalAmount);
		boolean a1=pri.isDisplayed();
		st.assertTrue(a1, "Amount is not displayed");
		//st.assertEquals(totalAmount, 45.00,"Amount not matchind");
		WebElement dis=driver.findElement(des);
		String ded=dis.getText();
		Log.info(ded);
		boolean a2=dis.isDisplayed();
		st.assertTrue(a2, "Discreption is not Displayed");
		WebElement i=driver.findElement(img);
		boolean ii=i.isDisplayed();
		st.assertTrue(ii, "Product Image is Not Displayed");
		st.assertAll();
		WebElement siz=driver.findElement(si);
		siz.click();
		boolean a3=siz.isDisplayed();
		boolean a4=siz.isEnabled();
		st.assertTrue(a3,"size is not displayed");
		st.assertTrue(a4,"size is not Enabled");
		Thread.sleep(1000);

		WebElement q1=driver.findElement(s1);
		q1.click();
		boolean a31=q1.isDisplayed();
		boolean a41=q1.isEnabled();
		st.assertTrue(a31,"size is not displayed");
		st.assertTrue(a41,"size is not Enabled");
		Thread.sleep(1000);

		WebElement q2=driver.findElement(s2);
		q2.click();
		boolean a32=q2.isDisplayed();
		boolean a42=q2.isEnabled();
		st.assertTrue(a32,"size is not displayed");
		st.assertTrue(a42,"size is not Enabled");
		Thread.sleep(1000);

		WebElement q3=driver.findElement(s3);
		q3.click();
		boolean a33=q3.isDisplayed();
		boolean a43=q3.isEnabled();
		st.assertTrue(a33,"size is not displayed");
		st.assertTrue(a43,"size is not Enabled");
		Thread.sleep(1000);

		WebElement q4=driver.findElement(s4);
		q4.click();
		boolean a34=q4.isDisplayed();
		boolean a44=q4.isEnabled();
		st.assertTrue(a34,"size is not displayed");
		st.assertTrue(a44,"size is not Enabled");
		Thread.sleep(1000);

		WebElement q5=driver.findElement(s5);
		q5.click();
		boolean a35=q5.isDisplayed();
		boolean a45=q5.isEnabled();
		st.assertTrue(a35,"size is not displayed");
		st.assertTrue(a45,"size is not Enabled");
		Thread.sleep(1000);

		WebElement q6=driver.findElement(s6);
		q6.click();
		boolean a36=q6.isDisplayed();
		boolean a46=q6.isEnabled();
		st.assertTrue(a36,"color is not displayed");
		st.assertTrue(a46,"color is not Enabled");
		Thread.sleep(1000);

		WebElement q7=driver.findElement(s7);
		q7.click();
		boolean a37=q7.isDisplayed();
		boolean a47=q7.isEnabled();
		st.assertTrue(a37,"color is not displayed");
		st.assertTrue(a47,"color is not Enabled");
		Thread.sleep(1000);

		WebElement q8=driver.findElement(s8);
		q8.click();
		boolean a38=q8.isDisplayed();
		boolean a48=q8.isEnabled();
		st.assertTrue(a38,"color is not displayed");
		st.assertTrue(a48,"color is not Enabled");
		Thread.sleep(1000);

		st.assertAll();

		}
}
