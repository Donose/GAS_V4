import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.delay(2)

WebUI.click(findTestObject('PO/PO from SD/input_Purchase InProgressSD'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.scrollToElement(findTestObject('PO/PO from SD/input_Add_offerPriceSD'), 20)

String price = Math.abs(new Random().nextInt() % 9999)

WebUI.sendKeys(findTestObject('PO/PO from SD/input_Add_offerPriceSD'), price)

WebUI.click(findTestObject('PO/input_Purchase Order_SendAprove'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('MainDashboard/Nav_Menu_Left/a_Purchase Orders'), 20)

WebDriver driverMD = DriverFactory.getWebDriver()

WebElement purchaseOrders = driverMD.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[28]/li/ul/li[1]/div/a')).click()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitBRButton_Element'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Waiters/WaitBRButton_Element'), 20)

WebUI.delay(2)

CustomKeywords.'linkers.Link_SD_FLOW_VENDOR.purchase_order'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('PO/input_Purchase Order_Approved'), 20)

WebUI.waitForElementClickable(findTestObject('PO/input_Purchase Order_Approved'), 20)

WebUI.delay(2)

WebUI.click(findTestObject('PO/input_Purchase Order_Approved'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitBRButton_Element'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Waiters/WaitBRButton_Element'), 20)

WebUI.delay(2)

CustomKeywords.'linkers.Link_SD_FLOW_VENDOR.purchase_order'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.setText(findTestObject('PO/PO from SD/input_Invoice_NumberSD'), String.valueOf(Math.abs(new Random().nextInt() % 9999) + 
        1))

String dateNow = CustomKeywords.'dates.DateGenerate.date'()

WebUI.setText(findTestObject('PO/PO from SD/input__form_DateInvoiceSD'), dateNow)

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('PO/PO from SD/input__UploadSD'), 
    'C:\\Users\\daniel.donose\\git\\GAS_V4\\Data Files\\toupload.pdf')

WebUI.scrollToElement(findTestObject('PO/PO from SD/input_Add_InvoicePriceSD'), 20)

WebUI.sendKeys(findTestObject('PO/PO from SD/input_Add_InvoicePriceSD'), price)

WebUI.click(findTestObject('PO/input_Purchase OrderClose'))

