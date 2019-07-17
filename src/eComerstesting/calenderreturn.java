package eComerstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class calenderreturn {
	public static void date(WebDriver driver)
	{
		System.out.println("didnsskn");
		 WebElement date= driver.findElement(By.id("rb-calendar_return_cal"));
		 date.click();
         while(!driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']//td[@class='monthTitle']")).getText().equals("Oct 2019"))
         driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']//td[@class='next']/button")).click();
		 driver.findElements(By.xpath("//div[@id='rb-calendar_return_cal']//tr/td")).stream().filter(a->a.getText().equals("30")).findFirst().get().click();

	}

}
