package Utils;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public WebDriver driver;

	public WebDriver applicationWebDriver() throws Exception {

		if (driver == null) {

			FileInputStream inputFile = new FileInputStream("src/test/resources/config.properties");
			Properties properties = new Properties();
			properties.load(inputFile);

			String browser = properties.getProperty("browser");
			String url = properties.getProperty("url");

			if (browser.equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();

				driver.get(url);

				Thread.sleep(1000);

				return driver;
			}
		}

		return driver;

	}

}
