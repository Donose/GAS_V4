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

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.waitForElementClickable(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link_SD_FLOW_VENDOR.receivables'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('RE/input_Receivable_Start'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.STOP_ON_FAILURE)

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
