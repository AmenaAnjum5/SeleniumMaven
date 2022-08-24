package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ItemPage {
	@Test
	public void viewProducts() {
		
		//launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajjad\\Desktop\\SeleniumDriver\\Chrome_driver_v104\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("https://www.saucedemo.com/");
		
		//enter username
		WebElement userName= driver.findElement(By.name("user-name"));
				userName.sendKeys("standard_user");
				
		//enter password
		WebElement password= driver.findElement(By.name("password"));
				password.sendKeys("secret_sauce");
				
		//click Login button
		driver.findElement(By.id("login-button")).click();
		
		WebElement product1= driver.findElement(By.className("inventory_item_name"));
		product1.click();
		
		//click on Add to cart
		WebElement addToCartButton= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addToCartButton.click();
		
	}	

}
