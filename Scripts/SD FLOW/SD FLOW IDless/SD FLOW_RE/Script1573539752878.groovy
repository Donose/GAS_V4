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

String waitLoad = '/Waiters/WaitLoadingAnim_Element'

String waitButton = 'Waiters/WaitButton_Element'

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementClickable(findTestObject(waitButton), 20)

CustomKeywords.'linkers.Link_SD_FLOW_IDless.receivables'()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 10)

WebUI.click(findTestObject('RE/input_Receivable_Start'))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 10)

WebUI.click(findTestObject('RE/input_Receivable_Entry'))

String dateNow = CustomKeywords.'dates.DateGenerate.date'()

WebUI.setText(findTestObject('RE/input_Transaction Date'), dateNow)

String amount = WebUI.getText(findTestObject('RE/span_getText'))

String currency = WebUI.getText(findTestObject('RE/span_Currency'))

String rate = WebUI.getText(findTestObject('RE/input_ExchangeRate'))

println((((('Amout in ' + amount) + ' Currency: ') + currency) + ' At a rate of: ') + rate)

WebUI.setText(findTestObject('RE/input_Amount'), amount)

WebUI.click(findTestObject('RE/input_Save'))

WebUI.click(findTestObject('RE/input_Receivable_Close'))

