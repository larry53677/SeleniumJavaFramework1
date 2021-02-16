package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class DemoAutomation {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver", "C:\\broswerdrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\broswerdrivers\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\broswerdrivers\\msedgedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com");
		WebElement password = driver.findElement(By.id("password"));
		driver.findElement(withTagName("input").above(password)).sendKeys("Testing");;
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		//driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		//driver.close();
		//driver.quit();
	}

}
