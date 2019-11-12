import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.navigateToUrl('http://web7.egt-bg.ro:7955/?#!/warehouse/inbound_deliveries')

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitBRButton_Element'), 20)

CustomKeywords.'linkers.Link_SD_FLOW_IDless.inbound_delivery'()

WebUI.waitForElementVisible(findTestObject('Waiters/WaitIDCheckbox_Element'), 20)

WebUI.selectOptionByValue(findTestObject('ID/ID from SD/Create_GR/select_Generate'), 'goods_receipt', false)

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.selectOptionByValue(findTestObject('ID/ID from SD/Create_GR/select_Prio'), '2', false)

not_run: WebUI.selectOptionByLabel(findTestObject('ID/ID from SD/Create_GR/select_Supervisor'), 'Daniel Donose', false)

WebUI.click(findTestObject('ID/ID from SD/Create_GR/button_Create GR'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.click(findTestObject('ID/ID from SD/Create_GR/button_materialStatus'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.click(findTestObject('ID/ID from SD/Create_GR/button_materialOk'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.click(findTestObject('ID/ID from SD/Create_GR/input_CompleteHandover'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

not_run: WebUI.scrollToElement(findTestObject('ID/ID from SD/GR Close/input_SerialID'), 1, FailureHandling.OPTIONAL)

String randomNumbers = Math.abs(new Random().nextInt() % 9999)

WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_Delivery Company'), 'DHL')

not_run: String dateNow = CustomKeywords.'dates.DateGenerate.date'()

not_run: WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_Document from date_form'), dateNow)

not_run: CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('ID/ID from SD/GR Close/input_Attach Delivery Protocol'), 
    'C:\\\\Users\\\\daniel.donose\\\\git\\\\GAS_V4\\\\Data Files\\\\toupload.pdf')

WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_Delivery Responsible'), 'Curier_name')

WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_SerialID'), randomNumbers)

WebUI.setText(findTestObject('ID/ID from SD/GR Close/SerialNBhandover'), randomNumbers)

WebUI.scrollToElement(findTestObject('ID/ID from SD/GR Close/input_Close'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('ID/ID from SD/GR Close/a_Generate_pdfHandover'))

WebUI.delay(2)

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('ID/ID from SD/GR Close/input_Signed Handover_MUST'), 
    'C:\\\\Users\\\\daniel.donose\\\\git\\\\GAS_V4\\\\Data Files\\\\toupload.pdf')

WebUI.delay(2)

WebUI.click(findTestObject('ID/ID from SD/GR Close/input_Close'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.navigateToUrl('http://web7.egt-bg.ro:7955/?#!/main_dashboard')

