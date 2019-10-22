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

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitSDModule_Element'), 20)

WebDriver bilingOpen = DriverFactory.getWebDriver()

WebElement plus = bilingOpen.findElement(By.xpath(' /html/body/div[4]/div[3]/div/div/ul[29]/li/div/button/b')).click()

WebUI.waitForElementVisible(findTestObject('Waiters/WaitBillingReq_Element'), 20)

WebDriver billingElem = DriverFactory.getWebDriver()

WebElement billing = billingElem.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[29]/li/ul/li[1]/div/a')).click()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitBRButton_Element'), 20)

CustomKeywords.'linkers.Link.billing_request'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitBRCheckbox_Element'), 20)

WebUI.selectOptionByLabel(findTestObject('BR/select_Generate Billing'), findTestData('DropDowns').getValue(8, 1), false)

WebUI.click(findTestObject('BR/input_InProgress'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.CONTINUE_ON_FAILURE)

'This must be saved/ future'
WebUI.setText(findTestObject('BI/input__form_invoiceNR'), String.valueOf(Math.abs(new Random().nextInt() % 9999) + 1))

String invoiceDateNow = CustomKeywords.'dates.DateGenerate.date'()

WebUI.setText(findTestObject('BI/input__form_DATE'), invoiceDateNow)

WebUI.selectOptionByLabel(findTestObject('BI/select_BANK'), findTestData('DropDowns').getValue(9, 1), false)

'Disabled'
not_run: WebUI.selectOptionByLabel(findTestObject('BI/select_TYPE'), findTestData('DropDowns').getValue(10, 2), false)

'Disabled'
WebUI.selectOptionByLabel(findTestObject('BI/select_AccountingDivision'), findTestData('DropDowns').getValue(11, 2), false)

WebUI.selectOptionByLabel(findTestObject('BI/select_CURRENCY'), findTestData('DropDowns').getValue(12, 2), false)

'Disabled\r\n'
not_run: WebUI.selectOptionByLabel(findTestObject('BI/select_PaymentMethod'), findTestData('DropDowns').getValue(13, 3), 
    false)

WebUI.click(findTestObject('BI/input_Billing'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebDriver driverMD = DriverFactory.getWebDriver()

WebElement mainDashboard = driverMD.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[7]/li/div/a')).click()

