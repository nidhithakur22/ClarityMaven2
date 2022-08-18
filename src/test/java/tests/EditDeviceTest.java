package tests;

import org.testng.annotations.Test;

public class EditDeviceTest extends BaseTest{


	@Test(priority = 0, description = "Edit a Device")
    public void EditDevice() throws InterruptedException {
        //ExtentReports Description
     
        loginPage
        	.openClarityApp()
        	.logintoClarity("jennifer", "1111");
       Thread.sleep(30000);
        homePage
        	.goToAssets();
        Thread.sleep(20000);
        assetPage
        	.goToDevice();
       Thread.sleep(5000);
       assetPage
   			.goToDevice();
       Thread.sleep(5000);
       
       editdevicePage
        	.searchDevice("Device428");
       
       Thread.sleep(3000);
       editdevicePage
       		.editdevice();
        
 
       
        
    }
}
