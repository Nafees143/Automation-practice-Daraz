package testbd.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import bd.com.DriverSetup;

public class TC_001 extends DriverSetup {

	public static String baseUrl = "https://www.daraz.com.bd/";

	@Test
	public static void Daraz() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']"))
				.sendKeys("01722325384");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("daraz123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@id='myAccountTrigger']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='account-icon test logout']")).click();
		Thread.sleep(5000);

	}

}
