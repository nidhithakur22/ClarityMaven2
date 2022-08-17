package tests;

import static util.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;


public class PipelineTests extends BaseTest{
	@Test(priority = 0, description = "Create a Pipeline")
    public void CreatePipeline(Method method) throws InterruptedException {
        //ExtentReports Description
		Faker faker = new Faker();
		String randompipelinename=faker.lorem().characters(3);
		String pipelineName="Pipeline"+randompipelinename;
		System.out.println(pipelineName);
		
       startTest(method.getName(), "Create a Pipeline");
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
        pipelinePage
        	.addPipeline();
       Thread.sleep(5000);
       addpipelinePage
       		.createPipeline(pipelineName);
       pipelinePage
       		.verifypipeline(pipelineName);
       
        
    }
}
