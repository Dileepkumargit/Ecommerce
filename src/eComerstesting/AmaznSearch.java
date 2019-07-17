package eComerstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmaznSearch {

	public static void main(String[] args) {

		
			System.setProperty("webdriver.gecko.driver","E:\\geckoDriver\\geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
			driver.get("https://www.amazon.in");
		
			driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
			driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("thupatidileep@gmail.com");
		    driver.findElement(By.xpath(".//*[@id='continue']")).click();
			driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("dileep335");
			driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
			SearchPage.searchBox(driver);
		
	    	//driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("keyword");
			driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
	    
	
			driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("shirts");
			driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();	   
		
			driver.findElement(By.xpath(".//*[@id='result_0']/div/div[4]/div[1]/a/h2")).click();
	
			driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
		   
		}

	

}
