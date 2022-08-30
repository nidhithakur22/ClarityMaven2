package tests;

import org.testng.annotations.Test;

import pages.UploadOQrecordsPage;

import static util.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class UploadOQrecordsTest extends BaseTest{
	
	@Test(priority =0 , description = "Workforce")
	public void UploadOQrecords(Method method) throws InterruptedException{
		//ExtentReports Description
		startTest(method.getName(),"upload OQ records");
		loginPage
			.openClarityApp()
			.logintoClarity("andersonoil", "1111");
		Thread.sleep(10000);
		homePage
			.goToWorkforce();
		Thread.sleep(15000);	
		uploadOQrecordsPage
			.goToUploadOQRecords();
		Thread.sleep(25000);
		uploadOQrecordsPage
			.goToUploadOQRecords();
		uploadOQrecordsPage
			.addOQFiles();
		
	Thread.sleep(25000);
}

}
