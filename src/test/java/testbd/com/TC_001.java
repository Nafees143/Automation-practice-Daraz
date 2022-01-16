package testbd.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import bd.com.DriverSetup;

public class TC_001 extends DriverSetup {

	@Test
	public static void Daraz() throws InterruptedException {
		driver.get("https://www.daraz.com.bd/");
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
		
		driver.findElement(By.xpath("//span[contains(text(),'Asus Laptops')]")).click();
		Thread.sleep(2000);
		
		//assertion and add product in cart
		String laptopItemName = "ASUS ROG Zephyrus M16 GU603HR-K8061R 11TH Gen Core-i9 Gaming Laptop";
		String laptopName = driver.findElement(By.xpath("//a[contains(text(),'ASUS ROG Zephyrus M16 GU603HR-K8061R 11TH Gen Core-i9 Gaming Laptop')]")).getText();
		Assert.assertEquals(laptopItemName, laptopName);
		
		driver.findElement(By.xpath("//a[contains(text(),'ASUS ROG Zephyrus M16 GU603HR-K8061R 11TH Gen Core')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'GO TO CART')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/label[1]/input[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(2000);
		
		//go to home
		driver.findElement(By.xpath("//a[@data-spm='dhome']")).click();
		Thread.sleep(2000);
		
		//card delete
		driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/a[1]/span[1]/*[1]")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/label[1]/input[1]")).click();
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
		Thread.sleep(2000);
		
		//remove
		driver.findElement(By.xpath("//button[contains(text(),'REMOVE')]")).click();
		Thread.sleep(2000);
		
		//continue shopping
		driver.findElement(By.xpath("//button[contains(text(),'CONTINUE SHOPPING')]")).click();
		Thread.sleep(2000);
		
		//Logout part
		driver.findElement(By.xpath("//span[@id='myAccountTrigger']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='account-icon test logout']")).click();
		Thread.sleep(5000);

	}
	
}