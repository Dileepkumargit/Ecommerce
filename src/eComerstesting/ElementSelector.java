package eComerstesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementSelector {

	public void getPostTitles() {
		List<WebElement> postTitles = findElement(By.className("featured-box cloumnsize1"));
		for(WebElement eachTitle : postTitles)
		{
			System.out.println(eachTitle.getText());
		}
		
	}

	private List<WebElement> findElement(By className) {
		System.out.println("dileep");
		return null;
	}



}
