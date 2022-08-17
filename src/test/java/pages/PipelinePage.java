package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.Log;

public class PipelinePage extends BasePage{

	public PipelinePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 /**
	    * Variables
	    */
	//variables
	Actions a = new Actions(driver);
	
	 /**
	    * Web Elements
	    */
	   By pipeline			=By.xpath("//*[@id=\"id_assets-list_piplines\"]");
	   By addpipeline		=By.xpath("//*[@id=\"undefined\"]");
	   By searchpipeline	=By.xpath("//*[@id=\"searchField\"]/input");
	   By readarrow			=By.xpath("//*[@id=\"arrowFor0\"]");
	   By pipelinelist0		=By.xpath("//*[@id=\"pipelineSystemValue0\"]");
	
	
	 /**
	    * Page Methods
	    */
	 	   
	   //Click on Add Pipeline
	   public AddPipelinePage addPipeline() {
	       Log.info("Navigating to Add Pipeline");
	       try {
	            wait.until(ExpectedConditions.elementToBeClickable(addpipeline)).click();
	            System.out.println("Add Pipeline Button is clickable");
	          }
	     catch(TimeoutException e) {
	            System.out.println("Add Pipeline Button isn't clickable");
	         }
	       
	      // click(addpipeline);
	       return new AddPipelinePage(driver);
	   }
	   
	   public PipelinePage verifypipeline(String pipelineName) throws InterruptedException {
		   Log.info("Verify Pipeline with details");
		   writeText(searchpipeline, pipelineName);
		   Thread.sleep(2000);
		   a.sendKeys(Keys.ENTER).build().perform();
		   click(readarrow);
		   String pname0=readText(pipelinelist0);
		   System.out.println(pname0);
		   assertEquals(readText(pipelinelist0), pipelineName);
		   return this;
		   
		   
	   }
	
}
