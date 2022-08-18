package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Log;

public class EditDevicePage extends BasePage{

	public EditDevicePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	Actions a = new Actions(driver);
	int waittime =5000;

	 /**
	    * Web Elements
	    */
	   By device 			=By.xpath("//*[@id=\"id_assets-list_devices\"]");
	   By searchdevice		=By.xpath("//*[@id=\"searchField\"]/input");
	   By readarrow			=By.xpath("//*[@id=\"arrowFor0\"]");
	   By devicelist0 		=By.xpath("//*[@id=\"deviceNameValue0\"]"); 	
	   	
	   
		public  void searchDevice(String DeviceName) throws InterruptedException {
		// TODO Auto-generated method stub
		   Log.info("Search Device with details");
		   writeText(searchdevice, DeviceName);
		   Thread.sleep(2000);
		   a.sendKeys(Keys.ENTER).build().perform();
		   click(readarrow);
		   String dname0=readText(devicelist0);
		   System.out.println(dname0);
		   assertEquals(readText(devicelist0), DeviceName);
		   	  
	}
		   /* Web Elements Of Edit a device 
		    * 
		    */
			By editButton				= By.name("create");
			By deviceTypeValue			= By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-assets/ion-content/ion-router-outlet/app-add-devices/form/ion-row/ion-col[2]/ion-card/div[2]/ion-list/div[2]/div[1]/ion-item/ion-select");
			By devicetype				= By.xpath("/html/body/ion-popover/ion-select-popover/ion-list/ion-radio-group/ion-item[2]");
			By partNumberValue			= By.xpath("//*[@id=\"partNumberValue\"]/input");
			By mfgNumber				= By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-assets/ion-content/ion-router-outlet/app-add-devices/form/ion-row/ion-col[2]/ion-card/div[2]/ion-list/div[2]/div[1]/ion-row[1]/ion-col[2]/ion-item/div/ion-input/input");
			By serialNumber				= By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-assets/ion-content/ion-router-outlet/app-add-devices/form/ion-row/ion-col[2]/ion-card/div[2]/ion-list/div[2]/div[1]/ion-row[2]/ion-col[1]/ion-item/div/ion-input/input");
			By size						= By.xpath("//*[@id=\"instanceValue\"]/input");
			By mfgdateValue				= By.xpath("//*[@id=\"date\"]");
			By year						= By.xpath("/html/body/ion-popover/ion-datetime//div/ion-picker-internal/ion-picker-column-internal//button[1]");
			By done						= By.xpath("/html/body/ion-picker/div[2]/div[1]/div[2]/button");
			By latitude					= By.xpath("//*[@id=\"latitudeBeginValue\"]/input");
			By longitude				= By.xpath("//*[@id=\"longitudeBeginValue\"]/input");
			By nextButton				= By.xpath("//*[@id=\"nextBtn\"]");
			By selectpipeline			= By.xpath("//*[@id=\"pipeline6\"]/ion-radio");
			By saveButton				= By.xpath("//*[@id=\"id_add-devices_save\"]");
			By submitButton				= By.xpath("//*[@id=\"id_add-devices_submit\"]");
		
		public EditDevicePage editdevice() throws InterruptedException {
			// TODO Auto-generated method stub
			System.out.println("Click to the edit button");
			Thread.sleep(10000);
			click(editButton);
			Thread.sleep(waittime);
			click(deviceTypeValue);
			Thread.sleep(waittime);
			click(devicetype);
			Thread.sleep(waittime);
			clear(partNumberValue);
			Thread.sleep(waittime);
			writeText(partNumberValue,"93");
			Thread.sleep(waittime);
			clear(mfgNumber);
			Thread.sleep(waittime);
			writeText(mfgNumber, "780");
			Thread.sleep(waittime);
			
			clear(size);
			Thread.sleep(waittime);
			writeText(size, "89");
			Thread.sleep(waittime);
		
			WebElement scroll2 = driver.findElement(By.xpath("//*[@id=\"date\"]"));
	 		   System.out.println("Pipeline is detected");
	 		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll2);
	 		   System.out.println("Scrolll is executed successfully");
//			click(mfgdateValue);
//			Thread.sleep(waittime);
//			 Thread.sleep(20000 );
//			click(year);
//			Thread.sleep(waittime);
//			click(done);
			Thread.sleep(waittime);
			clear(latitude);
			Thread.sleep(waittime);
			writeText(latitude,"27");
			Thread.sleep(waittime);
			clear(longitude);
			Thread.sleep(waittime);
			writeText(longitude, "18");
			Thread.sleep(waittime);
			click(nextButton);
            System.out.println("Next Button is clicked");
            Thread.sleep(waittime);
	           
	           
            WebElement scroll1 = driver.findElement(By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-assets/ion-content/ion-router-outlet/app-add-devices/form/ion-row/ion-col[2]/ion-card/div[2]/ion-list/div[2]/ion-radio-group/div[7]"));
 		    System.out.println("Pipeline is detected");
 		    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll1);
 		    System.out.println("Scrolll is executed successfully");
 		   
		    Thread.sleep(20000 );
		    click(selectpipeline);
            Thread.sleep(waittime);
            click(saveButton);
            Thread.sleep(20000 );
            Thread.sleep(waittime);
            click(submitButton);
                       
	       return new EditDevicePage(driver);
		
		}
}
 