package demopackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 system.setProperty("webdriver.gecko.driver","path..../geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		driver.quit(); */
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sbhn\\Documents\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}

}
