package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebElement drpcountryele=driver.findElement(By.xpath("//select[@class='custom-select']"));
		
		Select drpcountry = new Select(drpcountryele);
		//drpcountry.selectByVisibleText("Italy");// Selecting dropdown element using Visible text
		//drpcountry.selectByValue("10");
		//drpcountry.selectByIndex(8);
		
		//Selecting option from drop down using getOption() and for-each loop
		
		List<WebElement>alloptions=drpcountry.getOptions();
		
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Spain"))
			{
			option.click();
			break;
			}
		}
	}

}
