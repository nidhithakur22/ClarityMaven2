package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.Log;

public class AssetsPage extends BasePage {

	public AssetsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	/**
     * Web Elements
     */
	By pipeline			=By.xpath("//*[@id=\"id_assets-list_piplines\"]");
	By device 			=By.xpath("//*[@id=\"id_assets-list_devices\"]");
	By equipment 		=By.xpath("//*[@id=\"id_assets-list_equipment\"]");
    
  //Click on Pipeline
    public PipelinePage goToPipeline() {
        Log.info("Navigating to Pipeline");
        
        try {
            wait.until(ExpectedConditions.elementToBeClickable(pipeline)).click();
            System.out.println("Pipeline Tab is clickable");
          }
     catch(TimeoutException e) {
            System.out.println("Pipeline Tab isn't clickable");
         }
        
        //click(pipeline);
        return new PipelinePage(driver);
    }
    
  //Click on Device
    public DevicePage goToDevice() {
        Log.info("Navigating to Device");
        
        try {
        	
            wait.until(ExpectedConditions.elementToBeClickable(device)).click();
           
          }
     catch(TimeoutException e) {
            System.out.println("Device Tab isn't clickable");
         }
        
        //click(device);
        return new DevicePage(driver);
    }
    
    //Click on Equipment
    public DevicePage goToEquipment() {
        Log.info("Navigating to Equipment");
        
        try {
        	
            wait.until(ExpectedConditions.elementToBeClickable(equipment)).click();
           
          }
     catch(TimeoutException e) {
            System.out.println("Equipment Tab isn't clickable");
         }
        
        //click(device);
        return new DevicePage(driver);
    }
}
