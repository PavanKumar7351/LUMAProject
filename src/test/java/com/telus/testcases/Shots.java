package com.telus.testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.telus.basePackage.TestBase;

public class Shots extends TestBase {


	public String captureScreenshot(String screenshotName, String result) {
        String date = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());

        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);


        String destPath = "./screenshots/" + screenshotName + "/" + result + "_" + date + ".png";
        File destFile = new File(destPath);

        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destPath;
    }

}
