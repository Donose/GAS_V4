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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DANIEL~1.DON\\AppData\\Local\\Temp\\Katalon\\Test Cases\\SD FLOW\\SD FLOW_Meeting\\20191014_144445\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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
not_run: WebUI.waitForElementPresent(findTestObject('MainDashboard/Nav_Menu_Top/a_SD'), 10)

CustomKeywords.'mainDashboardSelections.Selectors.selectSDMeeting'()

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('ME/select_me_prio'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ME/span_Company name'))

WebUI.setText(findTestObject('ME/input_Company name'), 'COMPANY TEST', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('ME/input_Company name'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ME/span_Contact name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ME/input_Contact name'), 'admin1')

WebUI.sendKeys(findTestObject('ME/input_Contact name'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByIndex(findTestObject('ME/select_Meeting'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('ME/select_Deal'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('ME/select_Location'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('ME/select_Opportunity'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('ME/select_Purpose'), 1, FailureHandling.STOP_ON_FAILURE)

String dateCurrent = CustomKeywords.'dates.DateGenerate.date'()

WebUI.setText(findTestObject('Object Repository/ME/DatePick/input_Meeting date'), dateCurrent, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ME/Client Products/span_Client interested in products'), 5)

WebUI.setText(findTestObject('ME/Client Products/input_Quantty'), '4')

WebUI.click(findTestObject('ME/Client Products/span_Select material'))

WebUI.setText(findTestObject('ME/Client Products/input_Materials'), 'Gaming_machine1')

WebUI.sendKeys(findTestObject('ME/Client Products/input_Materials'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByIndex(findTestObject('ME/Client Products/select_DealTypeForMaterial'), 1)

String dateFuture = CustomKeywords.'dates.DateGenerate.dateWeek'()

not_run: WebUI.setText(findTestObject('ME/Client Products/input_Prefer Delivery Date'), dateFuture)

WebUI.click(findTestObject('ME/button_Create Offer'))

WebUI.delay(1)

WebDriver notificationME = DriverFactory.getWebDriver()

String NotificationME = notificationME.findElement(By.xpath('/html/body/div[4]/div[1]')).getText().substring(8, 14)

println(NotificationME)

CustomKeywords.'outputExcel.NotificationOutput.write'(NotificationME, 'Meeting')

''', 'Test Cases/SD FLOW/SD FLOW_Meeting', new TestCaseBinding('Test Cases/SD FLOW/SD FLOW_Meeting',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
