package eComerstesting;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Macys {
	
	public static void main(String[] arge) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mcom-077.tbe.zeus.fds.com/shop/featured/");
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		driver.findElement(By.id("closeButton")).click();
		Thread.sleep(200);
        driver.findElement(By.id("globalSearchInputField")).sendKeys("jeans");
        driver.findElement(By.id("searchSubmit")).click();
        Thread.sleep(2000);
        System.out.println("dileep");
        driver.findElement(By.xpath("(//li[@class='productThumbnailItem'])[1]")).click();
       /* Select sort = new Select(driver.findElement(By.xpath("//li//select[@id='sortBy']")));
        sort.selectByIndex(1);
        Alert alert = driver.switchTo().alert();*/
        
        
        
	}
}
