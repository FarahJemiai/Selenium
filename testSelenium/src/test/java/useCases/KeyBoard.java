package useCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class KeyBoard {

	public static void main(String[] args) {
// copy paste
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farah\\eclipse-workspace\\testSelenium\\src\\test\\ressources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://demoqa.com/text-box");
		
		WebElement champ1 , champ2;
		champ1 = driver.findElement(By.id("currentAddress"));
		champ2 = driver.findElement(By.id("permanentAddress"));
		
		champ1.sendKeys("ennasr1");
		
		//instanciation de la class Actions
		Actions action= new Actions(driver);
		
		action.keyDown(champ1,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(champ2,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

		Assert.assertEquals(champ1.getText(), champ2.getText());
		System.out.println("ok");
		
		
		
		
		
		
		
		
		
		
	}

}
