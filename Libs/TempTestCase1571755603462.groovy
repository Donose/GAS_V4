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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DANIEL~1.DON\\AppData\\Local\\Temp\\Katalon\\Test Cases\\SD FLOW Advance Pay\\SD FLOW Purchase_req\\20191022_174643\\execution.properties')

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

not_run: WebUI.waitForElementVisible(findTestObject('Waiters/WaitPurchaseModule_Element'), 20)

not_run: WebDriver openPurchase = DriverFactory.getWebDriver()

not_run: WebElement plus = openPurchase.findElement(By.xpath('html/body/div[4]/div[3]/div/div/ul[28]/li/div/button/b')).click()

not_run: WebUI.waitForElementVisible(findTestObject('Waiters/WaitPurchaseReq_Element'), 20)

not_run: WebDriver openPOR = DriverFactory.getWebDriver()

not_run: WebElement por = openPOR.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[28]/li/ul/li[2]/div/a')).click()

not_run: WebUI.waitForElementVisible(findTestObject('Waiters/WaitBRButton_Element'), 20)

CustomKeywords.'linkers.Link.purchase_req'()

WebUI.selectOptionByValue(findTestObject('POR/select_Purchase Order'), findTestData('DropDowns').getValue(8, 4), false)

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.STOP_ON_FAILURE)

'Priority dropboxes have difrent values in the system'
WebUI.selectOptionByIndex(findTestObject('POR/From SD/select_prio'), 1)

String dateFuture = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.setText(findTestObject('POR/From SD/input_Deadline'), dateFuture)

WebUI.click(findTestObject('POR/From SD/input_Purchase Create'))

WebUI.waitForElementVisible(findTestObject('Waiters/WaitNotification_Element'), 20, FailureHandling.STOP_ON_FAILURE)

not_run: WebDriver driverPO = DriverFactory.getWebDriver()

not_run: String NotificationPO = driverPO.findElement(By.xpath('/html/body/div[4]/div[1]')).getText().substring(15, 18)

not_run: println(NotificationPO)

not_run: CustomKeywords.'outputExcel.NotificationOutput.writePO'('PO-' + NotificationPO, 'Purchase order')

''', 'Test Cases/SD FLOW Advance Pay/SD FLOW Purchase_req', new TestCaseBinding('Test Cases/SD FLOW Advance Pay/SD FLOW Purchase_req',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
