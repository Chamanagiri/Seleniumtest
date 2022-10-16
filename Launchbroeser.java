package mypackage;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Launchbroeser {

	public static void main(String[] args) throws Exception {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\csind\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//System.setProperty("webdriver.edge.driver", "S:\\Browser drivers\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
			//Creating object for the browser driver
				WebDriver driver = new EdgeDriver();
				Thread.sleep(3000);
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}

	}
