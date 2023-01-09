package com.telus.projectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.seleniumframework.logs.Log;
import com.telus.basePackage.TestBase;

public class DropDownPage extends TestBase {


	By women = By.xpath("//*[@id=\"ui-id-4\"]/span[2]");
	By Wtop = By.xpath("//*[@id=\"ui-id-9\"]");
	By Wjackets = By.xpath("//*[@id=\"ui-id-11\"]/span");
	By Whoodies = By.xpath("//*[@id=\"ui-id-12\"]/span");
	By Wtees = By.xpath("//*[@id=\"ui-id-13\"]/span");
	By Wbars = By.xpath("//*[@id=\"ui-id-14\"]/span");
	By Wbottoms = By.xpath("//*[@id=\"ui-id-10\"]/span[2]");
	By Wpants = By.xpath("//a[@id='ui-id-15']");
	By Wshorts = By.xpath("//*[@id=\"ui-id-16\"]/span");

	By Men = By.xpath("//*[@id=\"ui-id-5\"]/span[2]");
	By Mtop = By.xpath("//*[@id=\"ui-id-17\"]/span[2]");
	By Mjackets = By.xpath("//*[@id=\"ui-id-19\"]/span");
	By Mhoodies = By.xpath("//*[@id=\"ui-id-20\"]/span");
	By Mtees = By.xpath("//*[@id=\"ui-id-21\"]/span");
	By Mtanks = By.xpath("//*[@id=\"ui-id-22\"]/span");
	By Mbottoms = By.xpath("//*[@id=\"ui-id-18\"]/span[2]");
	By Mpants = By.xpath("//*[@id=\"ui-id-23\"]/span");
	By Mshorts = By.xpath("//*[@id=\"ui-id-24\"]/span");

	By Gear = By.xpath("//*[@id=\"ui-id-6\"]/span[2]");
	By Bags = By.xpath("//*[@id=\"ui-id-25\"]/span");
	By Fitness = By.xpath("//*[@id=\"ui-id-26\"]/span");
	By Watches = By.xpath("//*[@id=\"ui-id-27\"]/span");

	public void womenTops() throws InterruptedException  {

		org.testng.asserts.SoftAssert softassert=new org.testng.asserts.SoftAssert();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Actions action = new Actions(driver);
		WebElement w = driver.findElement(women);
		action.moveToElement(w).perform();
		boolean  a1=w.isDisplayed();
		boolean  a2=w.isEnabled();
		//boolean  a2=w.isEnabled();
		softassert.assertTrue(a1, "Women Drop is Not Enabled");
		softassert.assertTrue(a2, "Women Drop is Not Displayed");
		//softassert.assertTrue(a2, "Women Drop is Not Displayed");
		Log.info("Women Drop Down Displayed");
		Log.info("Women Drop Down Enabled");



		WebElement wt = driver.findElement(Wtop);
		action.moveToElement(wt).perform();
		boolean  a11=wt.isDisplayed();
		boolean  a22=wt.isEnabled();
		softassert.assertTrue(a11, "Women Top Drop is Not Enabled");
		softassert.assertTrue(a22, "Women Top Drop is Not Displayed");
		Log.info("Women Top Drop Down Displayed");
		Log.info("Women Top Drop Down Enabled");

		WebElement wj = driver.findElement(Wjackets);
		boolean isE=wj.isEnabled();
		boolean isD=wj.isDisplayed();
		action.moveToElement(wj).click().perform();
		softassert.assertTrue(isE, "Jackets Drop is Not Enabled");
		softassert.assertTrue(isD, "Jackets Top Drop is Not Displayed");
		Log.info("Jackets Top Drop Down Displayed");
		Log.info("Jackets Top Drop Down Enabled");
		Thread.sleep(1000);





		WebElement w1 = driver.findElement(women);
		action.moveToElement(w1).perform();
		WebElement wt1 = driver.findElement(Wtop);
		action.moveToElement(wt1).perform();
		WebElement wh = driver.findElement(Whoodies);
		boolean isE1=wh.isEnabled();
		boolean isD1=wh.isDisplayed();
		action.moveToElement(wh).click().perform();
		softassert.assertTrue(isE1, "Hoodies Drop is Not Enabled");
		softassert.assertTrue(isD1, "Hoodies Top Drop is Not Displayed");
		Log.info("Hoodies Top Drop Down Displayed");
		Log.info("Hoodies Top Drop Down Enabled");
		Thread.sleep(1000);


		WebElement w2 = driver.findElement(women);
		action.moveToElement(w2).perform();
		WebElement wt2 = driver.findElement(Wtop);
		action.moveToElement(wt2).perform();
		WebElement wte = driver.findElement(Wtees);
		boolean isE12=wte.isEnabled();
		boolean isD12=wte.isDisplayed();
		action.moveToElement(wte).click().perform();
		softassert.assertTrue(isE12, "Tees Drop is Not Enabled");
		softassert.assertTrue(isD12, "Tees Top Drop is Not Displayed");
		Log.info("Tees Top Drop Down Displayed");
		Log.info("Tees Top Drop Down Enabled");
		Thread.sleep(1000);


		WebElement w3 = driver.findElement(women);
		action.moveToElement(w3).perform();
		WebElement wt3 = driver.findElement(Wtop);
		action.moveToElement(wt3).perform();
		WebElement wb = driver.findElement(Wbars);
		boolean isE13=wb.isEnabled();
		boolean isD13=wb.isDisplayed();
		action.moveToElement(wb).click().perform();
		softassert.assertTrue(isE13, "Bars Drop is Not Enabled");
		softassert.assertTrue(isD13, "Bars Top Drop is Not Displayed");
		Log.info("Bars Top Drop Down Displayed");
		Log.info("Bars Top Drop Down Enabled");
		Thread.sleep(1000);


	}

