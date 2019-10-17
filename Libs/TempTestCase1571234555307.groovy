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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DANIEL~1.DON\\AppData\\Local\\Temp\\Katalon\\Test Cases\\POR\\POR\\20191016_170235\\execution.properties')

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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

not_run: CustomKeywords.'mainDashboardSelections.Selectors.selectPOR'()

not_run: WebUI.selectOptionByIndex(findTestObject('POR/New POR/select_Prio'), 1)

WebUI.selectOptionByIndex(findTestObject('POR/New POR/select_Department'), 6)

'will be replaced by test data'
WebUI.selectOptionByLabel(findTestObject('POR/New POR/select_wh'), 'Warehouse number 1', false)

WebUI.selectOptionByIndex(findTestObject('POR/New POR/select_Supervisor'), 2)

String dateFuture = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.setText(findTestObject('POR/New POR/input_Deadline'), dateFuture)

WebUI.click(findTestObject('POR/New POR/span_Select material'))

'will be replaced by test data'
WebUI.setText(findTestObject('POR/New POR/input_Select material'), 'Gaming_machine2')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('POR/New POR/input_Select material'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('POR/New POR/input_QTT'), '2')

WebUI.selectOptionByIndex(findTestObject('POR/New POR/select_Reason'), 9)

WebUI.selectOptionByIndex(findTestObject('POR/New POR/select_Type'), 1)

'not working'
WebUI.getText(findTestObject('POR/New POR/input_AveragePriceEURO'))

WebUI.click(findTestObject('POR/New POR/input_Purchase Requisition'))

WebUI.delay(1)

WebDriver driverPOR = DriverFactory.getWebDriver()

String NotificationPOR = driverPOR.findElement(By.xpath('/html/body/div[4]/div[1]')).getText().substring(0, 7)

println(NotificationPOR)

''', 'Test Cases/POR/POR', new TestCaseBinding('Test Cases/POR/POR',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
