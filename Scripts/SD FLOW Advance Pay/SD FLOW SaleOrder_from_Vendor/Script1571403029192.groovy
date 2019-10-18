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

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link.fromRE'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OR/Open-SendtoConfirm/input_Sale Order_Progress'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.STOP_ON_FAILURE)

'Will not be mandatory'
WebUI.selectOptionByIndex(findTestObject('OR/Open-SendtoConfirm/select_Activation'), 1)

WebUI.selectOptionByLabel(findTestObject('OR/Open-SendtoConfirm/select_OrderTo'), findTestData('Provider Company').getValue(
        1, 44), false)

String dateFutureWEeek = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.setText(findTestObject('OR/Open-SendtoConfirm/input_Deadline'), dateFutureWEeek)

WebUI.click(findTestObject('OR/Open-SendtoConfirm/div_Save_scrollToTopModal'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('OR/Open-SendtoConfirm/input_Sale Order_SendForConfirmation'))

WebDriver driver1 = DriverFactory.getWebDriver()

String SpanOR = driver1.findElement(By.xpath('/html/body/div[6]/div[1]/div/form/div[1]/table/tbody/tr/td[3]/table/tbody/tr[1]/td[2]')).getText()

println(SpanOR)

CustomKeywords.'outputExcel.NotificationOutput.writeOR'(SpanOR, 'Sale Order')

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link.fromRE'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OR/OR Confirm/input_Sale Order_Confirm'))

CustomKeywords.'linkers.Link.fromRE'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.click(findTestObject('OR/OR Confirm/input_Sale Order_SEND'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link.fromRE'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OR/OR Confirm/input_Sale Order_Confirm'))

WebUI.waitForElementVisible(findTestObject('Waiters/WaitNotification_Element'), 20)

WebDriver driverPOR = DriverFactory.getWebDriver()

String NotificationPOR = driverPOR.findElement(By.xpath('/html/body/div[4]/div[1]')).getText().substring(18, 26)

println(NotificationPOR)

CustomKeywords.'outputExcel.NotificationOutput.writePOR'(NotificationPOR, 'Purchase req')