	public void womemBottoms() throws InterruptedException  {
		org.testng.asserts.SoftAssert softassert=new org.testng.asserts.SoftAssert();
		Actions action = new Actions(driver);
		driver.navigate().refresh();
		WebElement w = driver.findElement(women);
		action.moveToElement(w).perform();
		boolean  a1=w.isDisplayed();
		boolean  a2=w.isEnabled();
		softassert.assertTrue(a1, "Women Drop is Not Enabled");
		softassert.assertTrue(a2, "Women Drop is Not Displayed");
		Log.info(" Women Drop Down Displayed");
		Log.info(" Women Drop Down Enabled");

		WebElement wb = driver.findElement(Wbottoms);
		action.moveToElement(wb).perform();
		boolean  a11=wb.isDisplayed();
		boolean  a22=wb.isEnabled();
		softassert.assertTrue(a11, "Women bottoms Drop is Not Enabled");
		softassert.assertTrue(a22, "Women bottoms Drop is Not Displayed");
		Log.info(" Women Bottom Drop Down Displayed");
		Log.info(" Women Bottom  Drop Down Enabled");

		WebElement wp = driver.findElement(Wpants);
		boolean isE14=wp.isEnabled();
		boolean isD14=wp.isDisplayed();
		action.moveToElement(wp).click().perform();
		softassert.assertTrue(isE14, "Pants Drop is Not Enabled");
		softassert.assertTrue(isD14, "Pants Top Drop is Not Displayed");
		Log.info("Pants Top Drop Down Displayed");
		Log.info("Pants Top Drop Down Enabled");
		Thread.sleep(1000);


		WebElement w1 = driver.findElement(women);
		action.moveToElement(w1).perform();
		WebElement wb1 = driver.findElement(Wbottoms);
		action.moveToElement(wb1).perform();
		WebElement ws = driver.findElement(Wshorts);
		boolean isE15=ws.isEnabled();
		boolean isD15=ws.isDisplayed();
		action.moveToElement(ws).click().perform();
		softassert.assertTrue(isE15, "Shorts Drop is Not Enabled");
		softassert.assertTrue(isD15, "Shorts Top Drop is Not Displayed");
		Log.info("Shorts Top Drop Down Displayed");
		Log.info("Shorts Top Drop Down Enabled");
		Thread.sleep(1000);
		softassert.assertAll();


	}

