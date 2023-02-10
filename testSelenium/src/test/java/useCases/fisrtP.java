 package useCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fisrtP {
	

	public static void main(String[] args) {
		String message;

		//pour acceder au chemin du chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		// DECLARATION DU NAVIGATEUR -- ouverture du chrome
		WebDriver driver = new ChromeDriver();
				
		// pour supprimer les cookies
		
		driver.manage().deleteAllCookies();
		
		// agrandir l'ecran du navigateur par defaut 

		driver.manage().window().maximize();
		
		//pour ouvrir un lien dans le navigateur 
		//driver.get("https://github.com/");
		// deuxieme option pour ouvrir un lien
		driver.navigate().to("https://github.com/");
		
		// get title du lien
		
		// afficher le titre du lien
		//System.out.println(driver.getTitle());
		message = driver.getTitle();
		System.out.println("Le titre du lien est " +message);
	}
}
