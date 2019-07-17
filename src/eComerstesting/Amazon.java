
package eComerstesting;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
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
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		Select sort = new Select(driver.findElement(By.id("s-result-sort-select")));
		
		List<WebElement> list= sort.getOptions();
		
		for(WebElement we:list) {
			System.out.println(we.getText());
					}	
			
		
		/*List<WebElement> options = driver.findElements(By.xpath("//span[@class='a-label a-checkbox-label']"));
		 Random rand = new Random();
         int list= rand.nextInt(options.size());
         options.get(list).click();*/
         //driver.close();
		/*for(int i=1 ; i<30 ; i++)
		{
			driver.findElement(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.name("s-ref-checkbox-Jack & Jones")).click();*/
		//driver.findElement(By.xpath(".//*[@id='leftNavContainer']/ul[11]/div/li[5]/span/span/div/label/input")).click();
		/*ElementSelector ese = new ElementSelector();
		ese.getPostTitles();*/
	}

}
