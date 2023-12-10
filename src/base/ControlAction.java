package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class ControlAction {

 	protected static WebDriver driver;
	static public void LaunchBrowser() {
		System.setProperty("webdriver . chrome.driver", ".//ChromeDriver/ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");

		driver.manage().window().maximize();

	}
	
	public void launchBrowser(String browser ,String url) {
		
	}

	public static void main(String[] args) {
		
	}
}
