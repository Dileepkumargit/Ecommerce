package eComerstesting;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCheckbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		/*driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("thupatidileep@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("dileep335");
		driver.findElement(By.id("signInSubmit")).click();
	    //SearchPage.searchBox(driver);*/
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		for(int i=1 ; i<15 ; i++)
		{
			driver.findElement(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
		}
	    List<WebElement> Brands= driver.findElements(By.xpath("//input[@type='checkbox']"));
	    Brands.get(12).click();
	    System.out.println("Total Brands -> "+ Brands.size());
	    String Text = driver.findElement(By.xpath(".//*[@id='result_0']/div/div[4]/div[1]/a/h2")).getText();
	    System.out.println("All Brand "+ Text);
	    driver.quit();
	}

}
