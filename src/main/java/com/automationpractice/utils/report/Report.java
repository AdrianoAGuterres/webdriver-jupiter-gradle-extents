package com.automationpractice.utils.report;

import com.automationpractice.utils.config.ConfigurationTool;
import com.automationpractice.utils.selenium.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Report{
    private static boolean ENABLE_SUITE_REPORT = false;
    private static ExtentSparkReporter REPORTER = null;
    private static ExtentReports EXTENTS = null;
    private static ExtentTest TEST = null;
    
    public static void initializeReport(String title, String description, boolean isSuite){
        
        if((isSuite & EXTENTS == null) || (!isSuite & EXTENTS == null)){
            ENABLE_SUITE_REPORT = isSuite;
            
            String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy__HH-mm-ss"));
            String name = title.toLowerCase().replace(" ", "-");
            
            String path = ConfigurationTool.getProperty("REPORT_PATH") + date + "__" + name;
            
            REPORTER = new ExtentSparkReporter(path);
            
            REPORTER.config().setDocumentTitle(title);
            REPORTER.config().setReportName(description);
            
            REPORTER.config().setTheme(Theme.DARK);
            REPORTER.config().setEncoding("UTF-8");
            REPORTER.config().setTimeStampFormat("dd/MM/yyyy HH:mm:ss");
            
            EXTENTS = new ExtentReports();
            EXTENTS.attachReporter(REPORTER);
            EXTENTS.setSystemInfo("Browser", ConfigurationTool.getProperty("DEFAULT_BROWSER"));
            EXTENTS.setSystemInfo("OS", System.getProperty("os.name"));
            EXTENTS.setSystemInfo("OS Architecture", System.getProperty("os.arch"));
            EXTENTS.setSystemInfo("Java Version", System.getProperty("java.version"));
        }
    }
    
    public static void endReport(){
        if(!ENABLE_SUITE_REPORT){
            if(EXTENTS != null){
                EXTENTS.flush();
            }
            EXTENTS = null;
            REPORTER = null;
        }
        TEST = null;
    }
    
    public static void endSuiteReport(){
        if(EXTENTS != null){
            EXTENTS.flush();
        }
        EXTENTS = null;
        REPORTER = null;
        TEST = null;
    }
    
    public static void log(Status status, String details, boolean withScreenshot){
        if(withScreenshot){
            Media media = MediaEntityBuilder.createScreenCaptureFromBase64String(Driver.getScreenshotBase64()).build();
            TEST.log(status, details, media);
        }else{
            TEST.log(status, details);
        }
    }
    
    public static void appendScenarioTest(String testName){
        TEST = EXTENTS.createTest(testName).assignCategory(testName.toLowerCase().replace(" ", "-"));
    }
    
    public static void addTag(String tag){
        TEST.assignCategory(tag);
    }
}
