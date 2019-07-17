package eComerstesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.redbus.in/");
	    
	    new Actions(driver).sendKeys(Keys.ESCAPE).build().perform();
	    driver.findElement(By.id("src")).sendKeys("Bangalore");
	    driver.findElement(By.id("dest")).sendKeys("Chennai");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[@type()='text']")).click();
	    driver.findElement(By.linkText("15")).click();
	    driver.findElement(By.id("search_btn")).click();

	}


}
