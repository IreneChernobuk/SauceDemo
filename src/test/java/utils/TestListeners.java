package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import test.BaseWithFactoryTest;

public class TestListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("test started");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("test passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Object currentClass = iTestResult.getInstance();
        WebDriver driver = ((BaseWithFactoryTest) currentClass).getDriver();
       AllureService allureService = new AllureService();
       allureService.getSystemName();
       allureService.takeScreenshot(driver);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    @Override
    public void onStart(ITestContext iTestContext) {
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
    }
}
