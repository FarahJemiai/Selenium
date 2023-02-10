package useCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farah\\eclipse-workspace\\testSelenium\\src\\test\\ressources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://demoqa.com/menu/#");
		
		// identification des elements
		WebElement MainItem1 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"));
		// instanciation de la class Actions
		Actions action = new Actions(driver);
		
		//mouse hover
		action.moveToElement(MainItem1).perform();
		
		//identification 2 
		WebElement MainItem2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		//mouse hover
		action.moveToElement(MainItem2).perform();
		
		//identification3 
		WebElement MainItem3 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[3]/a"));
		//mouse hover
		action.moveToElement(MainItem3).perform();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
