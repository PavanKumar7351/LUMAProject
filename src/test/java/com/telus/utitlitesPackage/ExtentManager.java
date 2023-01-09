package com.telus.utitlitesPackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.telus.testcases.Listeners;

public class ExtentManager extends Listeners {

	private static ExtentReports extent;

    public static ExtentReports createInstance(String fileName) {

        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);

        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle(fileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(fileName);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Automation Architect", "Puchha Pavan Kumar Reddy");
        extent.setSystemInfo("Organization", "LUMA Application");


        return extent;
    }

}
