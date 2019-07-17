package eComerstesting;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class red {
    WebDriver driver;
	red(WebDriver driver) {
		this.driver= driver;
	}

	public List<String> gettravels() {
		List<WebElement> travels = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//tr/td"));
		return travels.stream().map(a->a.getText()).distinct().collect(Collectors.toList());
	}

}
