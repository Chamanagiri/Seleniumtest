package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.nopcommerce.com/");
		/*
		// Findelement
		WebElement WE=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		WE.sendKeys("Books");
		
		//As we are using Findelement in a relative xpath we will get fist element in the list as "Sitemap"
		WebElement el=driver.findElement(By.xpath("//div[@class='footer-upper'] //a"));
		System.out.println(el.getText());*/
		
		
		// Findelements --- Multiple elements
		List<WebElement>links=driver.findElements(By.xpath("//div[@class='footer-upper'] //a"));
		System.out.println("List of elements:" +links.size());
		
		for(WebElement ele:links) // Will fetch the each and every text of all 22 links  
		{
			System.out.println(ele.getText());
		}
	
	
	}

}
