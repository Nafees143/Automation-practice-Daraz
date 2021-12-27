package testbd.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import bd.com.DriverSetup;

public class TC_001 extends DriverSetup {

	public static String baseUrl = "https://www.daraz.com.bd/";

	@Test
	public static void Daraz() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Title verification
		String expectedTitle = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);

		//Login part
		driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']"))
				.sendKeys("01722325384");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("daraz123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		Thread.sleep(2000);
		
		//Menu bar part
		driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]")).click();
		Thread.sleep(2000);
		//Hover
		WebElement hover = driver.findElement(By.xpath("//li[@data-cate='cate_1_4']/a/span[contains(text(),'Laptops')]"));
		Actions action = new Actions(driver);
		action.clickAndHold(hover).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Asus Laptops')]")).click();
		Thread.sleep(3000);
		
		//go to home
		driver.findElement(By.xpath("//a[@data-spm='dhome']")).click();
		Thread.sleep(2000);
		
		//Logout part
		driver.findElement(By.xpath("//span[@id='myAccountTrigger']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='account-icon test logout']")).click();
		Thread.sleep(5000);

	}
	
}
