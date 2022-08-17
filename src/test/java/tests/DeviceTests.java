package tests;

import static util.ExtentTestManager.startTest;
import java.lang.reflect.Method;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;

public class DeviceTests extends BaseTest {
	@Test(priority = 0, description = "Create a Device")
	public void CreateDevice(Method method) throws InterruptedException {
		// ExtentReports Description
		Faker faker = new Faker();
		String randomdevicename = faker.lorem().characters(3);
		String deviceName = "Device" + randomdevicename;
		System.out.println(deviceName);

		startTest(method.getName(), "Create a Device");
		Thread.sleep(20000);
		loginPage
			.openClarityApp()
			.logintoClarity("jennifer", "1111");
		Thread.sleep(30000);
		homePage
			.goToAssets();
		Thread.sleep(15000);
		assetPage
			.goToDevice();
		Thread.sleep(15000);
		assetPage
			.goToDevice();
		Thread.sleep(15000);
		devicePage
			.addDevicePage();
		Thread.sleep(15000);
		adddevicePage
			.createDevice(deviceName);
		devicePage
			.verifydevice(deviceName);

		
	}
}
