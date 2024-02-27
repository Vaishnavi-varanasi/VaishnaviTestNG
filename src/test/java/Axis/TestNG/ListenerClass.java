package Axis.TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase is Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCase is Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase is Skipped");
	}

	public void onTestFailedButSuccessPercentage(ITestResult result) {
		System.out.println("Some TestCases are passed");
	}

}
