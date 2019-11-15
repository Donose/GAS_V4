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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

String waitLoad = 'Waiters/WaitLoadingAnim_Element'

String waitButton = 'Waiters/WaitButton_Element'

String inProgress = 'OR/Open-SendtoConfirm/input_Sale Order_Progress'

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitButton), 20)

WebUI.waitForElementClickable(findTestObject(waitButton), 20)

WebUI.delay(2)

CustomKeywords.'linkers.Link_SD_FLOW.order'()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(inProgress), 20)

WebUI.waitForElementClickable(findTestObject(inProgress), 20)

WebUI.click(findTestObject(inProgress))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.click(findTestObject('OR/Open-SendtoConfirm/button_Check Warehouse'))

String ammount = WebUI.getText(findTestObject('OR/Open-SendtoConfirm/td_ammount'))

//String orderAmmount = String.valueOf(ammount)
int convert = Integer.parseInt(ammount)

int orderAmmount = convert / 2

println('From WH will be selected: ' + orderAmmount)

WebUI.setText(findTestObject('OR/Open-SendtoConfirm/input_whQtty'), orderAmmount)

WebUI.click(findTestObject('OR/Open-SendtoConfirm/button_UpdateIDless'))

'Will not be mandatory'
not_run: WebUI.selectOptionByIndex(findTestObject('OR/Open-SendtoConfirm/select_Activation'), 1)

not_run: WebUI.selectOptionByLabel(findTestObject('OR/Open-SendtoConfirm/select_OrderTo'), findTestData('Provider Company').getValue(
        2, 1), false)

String dateFutureWEeek = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.setText(findTestObject('OR/Open-SendtoConfirm/input_Deadline'), dateFutureWEeek)

not_run: WebUI.click(findTestObject('OR/Open-SendtoConfirm/div_Save_scrollToTopModal'), 5)

WebUI.waitForElementVisible(findTestObject('OR/OR Confirm/input_Sale Order_FirstConfirm'), 20)

WebUI.waitForElementClickable(findTestObject('OR/OR Confirm/input_Sale Order_FirstConfirm'), 20)

WebUI.click(findTestObject('OR/OR Confirm/input_Sale Order_FirstConfirm'))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitButton), 20)

WebUI.waitForElementClickable(findTestObject(waitButton), 20)

WebUI.delay(2)

CustomKeywords.'linkers.Link_SD_FLOW.order'()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

not_run: WebUI.waitForElementVisible(findTestObject('OR/OR Confirm/input_Sale Order_FirstConfirm'), 20)

not_run: WebUI.waitForElementClickable(findTestObject('OR/OR Confirm/input_Sale Order_FirstConfirm'), 20)

not_run: WebUI.click(findTestObject('OR/OR Confirm/input_Sale Order_FirstConfirm'))

not_run: WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

not_run: WebUI.waitForElementVisible(findTestObject(waitButton), 20)

WebUI.waitForElementClickable(findTestObject(waitButton), 20)

not_run: CustomKeywords.'linkers.Link_SD_FLOW.order'()

not_run: WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

not_run: WebUI.waitForElementVisible(findTestObject('OR/OR Confirm/input_Sale Order_SendOrder'), 20)

not_run: WebUI.waitForElementClickable(findTestObject('OR/OR Confirm/input_Sale Order_SendOrder'), 20)

not_run: WebUI.click(findTestObject('OR/OR Confirm/input_Sale Order_SendOrder'))

not_run: WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

not_run: WebUI.waitForElementVisible(findTestObject(waitButton), 20)

not_run: WebUI.waitForElementClickable(findTestObject(waitButton), 20)

not_run: CustomKeywords.'linkers.Link_SD_FLOW.order'()

not_run: WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject('OR/OR Confirm/input_Sale Order_Close'), 20)

WebUI.waitForElementClickable(findTestObject('OR/OR Confirm/input_Sale Order_Close'), 20)

WebUI.click(findTestObject('OR/OR Confirm/input_Sale Order_Close'))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

