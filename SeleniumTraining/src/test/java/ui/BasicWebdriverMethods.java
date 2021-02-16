package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebdriverMethods {
	
	public static WebDriver driver;
	public static String browser = "Chrome"; //external config file - xls, csv

	public static void main(String[] args) {
		
		if (browser.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();			
		}
		
		//driver.get("https://www.saucedemo.com");
		driver.get("https://https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();	
		
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[3]")).click();
		//driver.close();
		

		
		
	}

}
