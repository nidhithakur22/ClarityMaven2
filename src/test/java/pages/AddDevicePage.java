
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.github.javafaker.Faker;
import com.github.javafaker.Number;

import util.Log;

public class AddDevicePage extends BasePage{

	public AddDevicePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/**
	    * Variables
	    */

	int waittime=3000;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions a = new Actions(driver);
	
	
	/**
	    * Web Elements
	    */	
		By dName 					= By.xpath("//*[@id=\"name\"]/input");
		By devicestatusValue 		= By.xpath("//*[@id=\"devicestatusValue\"]");
		By activestatus				= By.xpath("//*[@id=\"ion-overlay-1\"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[1]/ion-radio");
		By deviceTypeValue			= By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-assets/ion-content/ion-router-outlet/app-add-devices/form/ion-row/ion-col[2]/ion-card/div[2]/ion-list/div[2]/div[1]/ion-item/ion-select");
		By devicetype				= By.xpath("/html/body/ion-popover/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[1]/ion-radio");
		By partNumberValue			= By.xpath("//*[@id=\"partNumberValue\"]/input");
		By mfgNumber				= By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-assets/ion-content/ion-router-outlet/app-add-devices/form/ion-row/ion-col[2]/ion-card/div[2]/ion-list/div[2]/div[1]/ion-row[1]/ion-col[2]/ion-item/div/ion-input/input");
		By serialNumber				= By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-assets/ion-content/ion-router-outlet/app-add-devices/form/ion-row/ion-col[2]/ion-card/div[2]/ion-list/div[2]/div[1]/ion-row[2]/ion-col[1]/ion-item/div/ion-input/input");
		By size						= By.xpath("//*[@id=\"instanceValue\"]/input");
		By mfgdateValue				= By.xpath("//*[@id=\"mfgdateValue\"]");
		By year						= By.xpath("/html/body/ion-picker/div[2]/div[2]/ion-picker-column/div/button[2]");
		By done						= By.xpath("/html/body/ion-picker/div[2]/div[1]/div[2]/button");
		By latitude					= By.xpath("//*[@id=\"latitudeBeginValue\"]/input");
		By longitude				= By.xpath("//*[@id=\"longitudeBeginValue\"]/input");
		By nextButton				= By.xpath("//*[@id=\"nextBtn\"]");
		By selectpipeline			= By.xpath("//*[@id=\"pipeline5\"]/ion-radio");
		By saveButton				= By.xpath("//*[@id=\"id_add-devices_save\"]");
		By submitButton				= By.xpath("//*[@id=\"id_add-devices_submit\"]");
			
		
		 /**
		    * Page Methods
		 * @throws InterruptedException 
		    */
		
		// Enter the device details and create a device
		public DevicePage createDevice(String deviceName) throws InterruptedException {
			   Log.info("Create Device with details");
		       
		       try {
		            wait.until(ExpectedConditions.visibilityOfElementLocated(dName));
		            System.out.println("deviceName is located");
		            writeText(dName, deviceName);
		          }
		     catch(TimeoutException e) {
		            System.out.println("deviceName isn't clickable");
		         }
		       
		      		   	
		       Thread.sleep(waittime);
		       //wait.until(ExpectedConditions.elementToBeClickable(devicestatus)).click();
		       
	           click(devicestatusValue);
	           
	           Thread.sleep(waittime);
	           click(activestatus);
	           
	           Thread.sleep(waittime);
	           click(deviceTypeValue);
	           
	           Thread.sleep(5000);
	           Thread.sleep(waittime);
	           click(devicetype);
	           
	           Thread.sleep(waittime);
	           writeText(partNumberValue, "200");
	           
	           Thread.sleep(5000 );
	           Thread.sleep(waittime);
	           writeText(mfgNumber, "201");
	           
	           Thread.sleep(5000 );
	           Thread.sleep(waittime);
	           Faker faker2 = new Faker();
	           writeText(serialNumber,faker2.numerify("###"));
	           
	           Thread.sleep(5000 );
	           Thread.sleep(waittime);
	           writeText(size, "206");
	           
	           Thread.sleep(5000 );
	           Thread.sleep(waittime);
	           click(mfgdateValue);	
	           
	           Thread.sleep(5000 );
	           Thread.sleep(waittime);
	           click(year);	
	           System.out.println("Year is selected");
	           
	           Thread.sleep(15000 );
	           Thread.sleep(waittime);
	           click(done);
	          			
				  WebElement scroll2 =
				  driver.findElement(By.xpath("//*[@id=\"latitudeBeginValue\"]/input"));
				  System.out.println("Location is detected");
				  ((JavascriptExecutor)driver).executeScript(
				  "arguments[0].scrollIntoView(true);", scroll2);
				  System.out.println("Scroll2 is executed successfully");
				  
	           Thread.sleep(15000);
	           Thread.sleep(waittime);
	           writeText(latitude,"89");
	           
	           Thread.sleep(15000);
	           Thread.sleep(waittime);
	           writeText(longitude,"67");
	           
	           Thread.sleep(30000);
	           Thread.sleep(waittime);
	           click(nextButton);
	           System.out.println("Next Button is clicked");
	           Thread.sleep(waittime);
	           
	           
	           
	           WebElement scroll1 = driver.findElement(By.xpath("//*[@id=\"pipeline5\"]/ion-radio"));
	 		   System.out.println("Pipeline is detected");
	 		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll1);
	 		   System.out.println("Scrolll is executed successfully");
	           
	           
	           Thread.sleep(20000 );
	          
	           click(selectpipeline);
	           
	           Thread.sleep(20000 );
	           Thread.sleep(waittime);
	           click(saveButton);
	           
	           Thread.sleep(20000 );
	           Thread.sleep(waittime);
	           click(submitButton);
	                       
		       return new DevicePage(driver);
			}

		}
