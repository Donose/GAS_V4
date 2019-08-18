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


RunConfiguration.setExecutionSettingFile('C:\\Users\\donos\\AppData\\Local\\Temp\\Katalon\\Test Cases\\POR\\20190818_200603\\execution.properties')

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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.apache.commons.lang.RandomStringUtils as RandStr
import java.util.Random as Random

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://82.76.235.88:7946/?#!/')

not_run: CustomKeywords.'randomNumber.generateNumber.createPor'()

not_run: CustomKeywords.'randomNumber.generateNumber.selectSuperv'()

not_run: CustomKeywords.'randomNumber.generateNumber.selectDepartment'()

not_run: CustomKeywords.'randomNumber.generateNumber.selectPrio'()

not_run: CustomKeywords.'randomNumber.generateNumber.selectProvider'()

not_run: WebUI.selectOptionByLabel(findTestObject('POR/select_WH'), 'Warehouse number 1', false)

not_run: CustomKeywords.'randomNumber.generateNumber.inputDeadline'()

CustomKeywords.'randomNumber.generateNumber.selectMaterial'()

WebUI.takeScreenshot()

''', 'Test Cases/POR', new TestCaseBinding('Test Cases/POR',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
