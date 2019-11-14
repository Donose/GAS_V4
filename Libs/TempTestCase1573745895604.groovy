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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DANIEL~1.DON\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Manual Processes\\ID\\20191114_173815\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

for (int i = 0; i = 50; i++) {
    WebUI.waitForElementVisible(findTestObject('MainDashboard/Nav_Menu_Top/a_Warehouse'), 20)

    CustomKeywords.'mainDashboardSelections.Selectors.selectWHinboundAdd'()

    WebUI.selectOptionByValue(findTestObject('ID/ID Manual/select_Prio'), '2', false)

    WebUI.selectOptionByLabel(findTestObject('ID/ID Manual/select_Wh'), findTestData('Warehouses').getValue(2, 6), false)

    WebUI.selectOptionByLabel(findTestObject('ID/ID Manual/select_Type'), 'Provider Company', false)

    WebUI.click(findTestObject('ID/ID Manual/span_Select provider'))

    WebUI.setText(findTestObject('ID/ID Manual/input_Select provider'), findTestData('Provider Company').getValue(2, 1))

    WebUI.sendKeys(findTestObject('ID/ID Manual/input_Select provider'), Keys.chord(Keys.ENTER))

    not_run: WebUI.click(findTestObject('ID/ID Manual/span_Select client'))

    not_run: WebUI.setText(findTestObject('ID/ID Manual/input_Select client'), variable)

    not_run: WebUI.sendKeys(findTestObject('ID/ID Manual/input_Select client'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('ID/ID Manual/span_Select_Material_ID'))

    WebUI.setText(findTestObject('ID/ID Manual/input_Material_ID'), findTestData('Materials').getValue(2, 1))

    WebUI.sendKeys(findTestObject('ID/ID Manual/input_Material_ID'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('ID/ID Manual/input_Qtty'), '10')

    WebUI.selectOptionByValue(findTestObject('ID/ID Manual/select_Reason'), '8', false)

    WebUI.selectOptionByValue(findTestObject('ID/ID Manual/select_Acquisition_Type'), '0', false)

    WebUI.setText(findTestObject('ID/ID Manual/textarea_Comments'), 'This is MANUAL ID automated')

    WebUI.click(findTestObject('ID/ID Manual/input_Inbound Delivery_Close'))
}

''', 'Test Cases/Manual Processes/ID', new TestCaseBinding('Test Cases/Manual Processes/ID',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
