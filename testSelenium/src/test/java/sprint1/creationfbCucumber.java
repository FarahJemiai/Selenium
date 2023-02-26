package sprint1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class creationfbCucumber {
	
	WebDriver navigateur;
	@Given("Ouvrir le navigateur")
	public void ouvrir_le_navigateur() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farah\\eclipse-workspace\\testSelenium\\src\\test\\ressources\\chromedriver.exe");
		navigateur.manage().deleteAllCookies();
		navigateur.manage().window().maximize();
		// Implicity wait (for whole project)
		navigateur.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@And("Ouvrir URL")
	public void ouvrir_url() {
		navigateur.navigate().to("https://www.facebook.com/");
		
	}

	@And("Cliquer sur creer compte")
	public void cliquer_sur_creer_compte() {
		WebElement creationCompte;
		creationCompte = navigateur.findElement(By.xpath(""));
		creationCompte.click();
	}

	@When("Saisir nom")
	public void saisir_nom() {
		WebElement nom;
		nom = navigateur.findElement(By.name(""));
		nom.sendKeys("testtest");

	}

	@And("Saisir prenom")
	public void saisir_prenom() {
		WebElement prenom;
		prenom = navigateur.findElement(By.name(""));
		prenom.sendKeys("test");

	}

	@And("Saisir mail")
	public void saisir_mail() {
		WebElement mail;
		mail = navigateur.findElement(By.name(""));
		mail.sendKeys("test@gmail.com");

	}

	@And("Saisir mailConfirm")
	public void saisir_mail_confirm() {
		WebElement mailConfirm; 
		mailConfirm = navigateur.findElement(By.name(""));
		mailConfirm.sendKeys("test@gmail.com");

	}

	@And("Saisir password")
	public void saisir_password() {
		WebElement password;
		password = navigateur.findElement(By.xpath(""));
		password.sendKeys("123");

	}

	@And("Saisir date de naissance")
	public void saisir_date_de_naissance() {
		WebElement listJ = navigateur.findElement(By.id("day"));
		WebElement listM = navigateur.findElement(By.id("month"));
		WebElement listY = navigateur.findElement(By.id("year"));
		//appel class select
		Select selectJ = new Select(listJ);
		selectJ.selectByValue("20");
		Select selectM = new Select(listM);
		selectM.selectByValue("7");
		Select selectY = new Select(listY);
		selectY.selectByValue("1992");
	}

	@And("Selectionner le genre")
	public void selectionner_le_genre() {
		WebElement radio = navigateur.findElement(By.xpath(""));
		radio.click();
	}

	@And("Cliquer sur inscription")
	public void cliquer_sur_inscription() {
		WebElement inscription ;
		inscription = navigateur.findElement(By.xpath(""));
		inscription.click();

	}

	@Then("compte creer")
	public void compte_creer() {
		WebElement verif;
		verif = navigateur.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String message;
		message = verif.getText();
		System.out.println(message);
		Assert.assertEquals("Entrer le code de votre e-mail", message);
	}
}
