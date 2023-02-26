package useCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farah\\eclipse-workspace\\testSelenium\\src\\test\\ressources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.pinterest.fr/");
		
		WebElement inscription; 
		inscription = driver.findElement(By.xpath("//*[@id=\"fullpage-wrapper\"]/div[1]/div/div/div[1]/div/div[2]/div[3]/button/div"));
		inscription.click();
		WebElement email;
		WebElement pwd;
		WebElement age;
		WebElement continuerBtn;
		email = driver.findElement(By.id("email"));
		email.sendKeys("farahrihab12@gmail.com");
		
		pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("azerty022258");
		
		age = driver.findElement(By.id("age-input"));
		age.sendKeys("30");
		
		continuerBtn = driver.findElement(By.xpath("//button[@aria-label='Poursuivre la création de votre compte Pinterest']//div"));
		continuerBtn.click();
		
		WebElement suivant; 
		suivant = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/button"));
		suivant.click();
		
		
		
		System.out.println("Successfuly");
		
		
		
		
		
		
		
		
		
	}

}
