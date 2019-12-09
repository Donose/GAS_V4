package dates

import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.codehaus.groovy.runtime.*;
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class ServiceDatePick {
	
	public void jQueryCalendarExample() {
		WebElement frameElement = driver.findElement(frameLocator);
		driver.switchTo().frame(frameElement);
		wait.until(ExpectedConditions.presenceOfElementLocated(tagText));
		driver.findElement(tagText).click();
		selectJQueryDate("21");
	}
	
public void selectJQueryDate(String date) {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-datepicker-div")));
		WebElement table = driver.findElement(By.className("ui-datepicker-calendar"));
		System.out.println("JQuery Calendar Dates");
		
		List<WebElement> tableRows = table.findElements(By.xpath("//tr"));
				for (WebElement row : tableRows) {
			List<WebElement> cells = row.findElements(By.xpath("td"));
			
			for (WebElement cell : cells) {
				if (cell.getText().equals(date)) {
					driver.findElement(By.linkText(date)).click();
				}
			}
		}
	}
	
}
