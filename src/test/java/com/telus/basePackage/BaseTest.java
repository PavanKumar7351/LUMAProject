package com.telus.basePackage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static Properties loc=new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	@BeforeTest
	public void launchApplication() throws IOException {

		System.out.println("The Path is:"+System.getProperty("user.dir"));
		if(driver==null) {
			FileReader fr=new FileReader(System.getProperty("user.dir")+".//src/test/java/com/telus/configFiles/config.properties");
			FileReader fr1=new FileReader(System.getProperty("user.dir")+".//src/test/java/com/telus/configFiles/locaters.properties");

			prop.load(fr);
			loc.load(fr1);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(prop.getProperty("testURL"));
		}

		else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(prop.getProperty("testURL"));
		}
	}
	@AfterTest
	public void closeApplication() {
		driver.quit();
	}


}
