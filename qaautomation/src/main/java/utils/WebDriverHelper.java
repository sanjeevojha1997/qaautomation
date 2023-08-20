package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverHelper {
	private static WebDriver driver;

	public static void setup() {
		String browser = System.getProperty("Browser");

		if (browser == "chrome")
			getChromeDriver();
		else if (browser == "firefox")
			getFirefoxDriver();
	}

	private static void getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	private static void getFirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

}
