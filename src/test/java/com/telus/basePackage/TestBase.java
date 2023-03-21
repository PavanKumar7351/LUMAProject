package com.telus.basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase  {
	public static WebDriver driver;
	public static Properties pro;



	@BeforeSuite
	public static void launchApplication() {
		try {
			pro=new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+".//src/test/java/com/telus/configFiles/config.properties");
			pro.load(ip);

		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}

		String browserName=pro.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(TestUtilites.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtilites.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(pro.getProperty("testURL"));

	}

	@AfterSuite
	public static void closeApplication() {
		driver.quit();
	}

}
