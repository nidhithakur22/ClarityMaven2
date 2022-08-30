package tests;

import static util.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class VerifyOQRecordsTest extends BaseTest {

	@Test(priority =0 , description = "Workforce")
	public void VerifyOQrecords(Method method) throws InterruptedException{
		//ExtentReports Description
		startTest(method.getName(),"upload OQ records");
		loginPage
			.openClarityApp()
			.logintoClarity("andersonoil", "1111");
		Thread.sleep(10000);
		homePage
			.goToWorkforce();
		Thread.sleep(15000);	
		verifyOQrecordPage
			.verifyOQEmployeeRecords();
		Thread.sleep(25000);
		
	Thread.sleep(25000);
}

    
}
