package useCases;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farah\\eclipse-workspace\\testSelenium\\src\\test\\ressources\\chromedriver.exe");
		// ouvrir chrome
		WebDriver driver  = new ChromeDriver();
		// supprimer les cookies
		driver.manage().deleteAllCookies();
		// agrandir la fenetre 
		driver.manage().window().maximize();
		// Implicity wait (for whole project) avant navigate 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// ouvrir l'url 
		driver.navigate().to("https://demoqa.com/buttons");
		
		WebElement DoubleClick;
		DoubleClick = driver.findElement(By.id("doubleClickBtn"));
		
		// Instantiation d'une classe Action 
		Actions action = new Actions(driver);
		
		//Double click du bouton 
		// Il faut mettre perform() à chaque fois nous allons utiliser la classe Actions
		action.doubleClick(DoubleClick).perform();
		// verification 1  de la double click
		WebElement verif;
		verif = driver.findElement(By.id("doubleClickMessage"));
		
		String msg;
		msg = verif.getText();
		System.out.println(msg);
		
		Assert.assertEquals("You have done a double click", msg);
		
		// ou 
		// verification 2  de la double click
		//Assert.assertEquals("You have done a double click", driver.findElement(By.id("doubleClickMessage")).getText());
		
		driver.close();
	}

}
