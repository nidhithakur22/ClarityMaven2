package tests;

import static util.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class EditPipelineTest extends BaseTest {

	@Test(priority = 0, description = "Edit a Pipeline")
    public void EditPipeline() throws InterruptedException {
        //ExtentReports Description
     
        loginPage
        	.openClarityApp()
        	.logintoClarity("jennifer", "1111");
       Thread.sleep(30000);
        homePage
        	.goToAssets();
        Thread.sleep(20000);
        assetPage
        	.goToPipeline();
       Thread.sleep(5000);
       assetPage
   			.goToPipeline();
       Thread.sleep(5000);
       
       editpipelinePage
        	.searchPipeline("Kearns");
       
       Thread.sleep(3000);
       editpipelinePage
       		.editpipeline();
      
 
       
        
    }
}
