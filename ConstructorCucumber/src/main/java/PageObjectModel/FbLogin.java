package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {
	
	
	By UN = By.id("email");
	By PWD = By.id("pass");
	By Button = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]");
	
	static WebDriver driver ;
	//public static String browser="firefox";
	
	public FbLogin(WebDriver driver) {
		this.driver=driver;
	}
	
	public static void openBrowser(String browserInput) {
		 
		switch (browserInput) {
		case "Chrome":			
			driver = WebDriverManager.chromedriver().create();
			break;
		case "Firefox":			
			driver = WebDriverManager.firefoxdriver().create();
			break;
		default:
			driver = WebDriverManager.edgedriver().create();
			break;
		}
		driver.get("https://www.facebook.com/");
		
		}
	
	

	public void enterUserName() {
		driver.findElement(UN).sendKeys("Name");
	}
	
	public void enterPassword() {
		driver.findElement(PWD).sendKeys("Pass");
	}
	
	public void clickLoginButton() {
		driver.findElement(Button).click();
	}
}
