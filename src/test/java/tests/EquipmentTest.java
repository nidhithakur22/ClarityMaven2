package tests;

import static util.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class EquipmentTest extends BaseTest {
	@Test(priority = 0, description = "Create a Equipment")
	public void CreateEquipment(Method method) throws InterruptedException {
		// ExtentReports Description
		Faker faker = new Faker();
		String randomeqipmentname = faker.lorem().characters(3);
		String equipmentName = "Equipment" + randomeqipmentname;
		System.out.println(equipmentName);
		startTest(method.getName(), "Create a Equipment");
		Thread.sleep(20000);
		loginPage
			.openClarityApp()
			.logintoClarity("jennifer", "1111");
		Thread.sleep(30000);
		homePage
			.goToAssets();
		Thread.sleep(15000);
		assetPage
			.goToEquipment();
		Thread.sleep(15000);
		assetPage
			.goToEquipment();
		Thread.sleep(15000);
		equipmentPage
			.addEquipmentPage();
		Thread.sleep(15000);
		addequipmentPage
			.createEquipment(equipmentName);
		Thread.sleep(15000);
		equipmentPage
			.verifyequipment(equipmentName);

	}	

}
