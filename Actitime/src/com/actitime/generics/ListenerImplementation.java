package com.actitime.generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends BaseClass implements ITestListener {
	public void onTestStart(ITestResult result) {
	  }

	 public void onTestSuccess(ITestResult result) {
	 
	 }

	 public void onTestFailure(ITestResult result) {
	  String name = result.getName();
	  TakesScreenshot t=(TakesScreenshot) driver;
	  File src = t.getScreenshotAs(OutputType.FILE);
	  File dest=new File("./screenshot/"+name+".png");
	  try {
	   FileUtils.copyFile(src, dest);
	  } catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }  
	 }
	 public void onTestSkipped(ITestResult result) {
	 }
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	  }

	 public void onStart(ITestContext context) {
	  }

	 public void onFinish(ITestContext context) {
	 
	 }
	}