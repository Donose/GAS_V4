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

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.waitForElementClickable(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link_SD_FLOW.mobile_service_notification'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.selectOptionByLabel(findTestObject('MSN/MSN From SD-From Vendor/select_PRIO'), 'Medium', false)

String dateFuture = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.sendKeys(findTestObject('MSN/MSN From SD-From Vendor/input_Deadline'), dateFuture)

WebUI.setText(findTestObject('MSN/MSN From SD-From Vendor/input_Select City'), 'Bucharest')

WebUI.setText(findTestObject('MSN/MSN From SD-From Vendor/input_Street'), 'Tulnici nr 1, bl 82, ap 1 (Warehouse)')

WebUI.setText(findTestObject('MSN/MSN From SD-From Vendor/input_StreetNumber'), '4 (Warehouse)')

