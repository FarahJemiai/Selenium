package sprint2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pinterestCucumber {
	WebDriver driver;
	@Given("ouvrir le navigateur google chrome")
	public void ouvrir_le_navigateur_google_chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farah\\eclipse-workspace\\testSelenium\\src\\test\\ressources\\chromedriver.exe");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@And("acceder a l URL du site pinterest")
	public void acceder_a_l_url_du_site_pinterest() {
		driver.get("https://www.pinterest.fr/");

	}

	@And("cliquer sur s inscrire")
	public void cliquer_sur_s_inscrire() {
		WebElement inscription; 
		inscription = driver.findElement(By.xpath("//*[@id=\"fullpage-wrapper\"]/div[1]/div/div/div[1]/div/div[2]/div[3]/button/div"));
		inscription.click();
	}

	@When("saisir adresse email")
	public void saisir_adresse_email() {
		WebElement email;
		email = driver.findElement(By.id("email"));
		email.sendKeys("farahrihab12@gmail.com");
	}

	@And("saisir le mot de passe")
	public void saisir_le_mot_de_passe() {
		WebElement pwd;
		pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("azerty022258");
	}

	@And("saisir age")
	public void saisir_age() {
		WebElement age;
		age = driver.findElement(By.id("age-input"));
		age.sendKeys("30");
	}

	@And("cliquer sur continuer")
	public void cliquer_sur_continuer() {
		WebElement continuerBtn;
		continuerBtn = driver.findElement(By.xpath("//button[@aria-label='Poursuivre la création de votre compte Pinterest']//div"));
		continuerBtn.click();
	}

	@And("cliquer sur suivant")
	public void cliquer_sur_suivant() {
		WebElement suivant; 
		suivant = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/button"));
		suivant.click();
	}

	@Then("page d accueil")
	public void page_d_accueil() {

	}
}
