package useCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Recherche {
static String message;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// chemin de chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farah\\eclipse-workspace\\testSelenium\\src\\test\\ressources\\chromedriver.exe");
		
		// open chrome
		
		WebDriver driver = new ChromeDriver() ;
		
		//sleep : pour arreter le code 5 s , pour rexecuter le code en cas d'attente
		Thread.sleep(5000);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.fr/");
		message = driver.getTitle() ;
		System.out.println("Le titre de l'application est " +message);
	
	// identification des elements 
		WebElement champ ;
		champ = driver.findElement(By.name("q"));
		
		WebElement buttom ;
		buttom = driver.findElement(By.name("btnK"));
	
	// actions
		// action 1 champ de texte
		champ .sendKeys("BDD");
		
		// action 2 bouton 
		//buttom.click();
		
		champ.sendKeys(Keys.ENTER);
		
   // verification si la recherche a été etablie
		
		WebElement result; 
		result = driver.findElement(By.id("result-stats"));
		
		String message2;
		
		message2 = result.getText();
		
		// Assertion pour faire la comparaison pour tester le message attendu avec le message afficher
		
		// Assert.assertEquals(expected, actual); => verification du message caractere par caractere
		Assert.assertTrue(message2.contains("résultats"));
		
		System.out.println("Test OK ");
		
	
	
	}

}
