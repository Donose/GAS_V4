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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DANIEL~1.DON\\AppData\\Local\\Temp\\Katalon\\Test Cases\\SD FLOW Advance Pay\\SD FLOW_Offer\\20191025_105157\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

not_run: WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20, FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'linkers.Link.offer'()

not_run: WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

not_run: WebUI.waitForElementVisible(findTestObject('SO/Status Open/input_Sale Offer_Open'), 20)

not_run: WebUI.waitForElementClickable(findTestObject('SO/Status Open/input_Sale Offer_Open'), 20)

not_run: WebUI.click(findTestObject('SO/Status Open/input_Sale Offer_Open'))

not_run: WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

not_run: String date = CustomKeywords.'dates.DateGenerate.dateWeek'()

not_run: WebUI.sendKeys(findTestObject('SO/Status In Progress/input_Offer Validity_Date'), date)

'TO BE MADE'
not_run: WebUI.sendKeys(findTestObject('SO/Status In Progress/input_Discount'), '')

not_run: WebUI.sendKeys(findTestObject('SO/Status In Progress/input_Advance - Pay'), '50')

not_run: String dateAdvance = CustomKeywords.'dates.DateGenerate.dateWeek'()

not_run: WebUI.sendKeys(findTestObject('SO/Status In Progress/input_First Advance Payment (deadline)'), dateAdvance)

not_run: WebUI.selectOptionByIndex(findTestObject('SO/Status In Progress/select_Installments'), 5)

'TO BE MADE'
not_run: WebUI.sendKeys(findTestObject('SO/Status In Progress/input_Interest'), '')

not_run: WebUI.click(findTestObject('SO/Status In Progress/Calculate'))

not_run: CustomKeywords.'checkers.RadioButton.OwnCompany'()

not_run: WebUI.selectOptionByIndex(findTestObject('SO/Status In Progress/select_Company'), 1)

not_run: CustomKeywords.'checkers.RadioButton.Warehouse'()

WebUI.selectOptionByValue(findTestObject('SO/Status In Progress/Warehouse/select_Warehouse'), findTestData('Warehouses').getValue(
        1, 49), false)

WebUI.click(findTestObject('SO/Status In Progress/input_Sale Offer_SendForConfirmation'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

''', 'Test Cases/SD FLOW Advance Pay/SD FLOW_Offer', new TestCaseBinding('Test Cases/SD FLOW Advance Pay/SD FLOW_Offer',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
