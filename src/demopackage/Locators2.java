package demopackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name ="Bhanu";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbhn\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		/// we are waiting for the element to load, it does not exist in page yet
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name); //not hard-coding the name
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(1000);// the element is already there , but not stabilized were unable to fetch the correct one
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	
	Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello " + name+",");
	
	driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	driver.close();

	}

	
}
