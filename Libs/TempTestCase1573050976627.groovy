import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\DANIEL~1.DON\\AppData\\Local\\Temp\\Katalon\\Test Cases\\SD FLOW Advance Pay\\SD FLOW from VENDOR\\SD FLOW SaleOrder_from_Vendor\\20191106_163616\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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

not_run: String waitLoad = 'Waiters/WaitLoadingAnim_Element'

not_run: String waitButton = 'Waiters/WaitButton_Element'

not_run: String waitConfirm = 'OR/Open-SendtoConfirm/input_Sale Order_Progress'

not_run: WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

not_run: WebUI.waitForElementVisible(findTestObject(waitButton), 20)

not_run: WebUI.waitForElementClickable(findTestObject(waitButton), 20)

not_run: WebUI.delay(2)

not_run: CustomKeywords.'linkers.Link_SD_FLOW_VENDOR.order'()

not_run: WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

not_run: WebUI.waitForElementVisible(findTestObject(waitConfirm), 20)

not_run: WebUI.waitForElementClickable(findTestObject(waitConfirm), 20)

not_run: WebUI.click(findTestObject(waitConfirm))

not_run: WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

'Will not be mandatory'
not_run: WebUI.selectOptionByIndex(findTestObject('OR/Open-SendtoConfirm/select_Activation'), 1)

WebUI.selectOptionByLabel(findTestObject('OR/Open-SendtoConfirm/select_OrderTo'), findTestData('Provider Company').getValue(
        2, 1), false)

String dateFutureWEeek = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.setText(findTestObject('OR/Open-SendtoConfirm/input_Deadline'), dateFutureWEeek)

WebUI.click(findTestObject('OR/Open-SendtoConfirm/div_Save_scrollToTopModal'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('OR/Open-SendtoConfirm/input_Sale Order_SendForConfirmation'), 20)

WebUI.waitForElementClickable(findTestObject('OR/Open-SendtoConfirm/input_Sale Order_SendForConfirmation'), 20)

WebUI.click(findTestObject('OR/Open-SendtoConfirm/input_Sale Order_SendForConfirmation'))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitButton), 20)

WebUI.waitForElementClickable(findTestObject(waitButton), 20)

WebUI.delay(2)

CustomKeywords.'linkers.Link_SD_FLOW_VENDOR.order'()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject('OR/OR Confirm/input_Sale Order_FirstConfirm'), 20)

WebUI.waitForElementClickable(findTestObject('OR/OR Confirm/input_Sale Order_FirstConfirm'), 20)

WebUI.click(findTestObject('OR/OR Confirm/input_Sale Order_FirstConfirm'))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitButton), 20)

WebUI.waitForElementClickable(findTestObject(waitButton), 20)

CustomKeywords.'linkers.Link_SD_FLOW_VENDOR.order'()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject('OR/OR Confirm/input_Sale Order_SendOrder'), 20)

WebUI.waitForElementClickable(findTestObject('OR/OR Confirm/input_Sale Order_SendOrder'), 20)

WebUI.click(findTestObject('OR/OR Confirm/input_Sale Order_SendOrder'))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitButton), 20)

WebUI.waitForElementClickable(findTestObject(waitButton), 20)

CustomKeywords.'linkers.Link_SD_FLOW_VENDOR.order'()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject('OR/OR Confirm/input_Sale Order_Close'), 20)

WebUI.waitForElementClickable(findTestObject('OR/OR Confirm/input_Sale Order_Close'), 20)

WebUI.click(findTestObject('OR/OR Confirm/input_Sale Order_Close'))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

''', 'Test Cases/SD FLOW Advance Pay/SD FLOW from VENDOR/SD FLOW SaleOrder_from_Vendor', new TestCaseBinding('Test Cases/SD FLOW Advance Pay/SD FLOW from VENDOR/SD FLOW SaleOrder_from_Vendor',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
