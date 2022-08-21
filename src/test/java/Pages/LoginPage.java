package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {

	//public static void main(String args[])
	@Test
	public void openbrowser(){
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajjad\\Desktop\\SeleniumDriver\\Chrome_driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//maximize the browser
		driver.manage().window().maximize();
				
		//enter URL
		driver.get("https://www.ebay.com/");

		
		
	}

}
