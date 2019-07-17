package eComerstesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		/*driver.findElement(By.id("AccLogin")).click();
		driver.findElement(By.name("EmailID")).sendKeys("thupatidileep@gmail.com");
		driver.findElement(By.id("LoginPassword")).sendKeys("dileep335");
		driver.findElement(By.id("SignINAjx")).click();*/
		Thread.sleep(2000);
		driver.findElement(By.id("source")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='"+"Bangalore"+ "']")).click();
		driver.findElement(By.id("destination")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='"+"Chennai"+"']")).click();
		WebElement datepick = driver.findElement(By.id("datepicker1"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='20-04-2019'", datepick);
		datepick = driver.findElement(By.id("datepicker2"));
		js.executeScript("arguments[0].value='22-04-2019'", datepick);
		driver.findElement(By.xpath("//a[@class=\"btnab icosearch\"]")).click();
		driver.findElement(By.id("522183726")).click();
		driver.findElement(By.id("O5-9ZZ")).click();
		Select BP = new Select(driver.findElement(By.id("boardingpoint_id1")));
		BP.selectByIndex(1);
		driver.findElement(By.id("btnEnable1")).click();
		driver.findElement(By.id("522830888")).click();
		driver.findElement(By.id("O1-4ZZ")).click();
		Select Bp = new Select(driver.findElement(By.id("boardingpoint_id2")));
		Bp.selectByIndex(1);
	}
}
