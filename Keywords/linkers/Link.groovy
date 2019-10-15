package linkers

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Point
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testdata.reader.ExcelFactory


public class Link {
	@Keyword
	def contract(){
		Object excel = ExcelFactory.getExcelDataWithDefaultSheet("./Data Files/processes.xlsx","data",true)
		excel.getValue("Contract",1)
		TestData update
		println('This is test data '+findTestData('Test data').getValue(3, 1))
		println('This is global variable '+GlobalVariable.Contract)
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Test data').getValue(3,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		List<WebElement> buttons = Table.findElements(By.tagName('button'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(((lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == lookFor){
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def fromMeeting(){
		Object excel = ExcelFactory.getExcelDataWithDefaultSheet("./Data Files/processes.xlsx","data",true)
		excel.getValue("Meeting",1)
		TestData update
		println('This is test data '+findTestData('Test data').getValue(1, 1))
		println('This is global variable '+GlobalVariable.Meeting)
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Test data').getValue(1,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		WebElement Object = driver.findElement(By.xpath('/html'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('span'))
			int columns_count = Columns_row.size()
			println(((lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == ('From ')+lookFor){
					Point location = rows_table.get(row).findElement(By.tagName('button')).getLocation()
					WebElement Button = rows_table.get(row).findElement(By.tagName('button'))
					int x = location.getX()
					int y = location.getY()
					Actions actions = new Actions(driver);
					//actions.moveByOffset(x, y)
					actions.moveToElement(Table, x, y)
					actions.pause(20000000)
					println(location)
				
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def offer(){
		Object excel = ExcelFactory.getExcelDataWithDefaultSheet("./Data Files/processes.xlsx","data",true)
		excel.getValue("Offer",1)
		TestData update
		println('This is test data '+findTestData('Test data').getValue(2, 1))
		println('This is global variable '+GlobalVariable.Offer)
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Test data').getValue(2,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(((lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == lookFor){
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}

	@Keyword
	def fromOffer(){
		Object excel = ExcelFactory.getExcelDataWithDefaultSheet("./Data Files/processes.xlsx","data",true)
		excel.getValue("Offer",1)
		TestData update
		println('This is test data '+findTestData('Test data').getValue(2, 1))
		println('This is global variable '+GlobalVariable.Offer)
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Test data').getValue(2,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('span'))
			int columns_count = Columns_row.size()
			println(((lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == ('From ')+lookFor){
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def BR(){
		Object excel = ExcelFactory.getExcelDataWithDefaultSheet("./Data Files/processes.xlsx","data",true)
		excel.getValue("Billing req",1)
		TestData update
		println('This is test data '+findTestData('Test data').getValue(4, 1))
		println('This is global variable '+GlobalVariable.Billing_Req)
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Test data').getValue(4,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(((lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == lookFor){
					rows_table.get(row).findElement(By.tagName('input')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def billingIv(){
		Object excel = ExcelFactory.getExcelDataWithDefaultSheet("./Data Files/processes.xlsx","data",true)
		excel.getValue("Billing req",1)
		TestData update
		println('This is test data '+findTestData('Test data').getValue(5, 1))
		println('This is global variable '+GlobalVariable.Billing_inv)
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Test data').getValue(5,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(((lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == lookFor){
					
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def receivables(){
		Object excel = ExcelFactory.getExcelDataWithDefaultSheet("./Data Files/processes.xlsx","data",true)
		excel.getValue("Receivables",1)
		TestData update
		println('This is test data '+findTestData('Test data').getValue(6, 1))
		println('This is global variable '+GlobalVariable.Receivables)
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Test data').getValue(6,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))
			int columns_count = Columns_row.size()
			println(((lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext >= lookFor){
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def fromRE(){
		Object excel = ExcelFactory.getExcelDataWithDefaultSheet("./Data Files/processes.xlsx","data",true)
		excel.getValue("Receivables",1)
		TestData update
		println('This is test data '+findTestData('Test data').getValue(6, 1))
		println('This is global variable '+GlobalVariable.Receivables)
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor =  findTestData('Test data').getValue(6,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('span'))
			int columns_count = Columns_row.size()
			println(((lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext <= ('From ')+lookFor){
					rows_table.get(row).findElement(By.tagName('button')).click()
					return
				}
				break
			}
		}
	}
	@Keyword
	def purchaseReq(){
		Object excel = ExcelFactory.getExcelDataWithDefaultSheet("./Data Files/processes.xlsx","data",true)
		excel.getValue("Purchase req",1)
		TestData update
		println('This is test data '+findTestData('Test data').getValue(8, 1))
		println('This is global variable '+GlobalVariable.Purchase_req)
		WebDriver driver = DriverFactory.getWebDriver()
		String lookFor = findTestData('Test data').getValue(8,1)
		WebElement Table = driver.findElement(By.xpath('//*[@id="mainData"]/table[1]/tbody'))
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('button'))
			int columns_count = Columns_row.size()
			println(((lookFor) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++){
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext <= lookFor){
					rows_table.get(row).findElement(By.tagName('input')).click()
					return
				}
				break
			}
		}
	}
}