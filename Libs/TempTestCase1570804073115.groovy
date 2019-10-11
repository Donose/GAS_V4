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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DANIEL~1.DON\\AppData\\Local\\Temp\\Katalon\\Test Cases\\SD FLOW\\SD FLOW_Offer_Confirmations\\20191011_172753\\execution.properties')

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

not_run: WebUI.delay(5)

CustomKeywords.'linkers.Link.offer'()

WebUI.delay(5)

WebUI.click(findTestObject('SO/Status Sale Confirmation/Sale Director/input_Sale Offer_director'))

WebUI.delay(5)

CustomKeywords.'linkers.Link.offer'()

WebUI.delay(5)

WebUI.click(findTestObject('SO/Status Sale Confirmation/EGT Romania Director/input_Sale Offer_RODirector'))

WebUI.delay(5)

CustomKeywords.'linkers.Link.offer'()

WebUI.delay(5)

WebUI.click(findTestObject('SO/Status Sale Confirmation/EGT Bulgaria Director/input_Sale Offer_BGDirector'))

WebUI.delay(5)

CustomKeywords.'linkers.Link.offer'()

WebUI.click(findTestObject('SO/Status Sale Confirmation/Client/input_Sale Offer_Client'))

WebUI.delay(5)

''', 'Test Cases/SD FLOW/SD FLOW_Offer_Confirmations', new TestCaseBinding('Test Cases/SD FLOW/SD FLOW_Offer_Confirmations',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
