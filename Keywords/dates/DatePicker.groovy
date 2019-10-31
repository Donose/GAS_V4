package dates

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import java.text.DateFormat
import java.text.SimpleDateFormat
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import org.codehaus.groovy.runtime.*;

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

public class DatePicker {
	
	
	@Keyword
	def pickThis() {
	WebDriver driver = DriverFactory.getWebDriver()
	WebElement date_picker = driver.findElement(By.xpath('/html/body/div[5]/div[1]/div/div/div[2]/div[4]/div/div/table/tbody/tr[1]/td[2]/ul/li[1]/div/table/tbody'))
	List<WebElement> date_rows = date_picker.findElements(By.tagName("tr"))
	println(date_rows.size())
	int row_count = date_rows.size
	for (int row = 0; row <row_count; row++ ){
		List<WebElement> date_column = date_picker.findElements(By.xpath("//*[@class='btn btn-default btn-sm']"))
		println(date_column.size())
		int column_count = date_column.size
	}
 } 
	
}
