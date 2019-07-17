package eComerstesting;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class view {
	WebDriver driver;

	 view(WebDriver driver)
	 {
		 this.driver = driver;
	 }

	public List<String> getseats() {
		List<WebElement> chart = driver.findElements(By.xpath("//div[@class='seat-left m-top-16']"));
		 return chart.stream().map(a -> a.getText()).distinct().collect(Collectors.toList());
	}

	public void Seatchartview(String seatview) {
		driver.findElement(By.xpath("//div[@class='button view-seats fr']")).click();
		//driver.findElement(By.xpath("//div[contains(text(), 'Limoliner travels')]/parenet::from/div")));
	}

}
