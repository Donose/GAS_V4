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

//for (int i = 0; i = 20; i++) {
WebUI.waitForElementVisible(findTestObject('MainDashboard/Nav_Menu_Top/a_SD'), 10)

CustomKeywords.'mainDashboardSelections.Selectors.selectSDMeeting'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('ME/select_me_prio'), findTestData('DropDowns').getValue(1, 1), false)

WebUI.click(findTestObject('ME/span_Company name'))

WebUI.setText(findTestObject('ME/input_Company name'), 'COMPANY TEST2', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('ME/input_Company name'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ME/span_Contact name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ME/input_Contact name'), 'admin1')

WebUI.sendKeys(findTestObject('ME/input_Contact name'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('ME/select_Meeting'), findTestData('DropDowns').getValue(2, 1), false)

WebUI.selectOptionByValue(findTestObject('ME/select_Deal'), findTestData('DropDowns').getValue(3, 1), false)

WebUI.selectOptionByValue(findTestObject('ME/select_Location'), findTestData('DropDowns').getValue(4, 1), false)

WebUI.selectOptionByValue(findTestObject('ME/select_Opportunity'), findTestData('DropDowns').getValue(5, 1), false)

WebUI.selectOptionByValue(findTestObject('ME/select_Purpose'), findTestData('DropDowns').getValue(6, 1), false)

String dateCurrent = CustomKeywords.'dates.DateGenerate.date'()

WebUI.setText(findTestObject('Object Repository/ME/DatePick/input_Meeting date'), dateCurrent, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ME/Client Products/span_Client interested in products'), 5)

WebUI.setText(findTestObject('ME/Client Products/input_Quantty'), '20')

WebUI.click(findTestObject('ME/Client Products/span_Select material'))

WebUI.setText(findTestObject('ME/Client Products/input_Materials'), 'Gaming_machine1')

WebUI.sendKeys(findTestObject('ME/Client Products/input_Materials'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('ME/Client Products/select_DealTypeForMaterial'), findTestData('DropDowns').getValue(
        7, 1), false)

String dateFuture = CustomKeywords.'dates.DateGenerate.dateWeek'()

not_run: WebUI.setText(findTestObject('ME/Client Products/input_Prefer Delivery Date'), dateFuture)

WebUI.setText(findTestObject('ME/textarea_Comment'), 'This will be from WAREHOUSE ONLY')

WebUI.click(findTestObject('ME/button_Create Offer'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.scrollToPosition(0, 0)

