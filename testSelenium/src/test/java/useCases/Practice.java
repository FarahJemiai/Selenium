package useCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message;
		System.setProperty("webdriver.chrome.driver" , "src/test/ressources/chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("\"https://github.com/\"");
		
		message = driver.getTitle();

		System.out.println("Le titre de l'application est " +message);
		
		
		// element 
		
		WebElement champ;
		champ = driver.findElement(By.name("go"));
		
		WebElement buttom;
		buttom = driver.findElement(By.name("btk"));
		
		champ .sendKeys("dbb");
		champ.sendKeys(Keys.ENTER);
		
		
		/////////////
		String message2;
		
		WebElement result; 
		
		result = driver.findElement(By.id("dkjksjflk"));
		
		message2 = result.getText();
		
		Assert.assertTrue(message2.contains("resultat"));
		
		
		
		
		
		
		
	}

	
}
