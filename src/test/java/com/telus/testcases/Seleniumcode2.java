package com.telus.testcases;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.telus.basePackage.BaseTest;
import com.telus.logs.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumcode2 extends BaseTest {
	public static Logger log=LogManager.getLogger(Seleniumcode2.class.getName());
	public static String MenProducts;
	public static String WomenProducts;

	@Test

	public static void Shopping() throws InterruptedException, ParseException {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		SoftAssert st = new SoftAssert();
		driver.get("https:magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement logo = driver.findElement(By.xpath("//*[@class='logo']"));
		if (logo.isDisplayed()) {
			log.info("Logo is Displayed");
		} else {
			log.info("Logo is Not Displayed");
		}
		log.info("hai");
		Actions action = new Actions(driver);

		 //All drop downs
		 WebElement a=driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));
		 action.moveToElement(a).perform();
		 if(a.isEnabled()){
		 log.info("Women drop down is Enabled");
		 if(a.isDisplayed()){

		 log.info("Women drop down is Displayed");
		 }
		 else{
		 log.info("Women drop down is not Displayed");
		 }
		 }
		 else{
		 log.info("Women drop down is not Enabled");
		 }
		 WebElement b=driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));
		 action.moveToElement(b).perform();
		 if(b.isEnabled()){
		 log.info("Tops drop down is Enabled");
		 if(b.isDisplayed()){

		 log.info("Tops drop down is Displayed");
		 }
		 else{
		 log.info("Tops drop down is not Displayed");
		 }
		 }
		 else{
		 log.info("Tops drop down is not Enabled");
		 }

		 Thread.sleep(1000);
		// driver.navigate().refresh();
		// Thread.sleep(2000);
		// WebDriverWait wait = new WebDriverWait(driver,c);
		// WebElement element = wait.until(
		// ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
		// gmail.findElement(By.id("Passwd")).sendKeys("xyz");

		 WebElement c=driver.findElement(By.xpath("//*[@id='ui-id-11']"));
		 boolean qw=c.isDisplayed();
		 boolean we=c.isEnabled();
		 action.moveToElement(c).click().perform();

		 st.assertTrue(qw, "Jackets drop down is Displayed");
		 st.assertTrue(we,"Jackets drop down is Enabled");
		 st.assertAll();
		 Log.info("hai");

		// if(c.isEnabled()){
		// log.info("Jackets drop down is Enabled");
		// if(c.isDisplayed()){
		//
		// log.info("Jackets drop down is Displayed");
		// }
		// else{
		// log.info("Jackets drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Jackets drop down is not Enabled");
		// }
		 Thread.sleep(1000);
		 WebElement a1=driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));
		 action.moveToElement(a1).perform();
		 WebElement b1=driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));
		 action.moveToElement(b1).perform();
		 WebElement c1=driver.findElement(By.xpath("//*[@id=\"ui-id-12\"]/span"));
		 action.moveToElement(c1).click().perform();
		// if(c1.isEnabled()){
		// log.info("Hoodies & Sweatshirts drop down is Enabled");
		// if(c1.isDisplayed()){
		//
		// log.info("Hoodies & Sweatshirts drop down is Displayed");
		// }
		// else{
		// log.info("Hoodies & Sweatshirts drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Hoodies & Sweatshirts drop down is not Enabled");
		// }
		 Thread.sleep(1000);
		 WebElement a2=driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));
		 action.moveToElement(a2).perform();
		 WebElement b2=driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));
		 action.moveToElement(b2).perform();
		 WebElement c2=driver.findElement(By.xpath("//*[@id=\"ui-id-13\"]/span"));
		 action.moveToElement(c2).click().perform();
		// if(c2.isEnabled()){
		// log.info("Tees drop down is Enabled");
		// if(c2.isDisplayed()){
		//
		// log.info("Tees drop down is Displayed");
		// }
		// else{
		// log.info("Tees drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Tees drop down is not Enabled");
		// }
		 Thread.sleep(1000);
		 WebElement a3=driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));
		 action.moveToElement(a3).perform();
		 WebElement b3=driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));
		 action.moveToElement(b3).perform();
		 WebElement c3=driver.findElement(By.xpath("//*[@id=\"ui-id-14\"]/span"));
		 action.moveToElement(c3).click().perform();
		// if(c3.isEnabled()){
		// log.info("Bras & Tanks drop down is Enabled");
		// if(c3.isDisplayed()){
		//
		// log.info("Bras & Tanks drop down is Displayed");
		// }
		// else{
		// log.info("Bras & Tanks drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Bras & Tanks drop down is not Enabled");
		// }
		 Thread.sleep(1000);
		 WebElement a4=driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));
		 action.moveToElement(a4).perform();
		 WebElement b4=driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]/span[2]"));
		 action.moveToElement(b4).perform();
		 if(b4.isEnabled()){
		 log.info("Bottoms drop down is Enabled");
		 if(b4.isDisplayed()){

		 log.info("Bottoms drop down is Displayed");
		 }
		 else{
		 log.info("Bottoms drop down is not Displayed");
		 }
		 }
		 else{
		 log.info("Bottoms drop down is not Enabled");
		 }

		 WebElement c4=driver.findElement(By.xpath("//a[@id='ui-id-15']"));
		 action.moveToElement(c4).click().perform();
		// if(c4.isEnabled()){
		// log.info("Pants drop down is Enabled");
		// if(c4.isDisplayed()){
		//
		// log.info("Pants drop down is Displayed");
		// }
		// else{
		// log.info("Pants drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Pants drop down is not Enabled");
		// }
		 Thread.sleep(1000);
		 WebElement a5=driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));
		 action.moveToElement(a5).perform();
		 WebElement b5=driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]/span[2]"));
		 action.moveToElement(b5).perform();
		 WebElement c5=driver.findElement(By.xpath("//*[@id=\"ui-id-16\"]/span"));
		 action.moveToElement(c5).click().perform();
		// if(c5.isEnabled()){
		// log.info("Shorts drop down is Enabled");
		// if(c5.isDisplayed()){
		//
		// log.info("Shorts drop down is Displayed");
		// }
		// else{
		// log.info("Shorts drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Shorts drop down is not Enabled");
		// }
		 Thread.sleep(1000);



		 WebElement x1=driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"));
		 action.moveToElement(x1).perform();
		 if(x1.isEnabled()){
		 log.info("Men drop down is Enabled");
		 if(x1.isDisplayed()){

		 log.info("Men drop down is Displayed");
		 }
		 else{
		 log.info("Men drop down is not Displayed");
		 }
		 }
		 else{
		 log.info("Men drop down is not Enabled");
		 }
		 WebElement y1=driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]/span[2]"));
		 action.moveToElement(y1).perform();
		 if(y1.isEnabled()){
		 log.info("Tops drop down is Enabled");
		 if(y1.isDisplayed()){

		 log.info("Tops drop down is Displayed");
		 }
		 else{
		 log.info("Tops drop down is not Displayed");
		 }
		 }
		 else{
		 log.info("Tops drop down is not Enabled");
		 }
		 WebElement z1=driver.findElement(By.xpath("//*[@id=\"ui-id-19\"]/span"));
		 action.moveToElement(z1).click().perform();
		// if(z1.isEnabled()){
		// log.info("Jackets drop down is Enabled");
		// if(z1.isDisplayed()){
		//
		// log.info("Jackets drop down is Displayed");
		// }
		// else{
		// log.info("Jackets drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Jackets drop down is not Enabled");
		// }
		 Thread.sleep(1000);

		 WebElement x2=driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"));
		 action.moveToElement(x2).perform();
		 WebElement y2=driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]/span[2]"));
		 action.moveToElement(y2).perform();
		 WebElement z2=driver.findElement(By.xpath("//*[@id=\"ui-id-20\"]/span"));
		 action.moveToElement(z2).click().perform();
		// if(z2.isEnabled()){
		// log.info("Hoodies & Sweatshirts drop down is Enabled");
		// if(z2.isDisplayed()){
		//
		// log.info("Hoodies & Sweatshirts drop down is Displayed");
		// }
		// else{
		// log.info("Hoodies & Sweatshirts drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Hoodies & Sweatshirts drop down is not Enabled");
		// }
		 Thread.sleep(1000);

		 WebElement x3=driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"));
		 action.moveToElement(x3).perform();
		 WebElement y3=driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]/span[2]"));
		 action.moveToElement(y3).perform();
		 WebElement z3=driver.findElement(By.xpath("//*[@id=\"ui-id-21\"]/span"));
		 action.moveToElement(z3).click().perform();
		// if(z3.isEnabled()){
		// log.info("Tees drop down is Enabled");
		// if(z3.isDisplayed()){
		//
		// log.info("Tees drop down is Displayed");
		// }
		// else{
		// log.info("Tees drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Tees drop down is not Enabled");
		// }
		 Thread.sleep(1000);

		 WebElement x4=driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"));
		 action.moveToElement(x4).perform();
		 WebElement y4=driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]/span[2]"));
		 action.moveToElement(y4).perform();
		 WebElement z4=driver.findElement(By.xpath("//*[@id=\"ui-id-22\"]/span"));
		 action.moveToElement(z4).click().perform();
		// if(z4.isEnabled()){
		// log.info("Tanks drop down is Enabled");
		// if(z4.isDisplayed()){
		//
		// log.info("Tanks drop down is Displayed");
		// }
		// else{
		// log.info("Tanks drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Tanks drop down is not Enabled");
		// }
		 Thread.sleep(1000);

		 WebElement x5=driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"));
		 action.moveToElement(x5).perform();
		 WebElement y5=driver.findElement(By.xpath("//*[@id=\"ui-id-18\"]/span[2]"));
		 action.moveToElement(y5).perform();
		 if(y5.isEnabled()){
		 log.info("Bottoms drop down is Enabled");
		 if(y5.isDisplayed()){

		 log.info("Bottoms drop down is Displayed");
		 }
		 else{
		 log.info("Bottoms drop down is not Displayed");
		 }
		 }
		 else{
		 log.info("Bottoms drop down is not Enabled");
		 }
		 WebElement z5=driver.findElement(By.xpath("//*[@id=\"ui-id-23\"]/span"));
		 action.moveToElement(z5).click().perform();
		// if(z5.isEnabled()){
		// log.info("Pants drop down is Enabled");
		// if(z5.isDisplayed()){
		//
		// log.info("Pants drop down is Displayed");
		// }
		// else{
		// log.info("Pants Bottoms drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Pants Bottoms drop down is not Enabled");
		// }
		 Thread.sleep(1000);


		 WebElement x6=driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"));
		 action.moveToElement(x6).perform();
		 WebElement y6=driver.findElement(By.xpath("//*[@id=\"ui-id-18\"]/span[2]"));
		 action.moveToElement(y6).perform();
		 WebElement z6=driver.findElement(By.xpath("//*[@id=\"ui-id-24\"]/span"));
		 action.moveToElement(z6).click().perform();
		// if(z6.isEnabled()){
		// log.info("Shorts drop down is Enabled");
		// if(z6.isDisplayed()){
		//
		// log.info("Shorts drop down is Displayed");
		// }
		// else{
		// log.info("Shorts Bottoms drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Shorts Bottoms drop down is not Enabled");
		// }
		 Thread.sleep(1000);


		 WebElement p1=driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]/span[2]"));
		 action.moveToElement(p1).perform();
		 if(p1.isEnabled()){
		 log.info("Gear drop down is Enabled");
		 if(p1.isDisplayed()){

		 log.info("Gear drop down is Displayed");
		 }
		 else{
		 log.info("Gear Bottoms drop down is not Displayed");
		 }
		 }
		 else{
		 log.info("Gear Bottoms drop down is not Enabled");
		 }

		 WebElement r1=driver.findElement(By.xpath("//*[@id=\"ui-id-25\"]/span"));
		 action.moveToElement(r1).click().perform();
		// if(r1.isEnabled()){
		// log.info("Bags drop down is Enabled");
		// if(r1.isDisplayed()){
		//
		// log.info("Bags drop down is Displayed");
		// }
		// else{
		// log.info("Bags Bottoms drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Bags Bottoms drop down is not Enabled");
		// }
		 Thread.sleep(1000);


		 WebElement
		 ab=driver.findElement(By.xpath("//a[@id='ui-id-6']span[contains(text(),'Gear')]"));
		 action.moveToElement(ab).perform();
		 WebElement ss=driver.findElement(By.xpath("//span[normalize-space()='FitnessEquipment']"));
		 action.moveToElement(ss).click().perform();
		// if(ss.isEnabled()){
		// log.info("Fitness Equipment drop down is Enabled");
		// if(ss.isDisplayed()){
		//
		// log.info("Fitness Equipment drop down is Displayed");
		// }
		// else{
		// log.info("Fitness Equipment Bottoms drop down is not Displayed");
		// }
		// }
		// else{
		// log.info("Fitness Equipment Bottoms drop down is not Enabled");
		// }
		 Thread.sleep(1000);

				WebElement q1 = driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]/span[2]"));
				action.moveToElement(q1).perform();

				WebElement q2 = driver.findElement(By.xpath("//*[@id=\"ui-id-27\"]/span"));
				action.moveToElement(q2).click().perform();
		 if(q2.isEnabled()){
		 log.info("Watches Equipment drop down is Enabled");
		 if(q2.isDisplayed()){

		 log.info("Watches Equipment drop down is Displayed");
		 }
		 else{
		 log.info("Watches Equipment Bottoms drop down is not Displayed");
		 }
		 }
		 else{
		 log.info("Watches Equipment Bottoms drop down is not Enabled");
		 }

		/// **********************************************************************
		////// DropDownComplete
		 Thread.sleep(1000);
		 WebElement men =
		 driver.findElement(By.xpath("*//[@id=\"ui-id-5\"]/span[2]"));
		 action.moveToElement(men).perform();
		 WebElement top =
		 driver.findElement(By.xpath("*//[@id=\"ui-id-17\"]/span[2]"));
		 action.moveToElement(top).click().perform();
		 WebElement
		 g=driver.findElement(By.xpath("//div[normalize-space()='Category']"));
		 action.moveToElement(g).click().perform();
		 WebElement j=driver.findElement(By.xpath("//a[contains(text(),'Jackets')]"));
		 action.moveToElement(j).click().perform();
		 Thread.sleep(2000);
		 WebElement
		 text=driver.findElement(By.xpath("//*[@id=\"layered-filter-block\"]/div[2]/div[1]/ol/li/span[2]"));
		 String t=text.getText();
		 log.info(t);
		 if(t.equals("Jackets")) {
		 log.info("Product link is redirecting to correct product ");
		 }
		 else {
		 log.info("Product link is not redirecting to correct product ");
		 }
		 driver.findElement(By.xpath("*//[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")).click();
		 Thread.sleep(2000);
		 WebElement
		 pn=driver.findElement(By.xpath("*//[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span"));
		 String productN=pn.getText();
		 if(pn.isDisplayed()){
		 log.info("Product name is displayed: "+productN);
		 if(productN.equals("Proteus Fitness Jackshirt")){
		 log.info("Product Name is displayed correctly: "+productN);
		 }
		 else {
		 log.info("Product Name is displayed correctly");
		 }
		 }
		 else{
		 log.info("Product is not displayed ");
		 }
		 WebElement
		 pr=driver.findElement(By.xpath("*//[@id=\"product-price-430\"]/span"));
		 String price=pr.getText();
		 NumberFormat format2 = NumberFormat.getCurrencyInstance();
		 Number number2 = format2.parse(price);
		 String paaa2=(number2.toString());
		 float totalAmount = Float.parseFloat(paaa2);
		 log.info("Product Price :"+totalAmount);
		 if(pr.isDisplayed()){
		 log.info("Product price is Displayed :"+price);
		 if(totalAmount==45.00){
		 log.info("Product price is Correct: "+totalAmount);
		 }
		 else
		 {
		 log.info("Product price is not Correct: "+totalAmount);
		 }
		 }
		 else {
		 log.info("Product price is not Displayed :"+price);
		 }
		 WebElement des=driver.findElement(By.xpath("*//[@id=\"description\"]"));
		 String dec=des.getText();
		 if(des.isDisplayed()){
		 log.info("Description is Displayed: "+dec);
		 }
		 else {
		 log.info("Description is not Displayed ");
		 }
		 WebElement i = driver.findElement(By.xpath("//img[@alt='Proteus Fitness Jackshirt']"));

		 if(i.isDisplayed()){
		 log.info("Product Image is Displayed");
		 }
		 else {
		 log.info("Product Image is not Displayed");
		 }
		 driver.findElement(By.xpath("*//[@id=\"option-label-size-143-item-166\"]")).click();
		 driver.findElement(By.id("//option-label-size-143-item-166")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("//option-label-size-143-item-167")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("//option-label-size-143-item-168")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("//option-label-size-143-item-169")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("//option-label-size-143-item-170")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("//option-label-color-93-item-49")).click();
		 Thread.sleep(2000);

		 driver.findElement(By.id("//option-label-color-93-item-50")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("//option-label-color-93-item-56")).click();




		// Mens Product Lists////




		 ////*********dummy*********/
		 Thread.sleep(1000);
		 WebElement men1 =driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"));
		 action.moveToElement(men1).perform();
		 WebElement top1 =
		 driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]/span[2]"));
		 action.moveToElement(top1).click().perform();
		 ////**********dummy********

		 String displayedcont =
		 driver.findElement(By.xpath("//div[@class='page-wrapper']div[2]p[1]span[3]"))
		 .getText();

		 WebElement next =
		 driver.findElement(By.xpath("//div[4]div[2]ul[1]li[5]a[1]"));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,5000)");
		 List<WebElement> products =
		 driver.findElements(By.xpath("//*[@class='product-item-link']"));
		 List<String> productNames = new ArrayList<>();
		 for (WebElement name : products) {
		 Thread.sleep(500);
		 productNames.add(name.getText());
		 log.info(name.getText());
		 }
		 log.info("***************************************");
		 while (true) {
		 Thread.sleep(2000);
		 next.click();
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,5000)");
		 Thread.sleep(2000);
		 products = driver.findElements(By.xpath("//*[@class='product-item-link']"));
		 for (WebElement name : products) {
		 Thread.sleep(500);
		 productNames.add(name.getText());
		 log.info("Products :" + name.getText());
		 MenProducts=name.getText();

		 }

		 log.info("***************************************");
		 try {
		 next = driver.findElement(By.xpath("//div[4]div[2]ul[1]li[5]a[1]"));
		 } catch (Exception e) {
		 log.info("No More Products");
		 break;

		 }
		 }
		 log.info("***************************************");
		 log.info("My Number of Products are :" + productNames.size());
		 log.info("Total display Count: " + displayedcont);






		// Womens Product Lists////






				////******* dummy
				Thread.sleep(1000);
				WebElement women = driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));
				action.moveToElement(women).perform();
				WebElement Womentop = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]/span[2]"));
				action.moveToElement(Womentop).click().perform();
				 ///****dummy
				String displayedcont1 = driver.findElement(By.xpath("//div[@class='page-wrapper']div[2]p[1]span[3]"))
						.getText();
				WebElement next1 = driver.findElement(By.xpath("//div[4]div[2]ul[1]li[6]a[1]"));
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,5000)");
				List<WebElement> products1 = driver.findElements(By.xpath("//*[@class='product-item-link']"));
				List<String> productNames1 = new ArrayList<>();
				for (WebElement name : products1) {
					Thread.sleep(500);
					productNames1.add(name.getText());

					log.info("Products :" + name.getText());
					WomenProducts = name.getText();

				}
				log.info("***************************************");
				while (true) {
					Thread.sleep(1000);
					next1.click();
					Thread.sleep(1000);
					js.executeScript("window.scrollBy(0,5000)");
					Thread.sleep(1000);
					products1 = driver.findElements(By.xpath("//*[@class='product-item-link']"));
					for (WebElement name : products1) {
						Thread.sleep(500);
						productNames1.add(name.getText());
						log.info("Products :" + name.getText());
						WomenProducts = name.getText();


					}
					log.info("***************************************");
					try {
						next1 = driver.findElement(By.xpath("//div[4]div[2]ul[1]li[6]a[1]"));
					} catch (Exception e) {
						log.info("No More Products");
						break;
					}
				}
				log.info("***************************************");
				log.info("My Number of Products are :" + productNames1.size());
				log.info("Total display Count: " + displayedcont1);


		WebElement ser=driver.findElement(By.xpath("//*[@id=\"search\"]"));
		ser.sendKeys("Autumn Pullie");
		WebElement bt=driver.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button"));
		bt.click();
		WebElement pn1=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/strong/a"));
		String p=pn1.getText();
		Assert.assertEquals(p,"Autumn Pullie" );





		driver.quit();

	}
}
