package useCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class listeDeroulante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farah\\eclipse-workspace\\testSelenium\\src\\test\\ressources\\chromedriver.exe");
		WebDriver navigateur = new ChromeDriver();
		navigateur.manage().deleteAllCookies();
		navigateur.manage().window().maximize();	
		navigateur.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navigateur.navigate().to("https://demoqa.com/select-menu");
		
		WebElement liste;
		liste = navigateur.findElement(By.id("oldSelectMenu"));
		
		
		////////// Appel de la classe  select
		
		Select sel = new Select(liste);
		
		sel.selectByValue("7");
		System.out.println("ok");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
