package tests;

import static util.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class VerifyOQRecordsTest extends BaseTest {

	@Test(priority =0 , description = "Workforce")
	public void VerifyOQrecords(Method method) throws Exception{
		//ExtentReports Description
		startTest(method.getName(),"Verify the OQ records");
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
