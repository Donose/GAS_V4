import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\DANIEL~1.DON\\AppData\\Local\\Temp\\Katalon\\Test Cases\\SD FLOW\\SD FLOW_Offer\\20191009_143844\\execution.properties')

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

not_run: CustomKeywords.'checkers.TextCheckOF.checkMyTxt'()

not_run: WebUI.click(findTestObject('SO/Status Open/input_Sale Offer_Open'))

not_run: WebUI.delay(2)

not_run: String date = CustomKeywords.'dates.DateGenerate.dateWeek'()

not_run: WebUI.sendKeys(findTestObject('SO/Status In Progress/input_Offer Validity_Date'), date)

'TO BE MADE'
not_run: WebUI.sendKeys(findTestObject('SO/Status In Progress/input_Discount'), '')

not_run: WebUI.sendKeys(findTestObject('SO/Status In Progress/input_Advance - Pay'), '20')

not_run: String dateAdvance = CustomKeywords.'dates.DateGenerate.dateWeek'()

not_run: WebUI.sendKeys(findTestObject('SO/Status In Progress/input_First Advance Payment (deadline)'), dateAdvance)

not_run: WebUI.selectOptionByIndex(findTestObject('SO/Status In Progress/select_Installments'), 5)

'TO BE MADE'
not_run: WebUI.sendKeys(findTestObject('SO/Status In Progress/input_Interest'), '')

not_run: WebUI.click(findTestObject('SO/Status In Progress/Calculate'))

not_run: CustomKeywords.'checkers.RadioButton.OwnCompany'()

not_run: WebUI.selectOptionByIndex(findTestObject('SO/Status In Progress/select_Company'), 1)

not_run: CustomKeywords.'checkers.RadioButton.Warehouse'()

WebUI.selectOptionByLabel(findTestObject('SO/Status In Progress/Warehouse/select_Warehouse'), 'Warehouse number 1', false)

WebUI.click(findTestObject('SO/Status In Progress/input_Sale Offer_SendForConfirmation'))

WebUI.delay(5)

''', 'Test Cases/SD FLOW/SD FLOW_Offer', new TestCaseBinding('Test Cases/SD FLOW/SD FLOW_Offer',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