	public void menTops() throws InterruptedException  {
		org.testng.asserts.SoftAssert softassert=new org.testng.asserts.SoftAssert();
		Actions action = new Actions(driver);
		WebElement m = driver.findElement(Men);
		action.moveToElement(m).perform();
		boolean  a1=m.isDisplayed();
		boolean  a2=m.isEnabled();
		softassert.assertTrue(a1, "Men Drop is Not Enabled");
		softassert.assertTrue(a2, "Men Drop is Not Displayed");
		Log.info(" Men  Drop Down Displayed");
		Log.info(" Men  Drop Down Enabled");


		WebElement mt = driver.findElement(Mtop);
		action.moveToElement(mt).perform();
		boolean  a11=mt.isDisplayed();
		boolean  a21=mt.isEnabled();
		softassert.assertTrue(a11, "Men Top Drop is Not Enabled");
		softassert.assertTrue(a21, "Men Top Drop is Not Displayed");
		Log.info(" Men Top Drop Down Displayed");
		Log.info(" Men Top  Drop Down Enabled");

		WebElement mj = driver.findElement(Mjackets);
		boolean isE2=mj.isEnabled();
		boolean isD2=mj.isDisplayed();
		action.moveToElement(mj).click().perform();
		softassert.assertTrue(isE2, "Jackets Drop is Not Enabled");
		softassert.assertTrue(isD2, "Jackets Top Drop is Not Displayed");
		Log.info("Jackets Top Drop Down Displayed");
		Log.info("Jackets Top Drop Down Enabled");
		Thread.sleep(1000);


		WebElement m1 = driver.findElement(Men);
		action.moveToElement(m1).perform();
		WebElement mt1 = driver.findElement(Mtop);
		action.moveToElement(mt1).perform();
		WebElement mh = driver.findElement(Mhoodies);
		boolean isE21=mh.isEnabled();
		boolean isD21=mh.isDisplayed();
		action.moveToElement(mh).click().perform();
		softassert.assertTrue(isE21, "Hoodies Drop is Not Enabled");
		softassert.assertTrue(isD21, "Hoodies Top Drop is Not Displayed");
		Log.info("Hoodies Top Drop Down Displayed");
		Log.info("Hoodies Top Drop Down Enabled");
		Thread.sleep(1000);


		WebElement m2 = driver.findElement(Men);
		action.moveToElement(m2).perform();
		WebElement mt2 = driver.findElement(Mtop);
		action.moveToElement(mt2).perform();
		WebElement mte = driver.findElement(Mtees);
		boolean isE22=mte.isEnabled();
		boolean isD22=mte.isDisplayed();
		action.moveToElement(mte).click().perform();
		softassert.assertTrue(isE22, "Tees Drop is Not Enabled");
		softassert.assertTrue(isD22, "Tees Top Drop is Not Displayed");
		Log.info("Tees Top Drop Down Displayed");
		Log.info("Tees Top Drop Down Enabled");
		Thread.sleep(1000);


		WebElement m3 = driver.findElement(Men);
		action.moveToElement(m3).perform();
		WebElement mt3 = driver.findElement(Mtop);
		action.moveToElement(mt3).perform();
		WebElement mta = driver.findElement(Mtanks);
		boolean isE23=mta.isEnabled();
		boolean isD23=mta.isDisplayed();
		action.moveToElement(mta).click().perform();
		softassert.assertTrue(isE23, "Tanks Drop is Not Enabled");
		softassert.assertTrue(isD23, "Tanks Top Drop is Not Displayed");
		Log.info("Tanks Top Drop Down Displayed");
		Log.info("Tanks Top Drop Down Enabled");
		Thread.sleep(1000);


	}

