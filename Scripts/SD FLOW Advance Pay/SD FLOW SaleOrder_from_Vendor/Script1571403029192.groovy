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
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.waitForElementClickable(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.delay(2)

CustomKeywords.'linkers.Link.order'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('OR/Open-SendtoConfirm/input_Sale Order_Progress'), 20)

WebUI.waitForElementClickable(findTestObject('OR/Open-SendtoConfirm/input_Sale Order_Progress'), 20)

WebUI.click(findTestObject('OR/Open-SendtoConfirm/input_Sale Order_Progress'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

'Will not be mandatory'
WebUI.selectOptionByIndex(findTestObject('OR/Open-SendtoConfirm/select_Activation'), 1)

WebUI.selectOptionByLabel(findTestObject('OR/Open-SendtoConfirm/select_OrderTo'), findTestData('Provider Company').getValue(
        2, 6), false)

String dateFutureWEeek = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.setText(findTestObject('OR/Open-SendtoConfirm/input_Deadline'), dateFutureWEeek)

WebUI.click(findTestObject('OR/Open-SendtoConfirm/div_Save_scrollToTopModal'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('OR/Open-SendtoConfirm/input_Sale Order_SendForConfirmation'), 20)

WebUI.waitForElementClickable(findTestObject('OR/Open-SendtoConfirm/input_Sale Order_SendForConfirmation'), 20)

WebUI.click(findTestObject('OR/Open-SendtoConfirm/input_Sale Order_SendForConfirmation'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.waitForElementClickable(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.delay(2)

CustomKeywords.'linkers.Link.order'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('OR/OR Confirm/input_Sale Order_FirstConfirm'), 20)

WebUI.waitForElementClickable(findTestObject('OR/OR Confirm/input_Sale Order_FirstConfirm'), 20)

WebUI.click(findTestObject('OR/OR Confirm/input_Sale Order_FirstConfirm'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.waitForElementClickable(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link.order'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('OR/OR Confirm/input_Sale Order_SendOrder'), 20)

WebUI.waitForElementClickable(findTestObject('OR/OR Confirm/input_Sale Order_SendOrder'), 20)

WebUI.click(findTestObject('OR/OR Confirm/input_Sale Order_SendOrder'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.waitForElementClickable(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link.order'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('OR/OR Confirm/input_Sale Order_Close'), 20)

WebUI.waitForElementClickable(findTestObject('OR/OR Confirm/input_Sale Order_Close'), 20)

WebUI.click(findTestObject('OR/OR Confirm/input_Sale Order_Close'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

