package seleniumInterviewQuestions2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutocompleteGooglePlaceDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='searchboxinput']"));
		searchbox.sendKeys("MN");
		
		String text;
		
		do
		{
			searchbox.sendKeys(Keys.ARROW_DOWN);
			text=searchbox.getAttribute("value");
			if(text.equals("MNR Arcade"))
			{
				searchbox.sendKeys(Keys.ENTER);
				break;
			}	
		}while(!text.isEmpty());
		

	}

}
