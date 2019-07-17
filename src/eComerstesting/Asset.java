package eComerstesting;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class Asset {
	
	@Test
	public void f() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String expectedTitle = "Google";
		//Assert.assertTrue("Title does Match", expectedTitle.equals(driver.getTitle()));
		Verify.verify(expectedTitle.equals(driver.getTitle()), "Title does match");
		
	}

}
