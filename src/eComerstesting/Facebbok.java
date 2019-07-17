package eComerstesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebbok {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("dileep.thupati@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("password@fb");
        driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
        Robot a1 = new Robot();
        a1.keyPress(KeyEvent.VK_ESCAPE);
       
        driver.findElement(By.xpath(".//*[@id='navItem_100004482247937']/a/div")).click();
        driver.findElement(By.xpath("//a[text()='Friends']")).click();
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='fsl fwb fcb']/a"));
        System.out.println("Total Friendds -> "+ links.size());
        for(WebElement e : links) 
        {
        	System.out.println(e.getText());
        	
        }
        
	}

}
