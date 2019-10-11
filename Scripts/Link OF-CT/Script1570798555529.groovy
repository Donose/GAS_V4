import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By

import org.openqa.selenium.WebDriver as WebDriver

import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebDriver driver = DriverFactory.getWebDriver()
 
String lookFor = GlobalVariable.Contract
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
			System.exit(0)
			
		}
		
	}
}
