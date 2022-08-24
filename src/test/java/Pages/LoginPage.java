package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {

	//public static void main(String args[])
	@Test
	public void openbrowser(){
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajjad\\Desktop\\SeleniumDriver\\Chrome_driver_v104\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//maximize the browser
		driver.manage().window().maximize();
				
		//enter URL
		driver.get("https://www.saucedemo.com/");
		
		String title= driver.getTitle();
		System.out.println(title);
		
		//select branch
		
		//WebElement drpdwn= driver.findElement(By.xpath("//select[@name='drlist']"));
		
		//Select selObject= new Select(drpdwn);
		//selObject.selectByValue("chinna");	
		
		//enter username
		WebElement userName= driver.findElement(By.name("user-name"));
		userName.sendKeys("standard_user");
		
		//enter password
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		
		//click Login button
		driver.findElement(By.id("login-button")).click();
		
		//driver.close();
	}
	

}
