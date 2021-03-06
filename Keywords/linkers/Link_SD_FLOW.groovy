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


public class Link_SD_FLOW {
	@Keyword
	def contract(){
		DBData sqldata = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW')
		sqldata.fetchedData = sqldata.fetchData()
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW').getValue(3,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(('CT-'+(lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext =='CT-'+ lookFor){
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def offer(){
		DBData sqldata = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW')
		sqldata.fetchedData = sqldata.fetchData()
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW').getValue(2,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(('OF-'+(lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == 'OF-'+lookFor){
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def billing_request(){
		DBData sqldata = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW')
		sqldata.fetchedData = sqldata.fetchData()
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW').getValue(4,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(('BR-'+(lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == 'BR-'+lookFor){
					rows_table.get(row).findElement(By.tagName('input')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def billing(){
		DBData sqldata = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW')
		sqldata.fetchedData = sqldata.fetchData()
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW').getValue(5,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(('BI-'+(lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == 'BR-'+lookFor){

					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def receivables(){
		DBData sqldata = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW')
		sqldata.fetchedData = sqldata.fetchData()
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW').getValue(6,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(('RE-'+(lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == 'RE-'+lookFor){
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def order(){
		DBData sqldata = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW')
		sqldata.fetchedData = sqldata.fetchData()
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW').getValue(7,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(('OR-'+(lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == 'OR-'+lookFor){
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def purchase_req(){
		DBData sqldata = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW')
		sqldata.fetchedData = sqldata.fetchData()
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW').getValue(8,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(('POR-'+(lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == 'POR-'+lookFor){
					rows_table.get(row).findElement(By.tagName('input')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def purchase_order(){
		DBData sqldata = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW')
		sqldata.fetchedData = sqldata.fetchData()
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW').getValue(9,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(('PO-'+(lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == 'PO-'+lookFor){
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def inbound_delivery(){
		DBData sqldata = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW')
		sqldata.fetchedData = sqldata.fetchData()
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW').getValue(10,1)
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
	@Keyword
	def mobile_service_notification(){
		DBData sqldata = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW')
		sqldata.fetchedData = sqldata.fetchData()
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW').getValue(11,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(('MSN-'+(lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == 'ID-'+lookFor){
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def mobile_service_order(){
		DBData sqldata = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW')
		sqldata.fetchedData = sqldata.fetchData()
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Data Files/SQL Process/SQL Process numbers SD FLOW').getValue(10,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(('MSO-'+(lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == 'ID-'+lookFor){
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
}