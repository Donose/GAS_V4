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


RunConfiguration.setExecutionSettingFile('C:\\Users\\donos\\AppData\\Local\\Temp\\Katalon\\Test Cases\\SD FLOW\\SD FLOW Purchase_req\\20191015_213506\\execution.properties')

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

not_run: WebUI.scrollToPosition(0, 0, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebDriver openPurchase = DriverFactory.getWebDriver()

WebElement plus = openPurchase.findElement(By.xpath('html/body/div[4]/div[3]/div/div/ul[28]/li/div/button/b')).click()

WebUI.delay(1)

WebDriver openPOR = DriverFactory.getWebDriver()

WebElement por = openPOR.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[28]/li/ul/li[2]/div/a')).click()

WebUI.delay(5)

CustomKeywords.'linkers.Link.purchaseReq'()

WebUI.selectOptionByIndex(findTestObject('POR/select_Purchase Order'), 1)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('POR/From SD/select_prio'), 1)

String dateFuture = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.setText(findTestObject('POR/From SD/input_Deadline'), dateFuture)

WebUI.click(findTestObject('POR/From SD/input_Purchase Create'))

WebUI.delay(1)

WebDriver driverPO = DriverFactory.getWebDriver()

String NotificationPO = driverPO.findElement(By.xpath('/html/body/div[4]/div[1]')).getText().substring(15, 18)

println(NotificationPO)

CustomKeywords.'outputExcel.NotificationOutput.writePO'('PO-' + NotificationPO, 'Purchase order')

''', 'Test Cases/SD FLOW/SD FLOW Purchase_req', new TestCaseBinding('Test Cases/SD FLOW/SD FLOW Purchase_req',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
