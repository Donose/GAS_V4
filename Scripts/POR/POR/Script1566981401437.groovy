import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//for (int i = 0; i = 10; i++) {
WebUI.waitForElementVisible(findTestObject('MainDashboard/Nav_Menu_Top/a_Purchasing'), 20)

CustomKeywords.'mainDashboardSelections.Selectors.selectPOR'()

WebUI.selectOptionByIndex(findTestObject('POR/New POR/select_Prio'), 1)

WebUI.selectOptionByIndex(findTestObject('POR/New POR/select_Department'), 4)

WebUI.selectOptionByIndex(findTestObject('POR/New POR/select_Supervisor'), 2)

WebUI.selectOptionByLabel(findTestObject('POR/New POR/select_wh'), warehouse, false)

String dateFuture = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.setText(findTestObject('POR/New POR/input_Deadline'), dateFuture)

WebUI.click(findTestObject('POR/New POR/span_Select material'))

WebUI.setText(findTestObject('POR/New POR/input_Select material'), materials)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('POR/New POR/input_Select material'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('POR/New POR/input_QTT'), '1000')

WebUI.selectOptionByValue(findTestObject('POR/New POR/select_Reason'), '4', false)

WebUI.selectOptionByValue(findTestObject('POR/New POR/select_Type'), '0', false)

WebUI.setText(findTestObject('POR/New POR/textarea_Comments'), 'Add POR')

WebUI.click(findTestObject('POR/New POR/input_Purchase Requisition'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

