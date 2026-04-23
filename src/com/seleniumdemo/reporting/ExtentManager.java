package com.seleniumdemo.reporting;
import com.seleniumdemo.reporting.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    private static ExtentReports extent;

    @BeforeSuite
    public void setupReport() {
        extent = ExtentManager.getInstance();
    }

    @AfterSuite
    public void tearDownReport() {
        extent.flush(); // writes everything to extent.html
    }
}