package eComerstesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.paytm.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Movies']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div/div[1]/div/div/div[1]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("(//a//div[@class='_3Sve'])[3]")).click();
		driver.findElement(By.xpath("(//div//div//a//div[@class='ElCQ'])[5]")).click();
		driver.findElement(By.xpath("(//a[@class='_11ST'])[2]")).click();

	}

}
