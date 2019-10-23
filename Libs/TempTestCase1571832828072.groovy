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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DANIEL~1.DON\\AppData\\Local\\Temp\\Katalon\\Test Cases\\SD FLOW Advance Pay\\SD FLOW PO\\20191023_151348\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.thoughtworks.selenium.webdriven.commands.KeyEvent as KeyEvent
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

not_run: WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

not_run: WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

not_run: WebUI.waitForElementClickable(findTestObject('Waiters/WaitButton_Element'), 20)

not_run: CustomKeywords.'linkers.Link.purchase_order'()

not_run: WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

not_run: WebUI.click(findTestObject('PO_SD/input_Purchase Order_InProgress'))

not_run: WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

not_run: WebUI.scrollToElement(findTestObject('PO_SD/input_OfferPrice'), 20)

not_run: String price = Math.abs(new Random().nextInt() % 9999)

not_run: WebUI.sendKeys(findTestObject('PO_SD/input_OfferPrice'), price)

not_run: WebUI.click(findTestObject('PO_SD/input_Purchase Order_SendAprove'))

not_run: WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

not_run: WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementClickable(findTestObject('Waiters/WaitButton_Element'), 20)

not_run: CustomKeywords.'linkers.Link.purchase_order'()

not_run: WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

not_run: WebUI.waitForElementVisible(findTestObject('PO_SD/input_Purchase Order_Approved'), 20)

not_run: WebUI.waitForElementClickable(findTestObject('PO_SD/input_Purchase Order_Approved'), 20)

not_run: WebUI.click(findTestObject('PO_SD/input_Purchase Order_Approved'))

not_run: WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

not_run: WebUI.waitForElementVisible(findTestObject('Waiters/WaitBRButton_Element'), 20, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementClickable(findTestObject('Waiters/WaitBRButton_Element'), 20)

not_run: CustomKeywords.'linkers.Link.purchase_order'()

not_run: WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.sendKeys(findTestObject('PO_SD/input_Invoice_Number'), String.valueOf(Math.abs(new Random().nextInt() % 9999) + 1))

String dateNow = CustomKeywords.'dates.DateGenerate.date'()

WebUI.setText(findTestObject('PO_SD/input__Date'), dateNow)

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('PO_SD/input__Upload'), 'C:\\\\Users\\\\daniel.donose\\\\git\\\\GAS_V4\\\\Data Files\\\\toupload.pdf')

WebUI.sendKeys(findTestObject('PO_SD/input_PriceInvoice'), price)

WebUI.click(findTestObject('PO_SD/input_Purchase OrderClose'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebDriver driverMD = DriverFactory.getWebDriver()

WebElement mainDashboard = driverMD.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[7]/li/div/a')).click()

''', 'Test Cases/SD FLOW Advance Pay/SD FLOW PO', new TestCaseBinding('Test Cases/SD FLOW Advance Pay/SD FLOW PO',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
