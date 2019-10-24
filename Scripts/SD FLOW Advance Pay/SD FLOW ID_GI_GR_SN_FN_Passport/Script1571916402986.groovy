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

WebDriver driverWH = DriverFactory.getWebDriver()

WebElement mainDashboard = driverWH.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[32]/li/div/button/b')).click()

WebUI.delay(1)

WebDriver driverID = DriverFactory.getWebDriver()

WebElement inboundDelevery = driverID.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[32]/li/ul/li[2]/div/a')).click()

WebUI.waitForElementVisible(findTestObject('Waiters/WaitBRButton_Element'), 20)

CustomKeywords.'linkers.Link.inbound_delivery'()

WebUI.waitForElementVisible(findTestObject('Waiters/WaitIDCheckbox_Element'), 20)

WebUI.selectOptionByValue(findTestObject('ID/ID from SD/Create_GR/select_Generate'), 'goods_receipt', false)

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.selectOptionByValue(findTestObject('ID/ID from SD/Create_GR/select_Prio'), '2', false)

WebUI.selectOptionByLabel(findTestObject('ID/ID from SD/Create_GR/select_Supervisor'), 'Daniel Donose', false)

WebUI.click(findTestObject('ID/ID from SD/Create_GR/button_Create GR'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.click(findTestObject('ID/ID from SD/Serial Numbers/button_Materials'))

WebUI.setText(findTestObject('ID/ID from SD/Serial Numbers/input_FactoryNumber'), 'FactoryNumber_inboundID: ' + findTestData(
        'SQL Process numbers SD FLOW').getValue(10, 1))

WebUI.setText(findTestObject('ID/ID from SD/Serial Numbers/input_SerialNumber'), 'SerialNumber_inboundID: ' + findTestData(
        'SQL Process numbers SD FLOW').getValue(10, 1))

WebUI.waitForElementVisible(findTestObject('ID/ID from SD/Serial Numbers/button_FillPassport'), 20)

WebUI.click(findTestObject('ID/ID from SD/Serial Numbers/button_FillPassport'))

String datePast = CustomKeywords.'dates.DateGenerate.dateWeekAgo'()

WebUI.setText(findTestObject('ID/ID from SD/Passport/input_Fabrication Date'), datePast)

WebUI.setText(findTestObject('ID/ID from SD/Passport/input_FN'), 'This_will_be_material_name_now_meeting:  ' + findTestData(
        'SQL Process numbers SD FLOW').getValue(1, 1))

WebUI.setText(findTestObject('ID/ID from SD/Passport/input_SN'), 'This_will_be_material_name_now_offer: ' + findTestData(
        'SQL Process numbers SD FLOW').getValue(2, 1))

WebUI.setText(findTestObject('ID/ID from SD/Passport/input_FN2'), 'This_will_be_material_name_now_contract ' + findTestData(
        'SQL Process numbers SD FLOW').getValue(3, 1))

WebUI.setText(findTestObject('ID/ID from SD/Passport/input_SN2'), 'This_will_be_material_name_now_billingreq ' + findTestData(
        'SQL Process numbers SD FLOW').getValue(4, 1))

WebUI.click(findTestObject('ID/ID from SD/Passport/button_Finish customization'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('ID/ID from SD/Serial Numbers/button_OK'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementClickable(findTestObject('ID/ID from SD/Create_GR/input_CompleteHandover'), 20)

WebUI.delay(5)

WebUI.click(findTestObject('ID/ID from SD/Create_GR/input_CompleteHandover'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.scrollToElement(findTestObject('ID/ID from SD/GR Close/input_SerialID'), 20)

String randomNumbers = Math.abs(new Random().nextInt() % 9999)

WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_Number of document'), randomNumbers)

String dateNow = CustomKeywords.'dates.DateGenerate.date'()

WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_Document from date_form'), dateNow)

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('ID/ID from SD/GR Close/input_Attach Delivery Protocol'), 
    'C:\\\\Users\\\\daniel.donose\\\\git\\\\GAS_V4\\\\Data Files\\\\toupload.pdf')

WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_Delivery Company'), 'DHL')

WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_Delivery Responsible'), 'Curier_name')

WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_SerialID'), randomNumbers)

WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_NumberID'), randomNumbers)

WebUI.scrollToElement(findTestObject('ID/ID from SD/GR Close/input_Close'), 20)

WebUI.click(findTestObject('ID/ID from SD/GR Close/a_Generate_pdfHandover'))

WebUI.delay(2)

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('ID/ID from SD/GR Close/input_Signed Handover_MUST'), 
    'C:\\\\Users\\\\daniel.donose\\\\git\\\\GAS_V4\\\\Data Files\\\\toupload.pdf')

WebUI.delay(2)

WebUI.click(findTestObject('ID/ID from SD/GR Close/input_Close'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.scrollToPosition(0, 0)

WebDriver driverMD2 = DriverFactory.getWebDriver()

WebElement mainDashboard2 = driverMD2.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[7]/li/div/a')).click()

