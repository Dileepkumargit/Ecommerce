package eComerstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class onward {
	public static void date(WebDriver driver)
	{
		driver.findElement(By.id("rb-calendar_onward_cal")).click();  
		 while(!driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='monthTitle']")).getText().equals("Oct 2019"))
		 driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='next']/button")).click();
		 driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//tr/td")).stream().filter(a->a.getText().equals("25")).findFirst().get().click();
        
	}

}
