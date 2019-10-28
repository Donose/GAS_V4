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

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'linkers.Link_SD_FLOW_VENDOR.offer'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('OF/Status Open/input_Sale Offer_Open'), 20)

WebUI.waitForElementClickable(findTestObject('OF/Status Open/input_Sale Offer_Open'), 20)

WebUI.click(findTestObject('OF/Status Open/input_Sale Offer_Open'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

String date = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.sendKeys(findTestObject('OF/Status In Progress/input_Offer Validity_Date'), date)

'TO BE MADE'
not_run: WebUI.sendKeys(findTestObject('OF/Status In Progress/input_Discount'), '')

WebUI.sendKeys(findTestObject('OF/Status In Progress/input_Advance - Pay'), '50')

String dateAdvance = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.sendKeys(findTestObject('OF/Status In Progress/input_First Advance Payment (deadline)'), dateAdvance)

WebUI.selectOptionByIndex(findTestObject('OF/Status In Progress/select_Installments'), 5)

'TO BE MADE'
not_run: WebUI.sendKeys(findTestObject('OF/Status In Progress/input_Interest'), '')

WebUI.click(findTestObject('OF/Status In Progress/Calculate'))

CustomKeywords.'checkers.RadioButton.OwnCompany'()

WebUI.selectOptionByIndex(findTestObject('OF/Status In Progress/select_Company'), 1)

CustomKeywords.'checkers.RadioButton.Warehouse'()

WebUI.selectOptionByValue(findTestObject('OF/Status In Progress/Warehouse/select_Warehouse'), findTestData('Warehouses').getValue(
        1, 49), false)

WebUI.click(findTestObject('OF/Status In Progress/input_Sale Offer_SendForConfirmation'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)
