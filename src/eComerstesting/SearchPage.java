package eComerstesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

	@FindBy(name ="field-keywords")
	private static  WebElement searchBox;
	
	@FindBy(className="nav-input")
	private WebElement submit;
	
	public static void searchBox(WebDriver driver) {
		searchBox.sendKeys("keyword");
		
	}
	public void submit() {
		submit.click();
		
	}
	
}