	public void menBottoms() throws InterruptedException {
		org.testng.asserts.SoftAssert softassert=new org.testng.asserts.SoftAssert();
		Actions action = new Actions(driver);
		WebElement m = driver.findElement(Men);
		action.moveToElement(m).perform();
		boolean  a1=m.isDisplayed();
		boolean  a2=m.isEnabled();
		softassert.assertTrue(a1, "Man Drop is Not Enabled");
		softassert.assertTrue(a2, "Man Drop is Not Displayed");
		Log.info(" Men  Drop Down Displayed");
		Log.info(" Men  Drop Down Enabled");


		WebElement mb = driver.findElement(Mbottoms);
		action.moveToElement(mb).perform();
		boolean  a11=mb.isDisplayed();
		boolean  a22=mb.isEnabled();
		softassert.assertTrue(a11, "Bottoms Drop is Not Enabled");
		softassert.assertTrue(a22, "Bottoms Drop is Not Displayed");
		Log.info(" Men Bottom Drop Down Displayed");
		Log.info(" Men Bottom Drop Down Enabled");

		WebElement mp = driver.findElement(Mpants);
		boolean isE14=mp.isEnabled();
		boolean isD14=mp.isDisplayed();
		action.moveToElement(mp).click().perform();
		softassert.assertTrue(isE14, "Pants Drop is Not Enabled");
		softassert.assertTrue(isD14, "Pants Top Drop is Not Displayed");
		Log.info("Pants Top Drop Down Displayed");
		Log.info("Pants Top Drop Down Enabled");
		Thread.sleep(1000);


		WebElement m1 = driver.findElement(Men);
		action.moveToElement(m1).perform();
		WebElement mb1 = driver.findElement(Mbottoms);
		action.moveToElement(mb1).perform();
		WebElement ms = driver.findElement(Mshorts);
		boolean isE15=ms.isEnabled();
		boolean isD15=ms.isDisplayed();
		action.moveToElement(ms).click().perform();
		softassert.assertTrue(isE15, "Shorts Drop is Not Enabled");
		softassert.assertTrue(isD15, "Shorts Top Drop is Not Displayed");
		Log.info("Shorts Top Drop Down Displayed");
		Log.info("Shorts Top Drop Down Enabled");
		Thread.sleep(1000);
		softassert.assertAll();


	}

	public void gears() throws InterruptedException  {
		org.testng.asserts.SoftAssert softassert=new org.testng.asserts.SoftAssert();
		Actions action = new Actions(driver);
		WebElement g = driver.findElement(Gear);
		action.moveToElement(g).perform();
		boolean  a1=g.isDisplayed();
		boolean  a2=g.isEnabled();
		softassert.assertTrue(a1, "Gear Drop is Not Enabled");
		softassert.assertTrue(a2, "Gear Drop is Not Displayed");
		Log.info("Gear Drop down  Displayed");
		Log.info("Gear Drop down Enabled");

		WebElement b = driver.findElement(Bags);
		boolean isE15=b.isEnabled();
		boolean isD15=b.isDisplayed();
		action.moveToElement(b).click().perform();
		softassert.assertTrue(isE15, "Bags Drop is Not Enabled");
		softassert.assertTrue(isD15, "Bags Top Drop is Not Displayed");
		Log.info("Bags Top Drop Down Displayed");
		Log.info("Bags Top Drop Down Enabled");
		Thread.sleep(1000);

		WebElement g1 = driver.findElement(Gear);
		action.moveToElement(g1).perform();
		WebElement f = driver.findElement(Fitness);
		boolean isE=f.isEnabled();
		boolean isD=f.isDisplayed();
		action.moveToElement(f).click().perform();
		softassert.assertTrue(isE, "Fitness Drop is Not Enabled");
		softassert.assertTrue(isD, "Fitness Top Drop is Not Displayed");
		Log.info("Fitness Top Drop Down Displayed");
		Log.info("Fitness Top Drop Down Enabled");
		Thread.sleep(1000);


		WebElement g2 = driver.findElement(Gear);
		action.moveToElement(g2).perform();
		WebElement w = driver.findElement(Watches);
		boolean isE5=w.isEnabled();
		boolean isD5=w.isDisplayed();
		action.moveToElement(w).click().perform();
		softassert.assertTrue(isE5, "Watches Drop is Not Enabled");
		softassert.assertTrue(isD5, "Watches Top Drop is Not Displayed");
		Log.info("Watches Top Drop Down Displayed");
		Log.info("Watches Top Drop Down Enabled");
		Thread.sleep(1000);
		softassert.assertAll();


	}

}
