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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DANIEL~1.DON\\AppData\\Local\\Temp\\Katalon\\Test Cases\\SD FLOW Advance Pay\\SD FLOW_Offer_Confirmations\\20191025_161922\\execution.properties')

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

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link.offer'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('OF/Status Sale Confirmation/Sale Director/input_Sale Offer_director'), 20)

WebUI.waitForElementClickable(findTestObject('OF/Status Sale Confirmation/Sale Director/input_Sale Offer_director'), 20)

WebUI.click(findTestObject('OF/Status Sale Confirmation/Sale Director/input_Sale Offer_director'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link.offer'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('OF/Status Sale Confirmation/EGT Romania Director/input_Sale Offer_RODirector'), 
    20)

WebUI.waitForElementClickable(findTestObject('OF/Status Sale Confirmation/EGT Romania Director/input_Sale Offer_RODirector'), 
    20)

WebUI.click(findTestObject('OF/Status Sale Confirmation/EGT Romania Director/input_Sale Offer_RODirector'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link.offer'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('OF/Status Sale Confirmation/EGT Bulgaria Director/input_Sale Offer_BGDirector'), 
    20)

WebUI.waitForElementClickable(findTestObject('OF/Status Sale Confirmation/EGT Bulgaria Director/input_Sale Offer_BGDirector'), 
    20)

WebUI.click(findTestObject('OF/Status Sale Confirmation/EGT Bulgaria Director/input_Sale Offer_BGDirector'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.waitForElementClickable(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.delay(1)

CustomKeywords.'linkers.Link.offer'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('OF/Status Sale Confirmation/Client/input_Sale Offer_Client'), 20)

WebUI.waitForElementClickable(findTestObject('OF/Status Sale Confirmation/Client/input_Sale Offer_Client'), 20)

WebUI.click(findTestObject('OF/Status Sale Confirmation/Client/input_Sale Offer_Client'))

''', 'Test Cases/SD FLOW Advance Pay/SD FLOW_Offer_Confirmations', new TestCaseBinding('Test Cases/SD FLOW Advance Pay/SD FLOW_Offer_Confirmations',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
