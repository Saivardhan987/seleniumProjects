package com.internal.TestSuites;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.internal.Challenges.redBusWebsite.validateDates;
import com.internal.base.DriverHelper;
import com.internal.base.GlobalValues;

public class redBusTest implements ITestListener {

    private final GlobalValues globalValues = new GlobalValues();
    private final validateDates buses = new validateDates(globalValues);
    private final DriverHelper driverHelper = new DriverHelper();

    @BeforeSuite
    public void launchBrowser() {
        driverHelper.launchBrowser(globalValues);
    }

    @Test
    public void test() {
        buses.getWeekEndDates();
    }

//    @Override
//    public void onTestFailure(ITestResult result) {
//        driverHelper.QuitBrowser();
//    }

}
