package demopackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Invoking browser
		
		//Chromedriver class in Selenium has all methods to automate chrome browser
		//WebDriver is an interface which is a blueprint - it says which methods / variables are to be defined and respective browser classes will define their own implementation of those standard method names
		
		//Selenium will search for the key - to find the chromedriver to perform actions
		
		//SeleniumManager - automatically does the below
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbhn\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();//creating object of the class to access the methods
	
	
	driver.get("http://www.amazon.com");
	System.out.println(driver.getTitle());
	driver.close();
	//driver.quit();
	
	
	
	
	
		
		
	}

}
