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

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.navigateToUrl('http://web7.egt-bg.ro:7955/?#!/purchasing_department/purchase_requisitions')

WebUI.waitForElementVisible(findTestObject('Waiters/WaitPurchaseModule_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitPurchaseReq_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitPurchaseReq_Element'), 20)

CustomKeywords.'linkers.Link_SD_FLOW_IDless.purchase_req'()

WebUI.click(findTestObject('POR/select_Purchase Order'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.CONTINUE_ON_FAILURE)

'Priority dropboxes have difrent values in the system'
WebUI.selectOptionByIndex(findTestObject('POR/From SD/select_prio'), 1)

String dateFuture = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.setText(findTestObject('POR/From SD/input_Deadline'), dateFuture)

WebUI.click(findTestObject('POR/From SD/input_Purchase Create'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

