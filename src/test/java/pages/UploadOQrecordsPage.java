package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.github.javafaker.Faker;

import util.Log;

public class UploadOQrecordsPage extends BasePage {

	public UploadOQrecordsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 /**
	    * Variables
	    */
	int waittime			=25000;
	JavascriptExecutor js 	=(JavascriptExecutor) driver;
	Actions a 			  	= new Actions(driver);
	
	/**
     * Web Elements
     */
		
	By uploadOQbutton		=By.xpath("//*[@id=\"id_workforce_uploadOQRecords\"]/button");
	By tasklist 			=By.id("taskTab");
	By selectnewsource		=By.xpath("//*[@id=\"nav-tabtracker\"]/div/div[1]/div[4]/input");
	By newsourcename		=By.xpath("//*[@id=\"nav-tabtracker\"]/div/div[1]/div[5]/input");
	By taskfile				=By.xpath("//*[@id=\"fileInput\"]");  
	By importOQtasklist		=By.xpath("//*[@id=\"import-qq-data\"]/div/form/div/div[3]/button[2]");
	
    public UploadOQrecordsPage goToUploadOQRecords() {
        Log.info("Navigating to OQUpload Files");
        
        try {
            wait.until(ExpectedConditions.elementToBeClickable(uploadOQbutton)).click();
            System.out.println("OQUpload Data button is clickable");
          }
     catch(TimeoutException e) {	
            System.out.println("OQUpload Data button isn't clickable");
         }
    
        return new UploadOQrecordsPage(driver);

    }
    
    
    public UploadOQrecordsPage addOQFiles() throws InterruptedException {
    	Log.info("Added OQ Data excel Files");
    	 try {
	            wait.until(ExpectedConditions.visibilityOfElementLocated(tasklist));
	            System.out.println("taskTab is located");
	            click(tasklist);
	          }
	       catch(TimeoutException e) {
	            System.out.println("taskTab isn't clickable");
	         }
    	 
    	  Thread.sleep(waittime);
    	  click(selectnewsource);
    	  Thread.sleep(waittime);
    	  Faker faker1 = new Faker();
    	  writeText(newsourcename, faker1.numerify("####"));
    	  Thread.sleep(waittime);
    	  writeText(taskfile,"C:\\Users\\Asus\\Desktop\\Clarity Videos\\Clarity_Assurance\\EWN OQ files\\WorldEnergyNet_1\\tasklist.xlsx");
    	  Thread.sleep(waittime);
    	  click(importOQtasklist);
    	  Thread.sleep(waittime);
         //wait.until(ExpectedConditions.elementToBeClickable(selectnewsource)).click();
			/*
			 * // writeText(newsource,"Energy Source"); // Thread.sleep(waittime); //
			 * Thread.sleep(10000); writeText(
			 * taskfile,"C:\\Users\\Asus\\Desktop\\Clarity Videos\\Clarity_Assurance\\EWN OQ files\\EWN OQ files\\tasklist.xlsx"
			 * ); Thread.sleep(waittime); Thread.sleep(10000);
			 */
    	return new UploadOQrecordsPage(driver);
    	
    }
}
