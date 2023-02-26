package sprint1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class connexionDifferentsScenario {
	WebDriver driver;
	@Given("ouvrir browser chrome")
	public void ouvrir_browser_chrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Farah\\eclipse-workspace\\testSelenium\\src\\test\\ressources\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// Implicity wait (for whole project)
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@And("ouvrir application orange")
	public void ouvrir_application_orange() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("^saisir mail adresse(.*)$")
	public void saisir_mail_adresse_admin(String mail) {
		WebElement login;
		login = driver.findElement(By.name("username"));
		login.sendKeys(mail);

	}

	@And("^entrer pwd(.*)$")
	public void entrer_pwd_admin123(String MDP) {
		WebElement password;
		password = driver.findElement(By.name("password"));
		password.sendKeys(MDP);
	}

	@And("cliquer sur le bouton")
	public void cliquer_sur_le_bouton() {
		WebElement bouton ;
		bouton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		bouton.click();
	}

	@Then("connect")
	public void connect() {
		
	}

}
