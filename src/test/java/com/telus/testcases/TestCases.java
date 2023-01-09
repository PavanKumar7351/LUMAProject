package com.telus.testcases;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.telus.basePackage.BaseTest;
import com.telus.utilities.ReadXLSData;



public class TestCases extends BaseTest {




    @Test(dataProviderClass = ReadXLSData.class,dataProvider = "testdata" )
    public static void Sheet1(String firstname,String lastname,String password,String confirmpassword) throws Exception  {

        Random random = new Random();
        int y = random.nextInt(1000);
        String email="pavan"+y+"@gamil.com";
        Thread.sleep(1000);
        driver.manage().window().maximize();


        driver.findElement(By.xpath(loc.getProperty("createAccount"))).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath(loc.getProperty("CreateAccountbutton"))).click();

        Thread.sleep(2000);
        driver.findElement(By.id(loc.getProperty("firstName"))).sendKeys(firstname);
        Thread.sleep(2000);
        driver.findElement(By.id(loc.getProperty("lastName"))).sendKeys(lastname);
        Thread.sleep(2000);

        driver.findElement(By.id(loc.getProperty("email"))).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.id(loc.getProperty("password"))).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.id(loc.getProperty("confirm_password"))).sendKeys(confirmpassword);
        Thread.sleep(2000);
        driver.findElement(By.xpath(loc.getProperty("SignUp"))).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
