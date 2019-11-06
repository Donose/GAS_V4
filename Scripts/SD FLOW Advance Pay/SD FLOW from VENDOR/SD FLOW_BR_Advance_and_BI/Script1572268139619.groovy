import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

String waitLoad = 'Waiters/WaitLoadingAnim_Element'

String waitButton = 'Waiters/WaitBRButton_Element'

WebDriver driver = DriverFactory.getWebDriver()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementVisible(findTestObject(waitLoad), 20)

WebElement plus = driver.findElement(By.xpath(' /html/body/div[4]/div[3]/div/div/ul[29]/li/div/button/b')).click()

WebUI.waitForElementVisible(findTestObject('Waiters/WaitBillingReq_Element'), 20)

WebElement billing = driver.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[29]/li/ul/li[1]/div/a')).click()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitButton), 20)

CustomKeywords.'linkers.Link_SD_FLOW_VENDOR.billing_request'()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitBRCheckbox_Element'), 20)

WebUI.selectOptionByLabel(findTestObject('BR/select_Generate Billing'), findTestData('DropDowns').getValue(8, 1), false)

WebUI.click(findTestObject('BR/input_InProgress'))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

'This must be saved/ future'
WebUI.setText(findTestObject('BI/input__form_invoiceNR'), String.valueOf(Math.abs(new Random().nextInt() % 9999) + 1))

String dateNow = CustomKeywords.'dates.DateGenerate.date'()

WebUI.setText(findTestObject('BI/input__form_DATE'), dateNow)

WebUI.selectOptionByLabel(findTestObject('BI/select_incomeType'), 'Sales Incomes', false)

'Disabled'
WebUI.selectOptionByLabel(findTestObject('BI/select_transactionDetails'), 'Advance Sales', false)

'Disabled'
WebUI.selectOptionByLabel(findTestObject('BI/select_cashBox'), 'ING Bank', false)

WebUI.selectOptionByLabel(findTestObject('BI/select_documentType'), 'Receipt', false)

'Disabled\r\n'
WebUI.selectOptionByLabel(findTestObject('BI/select_paymentMethod'), 'Bank Transfer', false)

WebUI.selectOptionByLabel(findTestObject('BI/select_accountingDivision'), 'Sales Romania Division', false)

WebUI.click(findTestObject('BI/input_Billing'))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebDriver driverMD = DriverFactory.getWebDriver()

WebElement mainDashboard = driverMD.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[7]/li/div/a')).click()

