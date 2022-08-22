package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.Log;

public class UploadOQrecordsPage extends BasePage {

	public UploadOQrecordsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 /**
	    * Variables
	    */
	int waittime			=5000;
	JavascriptExecutor js 	=(JavascriptExecutor) driver;
	Actions a 			  	= new Actions(driver);
	
	/**
     * Web Elements
     */
	
	
	
	By uploadOQbutton		=By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-report/ion-content/ion-router-outlet/app-workforce/div[1]/div/div/div[1]/div/div/div[2]/div[2]/nav/div/div[2]/div[4]/button");
	By tasklist 			=By.id("taskTab");
	By selectnewsource		=By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-report/ion-content/ion-router-outlet/app-workforce/div[3]/div/form/div/div[2]/div[2]/div[1]/div/div[1]/div[2]/input");	//   By.xpath("//*[@id=\"nav-tabtracker\"]/div/div[1]/div[2]/input");
	By newsource			=By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-report/ion-content/ion-router-outlet/app-workforce/div[3]/div/form/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/input");
	By taskfile				=By.name("fileInput");  //By.xpath("//*[@id=\"fileInput\"]");
	
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
    	 Thread.sleep(10000);
    	 click(selectnewsource);
    	 Thread.sleep(waittime);
    	 Thread.sleep(10000);
         //wait.until(ExpectedConditions.elementToBeClickable(selectnewsource)).click();
         writeText(newsource,"Energy Source");
         Thread.sleep(waittime);
         Thread.sleep(10000);
         writeText(taskfile,"C:\\Users\\Asus\\Desktop\\Clarity Videos\\Clarity_Assurance\\EWN OQ files\\EWN OQ files\\tasklist.xlsx");
         Thread.sleep(waittime);
         Thread.sleep(10000);
    	
    	return new UploadOQrecordsPage(driver);
    	
    }
}
