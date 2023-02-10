package useCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class NewCompteFb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farah\\eclipse-workspace\\testSelenium\\src\\test\\ressources\\chromedriver.exe");
		WebDriver navigateur = new ChromeDriver();
		navigateur.manage().deleteAllCookies();
		navigateur.manage().window().maximize();	
		navigateur.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navigateur.navigate().to("https://www.facebook.com/");
		WebElement creationCompte;
		creationCompte = navigateur.findElement(By.xpath(""));
		creationCompte.click();
		
		
		
		
		WebElement prenom, nom, mail , mailConfirm;
		WebElement password;
		WebElement inscription ;
		
		prenom = navigateur.findElement(By.name(""));
		nom = navigateur.findElement(By.name(""));
		mail = navigateur.findElement(By.name(""));
		mailConfirm = navigateur.findElement(By.name(""));
		password = navigateur.findElement(By.xpath(""));
		inscription = navigateur.findElement(By.xpath(""));
		
		WebElement listJ = navigateur.findElement(By.id("day"));
		WebElement listM = navigateur.findElement(By.id("month"));
		WebElement listY = navigateur.findElement(By.id("year"));
		
		
		prenom.sendKeys("test");
		nom.sendKeys("testtest");
		mail.sendKeys("test@gmail.com");
		mailConfirm.sendKeys("test@gmail.com");
		password.sendKeys("123");
		
		
		//appel class select
		Select selectJ = new Select(listJ);
		selectJ.selectByValue("20");
		Select selectM = new Select(listM);
		selectM.selectByValue("7");
		Select selectY = new Select(listY);
		selectY.selectByValue("1992");
		
		//bouton checkbox
		
		WebElement radio = navigateur.findElement(By.xpath(""));
		radio.click();
		inscription.click();
		
		



		
		
		
		
		
		
		
		
		
	}

}
