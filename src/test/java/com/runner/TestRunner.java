package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.jvmreport.JVMReportClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false, features="src\\test\\resources\\Features\\FbLogin.feature",glue="com.stepdefin",
 plugin="json:target\\Facebook.json")
public class TestRunner {
	
	@AfterClass 
	public static void afterExecution() {
	//
		//
		JVMReportClass.generateJVMReport(System.getProperty("user.dir")+"\\target\\Facebook.json");
	}
	

}
