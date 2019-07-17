package eComerstesting;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Return;

public class RedBusAutoSuggestion {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		 driver.findElement(By.id("src")).sendKeys("Bangalore");
		 driver.findElement(By.xpath("//li[text()='"+"Bangalore (All Locations)"+"']")).click();
		 driver.findElement(By.id("dest")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//li[text()='"+"Hyderabad (All Locations)"+"']")).click();
				 
		 driver.findElement(By.id("rb-calendar_onward_cal")).click();  
		 while(!driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='monthTitle']")).getText().equals("Oct 2019"))
		 driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='next']/button")).click();
		 driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//tr/td")).stream().filter(a->a.getText().equals("25")).findFirst().get().click();
         Thread.sleep(2000);
         
         Actions actions = new Actions(driver);
         actions.click(driver.findElement(By.id("return_cal"))).perform();
         
         while(!driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']//td[@class='monthTitle']")).getText().equals("Oct 2019"))
         driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']//td[@class='next']/button")).click();
		 driver.findElements(By.xpath("//div[@id='rb-calendar_return_cal']//tr/td")).stream().filter(a->a.getText().equals("30")).findFirst().get().click();
		 
		 driver.findElement(By.id("search_btn")).click();
		
	
	
	}}