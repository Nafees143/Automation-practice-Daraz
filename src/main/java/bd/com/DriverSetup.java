package bd.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public static void open() {
		System.setProperty("web.crome.drover", ".//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public static void close() {
		driver.close();
	}
	
}
