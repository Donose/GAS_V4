package checkers

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By.ByXPath

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.lang.Integer as Integer

public class CheckBox {
	
	@Keyword
	def from_warehouse_checkbox(){
		WebDriver driverTable = DriverFactory.getWebDriver()
		WebElement table = driverTable.findElement(By.xpath('/html/body/div[7]/div[1]/div/form/table[2]'))
		WebDriver count = DriverFactory.getWebDriver()
		WebElement ammount = count.findElement(By.xpath("/html/body/div[7]/div[1]/div/form/table[1]/tbody/tr[1]/td"))
		String quantity = ammount.getText()
		int q = Integer.parseInt(quantity)
		WebDriver selected = DriverFactory.getWebDriver()
		WebElement selected_ammount = selected.findElement(By.xpath('/html/body/div[7]/div[1]/div/form/table[1]/tbody/tr[2]/td'))
		String selected_total = selected_ammount.getText()
		List<WebElement> Checkbox = table.findElements(By.xpath("//input[@type='checkbox']"))
		println(Checkbox.size())
		int a = Integer.parseInt(selected_total)
		List<WebElement> rows_table = table.findElements(By.tagName('input'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			
			println("Client Ordered: "+q+" and there are: "+a+" selected")
				while (q>a){
					rows_table.get(row).findElement(By.tagName('input')).click()
					
				}
				
			}
		}
	}
	

