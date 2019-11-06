package dates

import org.codehaus.groovy.runtime.*;
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class DatePicker {
	@Keyword
	def pickThisMeeting() {
		Date date = new Date()
		String formatdateNow = date.format('dd')
		println ('Today is: '+formatdateNow)
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement input = driver.findElement(By.xpath('//*[@id="mainData"]/div/div/div[2]/ng-include/form/div[1]/div[4]/div/table/tbody/tr[2]/td[6]/input')).click()
		String mounth = driver.findElement(By.xpath('/html/body/div[4]/div[4]/div/div/div[2]/ng-include/form/div[1]/div[4]/div/table/tbody/tr[2]/td[6]/ul/li/div/table/thead/tr[1]/th[2]/button')).getText()
		WebElement date_picker = driver.findElement(By.xpath('//*[@id="mainData"]/div/div/div[2]/ng-include/form/div[1]/div[4]/div/table/tbody/tr[2]/td[6]/ul/li/div/table/tbody'))
		List<WebElement> date_rows = date_picker.findElements(By.tagName("tr"))
		String lookFor = String.valueOf(formatdateNow)
		println('The day you are looking for is: ' +lookFor)
		println ('The mounth and year are: '+mounth)
		int row_count = date_rows.size
		for (int row = 0; row <date_rows.size; row++){
			List<WebElement> date_column = date_picker.findElements(By.tagName('button'))
			int column_count = date_column.size
			String days = date_column.get(row).getText()
			if(days==lookFor){
				String print = date_column.get(row).findElement(By.tagName('span')).getText()
				println print
				date_column.get(row).findElement(By.tagName('span')).click()
				return
			}
		}
	}

	@Keyword
	def pickThisBilling() {
		Date date = new Date()
		String formatdateNow = date.format('dd')
		println ('Today is: '+formatdateNow)
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement input = driver.findElement(By.xpath('/html/body/div[6]/div[1]/div/div/div[2]/div[4]/div/div/table/tbody/tr[1]/td[2]/input[2]')).click()
		String mounth = driver.findElement(By.xpath('//html/body/div[6]/div[1]/div/div/div[2]/div[4]/div/div/table/tbody/tr[1]/td[2]/ul/li[1]/div/table/thead/tr[1]/th[2]/button')).getText()
		WebElement date_picker = driver.findElement(By.xpath('/html/body/div[6]/div[1]/div/div/div[2]/div[4]/div/div/table/tbody/tr[1]/td[2]/ul/li[1]/div/table/tbody'))
		List<WebElement> date_rows = date_picker.findElements(By.tagName("tr"))
		String lookFor = String.valueOf(formatdateNow)
		println('The day you are looking for is: ' +lookFor)
		println ('The mounth and year are: '+mounth)
		int row_count = date_rows.size
		for (int row = 0; row <date_rows.size; row++){
			List<WebElement> date_column = date_picker.findElements(By.tagName('button'))
			int column_count = date_column.size
			String days = date_column.get(row).getText()
			if(days==lookFor){
				String print = date_column.get(row).findElement(By.tagName('span')).getText()
				println print
				date_column.get(row).findElement(By.tagName('span')).click()
				return
			}
		}
	}
}

