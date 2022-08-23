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
		driver.get("http://primusbank.qedgetech.com/");
		
		String title= driver.getTitle();
		System.out.println(title);
		
		//select branch
		
		WebElement drpdwn= driver.findElement(By.xpath("//select[@name='drlist']"));
		
		Select selObject= new Select(drpdwn);
		selObject.selectByValue("chinna");	
		
		//enter username
		WebElement userName= driver.findElement(By.xpath("//input[@id='txtuId']"));
		userName.sendKeys("admin");
		
		//enter password
		WebElement password= driver.findElement(By.xpath("//input[@name='txtPword']"));
		password.sendKeys("admin");
		
		//click Login button
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		driver.close();
	}
	

}
