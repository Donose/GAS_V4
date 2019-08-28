package randomNumber

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
import internal.GlobalVariable
import java.awt.AWTException
import java.awt.Robot
import java.awt.event.KeyEvent
import java.time.LocalDate

public class generateNumber {
	@Keyword
	def createPor(){
		WebUI.click(findTestObject('POR/a_Purchasing'))
		WebUI.click(findTestObject('POR/a_Add Purchase Requisition'))
		WebUI.waitForElementVisible(findTestObject('POR/div_Purchase Requisition'), 5)
	}
	@Keyword
	def selectPrio(){
		int optionListLength = 4
		Random rand = new Random()
		int indexP = rand.nextInt(optionListLength + 2)
		WebUI.selectOptionByIndex(findTestObject('POR/select_priority'), indexP)
	}
	@Keyword
	def selectSuperv(){
		int optionListLength = 5
		Random rand = new Random()
		int indexS = rand.nextInt(optionListLength + 2)
		WebUI.selectOptionByIndex(findTestObject('POR/select_supervisor'), indexS)
	}
	@Keyword
	def selectDepartment(){
		int optionListLength = 12
		Random rand = new Random()
		int indexD = rand.nextInt(optionListLength + 2)
		WebUI.selectOptionByIndex(findTestObject('POR/select_department'), indexD)
	}
	def selectWh(){
		String [] warehouse = new String [4]
		warehouse[0]='Warehouse number 1'
		warehouse[1]='Warehouse number 2'
		warehouse[2]='Warehouse number 3'
		warehouse[3]='Best warehouse of all time'
		int optionListLenght= 4
		Random rand = new Random()
		int indexW = list.get(warehouse.length)
		WebUI.selectOptionByIndex(findTestObject('POR/select_WH'),indexW)
	}
	@Keyword
	def selectProvider(){
		WebUI.selectOptionByLabel(findTestObject('POR/select_Provider Company'), 'Provider Company', false)
		WebUI.click(findTestObject('POR/span_Select provider'))
		WebUI.setText(findTestObject('POR/input_Select provider'), 'Provider 3')
		Robot press = new Robot()
		press.keyPress(KeyEvent.VK_ENTER)
		press.keyRelease(KeyEvent.VK_ENTER)
	}
	@Keyword
	def selectMaterial(){

		WebUI.click(findTestObject('POR/span_Select material'))
		WebUI.setText(findTestObject('POR/input_Select material'), 'Gaming')
		Robot press2 = new Robot()
		press2.keyPress(KeyEvent.VK_ENTER)
		press2.keyRelease(KeyEvent.VK_ENTER)
	}
	def int createRandomIntBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start))
	}
	def LocalDate createRandomDate(int startYear, int endYear) {
		int day = createRandomIntBetween(1, 28)
		int month = createRandomIntBetween(1, 12)
		int year = createRandomIntBetween(startYear, endYear)
		return LocalDate.of(year, month, day)
	}

	@  Keyword
	def inputDeadline(){
		LocalDate randomDate = createRandomDate(2019, 2021)
		WebUI.setText(findTestObject('POR/input_Deadline'), randomDate )
	}
}
