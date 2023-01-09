package com.telus.testcases;

import java.io.IOException;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.telus.utilities.ScreenShot;



public class Listeners extends ScreenShot implements ITestListener,ISuiteListener{


	@Override
	public void onTestStart(ITestResult result) {



//		screenshot s=new screenshot();
//		try {
//			s.captureScreenShot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ScreenShot s=new ScreenShot();
		try {
			s.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Test Case started is :"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//captureScreenshot();
//		screenshot s=new screenshot();
//		try {
//			s.captureScreenShot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ScreenShot s=new ScreenShot();
		try {
			s.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test Case Pass is :"+result.getName());

	}
	@Override
	public void onTestFailure(ITestResult result) {
		//captureScreenshot();
//		screenshot s=new screenshot();
//		try {
//			s.captureScreenShot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ScreenShot s=new ScreenShot();
		try {
			s.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		System.out.println("Test Case Faild is :"+result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		//captureScreenshot();
//
//		screenshot s=new screenshot();
//		try {
//			s.captureScreenShot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ScreenShot s=new ScreenShot();
		try {
			s.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//captureScreenshot();
//		screenshot s=new screenshot();
//		try {
//			s.captureScreenShot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ScreenShot s=new ScreenShot();
		try {
			s.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test Case Percentage is :"+result.getName());
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		//captureScreenshot();
//		screenshot s=new screenshot();
//		try {
//			s.captureScreenShot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ScreenShot s=new ScreenShot();
		try {
			s.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test Case Time Out is :"+result.getName());
	}
	@Override
	public void onStart(ITestContext context) {
		//captureScreenshot();
//		screenshot s=new screenshot();
//		try {
//			s.captureScreenShot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ScreenShot s=new ScreenShot();
		try {
			s.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Execution Started");
	}
	@Override
	public void onFinish(ITestContext context) {
	//	captureScreenshot();
//		screenshot s=new screenshot();
//		try {
//			s.captureScreenShot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ScreenShot s=new ScreenShot();
		try {
			s.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		System.out.println("Execustion Completed");
	}


}
