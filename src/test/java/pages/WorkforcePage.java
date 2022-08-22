package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.Log;

public class WorkforcePage extends BasePage {

	public WorkforcePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Web Elements
     */
	By workforce			=By.xpath("//*[@id=\"id_sidebar_workforce\"]");
	By uploadOQbutton		=By.xpath("html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-report/ion-content/ion-router-outlet/app-workforce/div[1]/div/div/div[1]/div/div/div[2]/div[2]/nav/div/div[2]/div[4]/button");
	
	 //Click on Workforce
	   public WorkforcePage goToWorkforce() {
	       Log.info("Navigating to Workforce");
	       
	       
	       try {
	           wait.until(ExpectedConditions.elementToBeClickable(workforce)).click();
	           System.out.println("Workforce tab is clickable");
	         }
	    catch(TimeoutException e) {
	           System.out.println("Workforce tab isn't clickable");
	    }
	        
	       
	       return new WorkforcePage(driver);
	   }

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

}


