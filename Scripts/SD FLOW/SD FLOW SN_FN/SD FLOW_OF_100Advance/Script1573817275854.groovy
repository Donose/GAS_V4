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

String waitLoad = 'Waiters/WaitLoadingAnim_Element'

String waitFirstButton = 'Waiters/WaitButton_Element'

String waitOpen = 'OF/Status Open/input_Sale Offer_Open'

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitFirstButton), 20)

CustomKeywords.'linkers.Link_SD_FLOW.offer'()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitOpen), 20)

WebUI.waitForElementClickable(findTestObject(waitOpen), 20)

WebUI.click(findTestObject(waitOpen))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

String date = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.sendKeys(findTestObject('OF/Status In Progress/input_Offer Validity_Date'), date)

'TO BE MADE'
not_run: WebUI.sendKeys(findTestObject('OF/Status In Progress/input_Discount'), '')

WebUI.sendKeys(findTestObject('OF/Status In Progress/input_Advance - Pay'), '100')

String dateAdvance = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.sendKeys(findTestObject('OF/Status In Progress/input_First Advance Payment (deadline)'), dateAdvance)

WebUI.selectOptionByIndex(findTestObject('OF/Status In Progress/select_Installments'), 2)

'TO BE MADE'
not_run: WebUI.sendKeys(findTestObject('OF/Status In Progress/input_Interest'), '')

not_run: WebUI.click(findTestObject('OF/Status In Progress/Calculate'))

CustomKeywords.'checkers.RadioButton.OwnCompany'()

WebUI.selectOptionByIndex(findTestObject('OF/Status In Progress/select_Company'), 1)

CustomKeywords.'checkers.RadioButton.Warehouse'()

WebUI.selectOptionByValue(findTestObject('OF/Status In Progress/Warehouse/select_Warehouse'), findTestData('Warehouses').getValue(
        1, 4), false)

WebUI.scrollToElement(findTestObject('OF/input_Sale Offer'), 5)

WebUI.click(findTestObject('OF/input_Sale Offer'))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

