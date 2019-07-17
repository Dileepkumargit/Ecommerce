package eComerstesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
 public static void main(String[] arge) throws AWTException {
	    System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
        driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();
 	    driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("shirts");
        driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[2]/form/div/div[2]/button")).click();
        List<WebElement> Results = driver.findElements(By.xpath("//div[@class='_3liAhj _1R0K0g']"));
        System.out.println("Total Results -> "+ Results.size());
      for(WebElement e : Results) 
      {
      	System.out.println(e.getText());
      }
 }
 }

