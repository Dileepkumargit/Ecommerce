package eComerstesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class redbus {
	
	public static void main(String[] arge) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("src")).sendKeys("Bangalore");
		driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//li[text()='"+"Bangalore (All Locations)"+"']")).click();
		
		driver.findElement(By.id("dest")).sendKeys("Hyderabad");
		driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//li[text()='"+"Hyderabad (All Locations)"+"']")).click();
		
		driver.findElement(By.id("rb-calendar_onward_cal")).click();  
		driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//tr/td")).stream().filter(a->a.getText().equals("29")).findFirst().get().click();
		driver.findElement(By.id("search_btn")).click();
		//driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[1]")).click();
	   // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElements(By.id("10927448")).get(0));
		 Select dropdown = new Select(driver.findElement(By.id("//li[@class='checkbox']")));

			//Get all options
			List<WebElement> dd = dropdown.getOptions();
			int index = 0;//if list contains only one element it will take that element
			if(dd.size()>1){
			   //Get a random number between 1, size of dd
			    Random rand = new Random();
			    index = rand.nextInt(dd.size()-1);
			 }
			 if (index >= 0){
			     dropdown.selectByIndex(index);
			 }
		//driver.findElement(By.xpath("//li[@id='10927448']//div[@class='button view-seats fr']")).click();
		view seat =new view(driver);
		List<String> select = seat.getseats();
		String seatview = select.get(new Random().ints(0,select.size()-1).findFirst().getAsInt());
		seat.Seatchartview(seatview);
		driver.switchTo().frame(1);
		
		
		//driver.findElement(By.xpath("//div[@class='lower-canvas canvas-wrapper']//canvas[@data-type='lower'] ")).click();
		//driver.findElements(By.xpath("//div[@class='seat-left m-top-16']")).stream().filter(a->a.getText().equals("49 Seats")).findAny().get().click();
        //driver.findElement(By.xpath("(//li//div[@class='button view-seats fr'])[10]")).click();
        //driver.findElement(By.xpath("(//div//canvas[@data-type='lower'])")).click();
		
	}
	
}
