package useCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farah\\eclipse-workspace\\testSelenium\\src\\test\\ressources\\chromedriver.exe");
		
		WebDriver navigateur = new ChromeDriver();
		
		navigateur.manage().deleteAllCookies();
		
		navigateur.manage().window().maximize();
		
		navigateur.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		navigateur.navigate().to("https://demoqa.com/droppable");
		
		WebElement from;
		from = navigateur.findElement(By.id("draggable"));
		
		WebElement to;
		to = navigateur.findElement(By.id("droppable"));
		
		//--------------------
		
		//Instancitation d'une classe Action
		Actions action = new Actions(navigateur);
		
		//drag and drop 
		// Il faut mettre perform() à chaque fois nous allons utiliser la classe Actions
		
		action.dragAndDrop(from, to).perform();
	
		//verification 
		
		String message;
		
		message = to.getText();
		
		Assert.assertEquals("Dropped!", message);
		
		System.out.println("Action effectuée");
	
		navigateur.close();
	
	
	
	}

}
