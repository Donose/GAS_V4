package linkers
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testdata.DBData
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

public class Link_Manual_Process {
	
	@Keyword
	def manual_inbound_delivery(){
		DBData sqldata = findTestData('SQL Process numbers Manual ID')
		sqldata.fetchedData = sqldata.fetchData()
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('SQL Process numbers Manual ID').getValue(1,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(('ID-'+(lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == 'ID-'+lookFor){
					rows_table.get(row).findElement(By.tagName('input')).click()
					return
				}
				break
			}
		}
	}
}
