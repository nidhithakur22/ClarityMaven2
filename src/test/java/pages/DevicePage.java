package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.Log;

public class DevicePage extends BasePage {

	public DevicePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Variables
	 */
	// variables
	Actions a = new Actions(driver);
	
	 /**
	    * Web Elements
	    */

		By adddevice 		= By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-assets/ion-content/ion-router-outlet/app-asset-list/ion-row/ion-col[1]/ion-card/div/div[2]/app-searchlist/ion-row/ion-col[2]/ion-button");			
		By searchdevice	 	= By.xpath("//*[@id=\"searchField\"]/input");	
		By readarrow 		= By.xpath("//*[@id=\"arrowFor0\"]"); 			
		By devicelist0 		= By.xpath("//*[@id=\"deviceNameValue0\"]"); 	

	/**
	 * Page Methods
	 */

		// Click on Add Device
	public AddDevicePage addDevicePage() {
		Log.info("Navigating to Add Device");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(adddevice)).click();
			System.out.println("Add Device Button is clickable");
			} 
		catch (TimeoutException e) {
			System.out.println("Add Device Button isn't clickable");
			}

		// click(adddevice);
		return new AddDevicePage(driver);
	}

	public DevicePage verifydevice(String deviceName) throws InterruptedException {
		Log.info("Verify Device with details");
		writeText(searchdevice, deviceName);
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
		click(readarrow);
		String dname0 = readText(devicelist0);
		System.out.println(dname0);
		assertEquals(readText(devicelist0), deviceName);
		return this;

	}
}
