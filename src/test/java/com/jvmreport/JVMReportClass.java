package com.jvmreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReportClass {
	public static void generateJVMReport(String jsonFile) {
		
		File reportLoc= new File(System.getProperty("user.dir")+"\\target");
		
		Configuration con=new Configuration(reportLoc, "AirIndia");
		con.addClassifications("Platform", "Windows 11");
		con.addClassifications("Sprint", "3456");
		con.addClassifications("Author", "Nani");
		
		List<String> l=new ArrayList<String>();
		l.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(l, con);

		builder.generateReports();
		
	}

}
