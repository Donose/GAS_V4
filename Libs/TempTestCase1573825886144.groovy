import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\DANIEL~1.DON\\AppData\\Local\\Temp\\Katalon\\Test Cases\\SD FLOW\\SD FLOW SN_FN\\SD FLOW ID_GI_GR_SN_FN_Passport\\20191115_155126\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

not_run: WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

not_run: WebUI.navigateToUrl('http://web7.egt-bg.ro:7955/?#!/warehouse/inbound_deliveries')

not_run: WebUI.waitForElementVisible(findTestObject('Waiters/WaitBRButton_Element'), 20)

not_run: CustomKeywords.'linkers.Link_SD_FLOW.inbound_delivery'()

not_run: WebUI.waitForElementVisible(findTestObject('Waiters/WaitIDCheckbox_Element'), 20)

not_run: WebUI.selectOptionByValue(findTestObject('ID/ID from SD/Create_GR/select_Generate'), 'goods_receipt', false)

not_run: WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.selectOptionByValue(findTestObject('ID/ID from SD/Create_GR/select_Prio'), '2', false)

not_run: WebUI.selectOptionByLabel(findTestObject('ID/ID from SD/Create_GR/select_Supervisor'), 'Daniel Donose', false)

WebUI.click(findTestObject('ID/ID from SD/Create_GR/button_Create GR'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.click(findTestObject('ID/ID from SD/Serial Numbers/button_Materials'))

WebUI.setText(findTestObject('ID/ID from SD/Serial Numbers/input_FactoryNumber'), 'FactoryNumber_inboundID: ' + findTestData(
        'SQL Process numbers SD FLOW').getValue(10, 1))

WebUI.setText(findTestObject('ID/ID from SD/Serial Numbers/input_SerialNumber'), 'SerialNumber_inboundID: ' + findTestData(
        'SQL Process numbers SD FLOW').getValue(10, 1))

not_run: WebUI.waitForElementVisible(findTestObject('ID/ID from SD/Serial Numbers/button_FillPassport'), 20)

not_run: WebUI.click(findTestObject('ID/ID from SD/Serial Numbers/button_FillPassport'))

not_run: String datePast = CustomKeywords.'dates.DateGenerate.dateWeekAgo'()

not_run: WebUI.setText(findTestObject('ID/ID from SD/Passport/input_Fabrication Date'), datePast)

not_run: WebUI.setText(findTestObject('ID/ID from SD/Passport/input_FN'), 'This_will_be_material_name_now_meeting:  ' + 
    findTestData('SQL Process numbers SD FLOW').getValue(1, 1))

not_run: WebUI.setText(findTestObject('ID/ID from SD/Passport/input_SN'), 'This_will_be_material_name_now_offer: ' + findTestData(
        'SQL Process numbers SD FLOW').getValue(2, 1))

not_run: WebUI.setText(findTestObject('ID/ID from SD/Passport/input_FN2'), 'This_will_be_material_name_now_contract ' + 
    findTestData('SQL Process numbers SD FLOW').getValue(3, 1))

not_run: WebUI.setText(findTestObject('ID/ID from SD/Passport/input_SN2'), 'This_will_be_material_name_now_billingreq ' + 
    findTestData('SQL Process numbers SD FLOW').getValue(4, 1))

not_run: WebUI.click(findTestObject('ID/ID from SD/Passport/button_Finish customization'))

not_run: WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

not_run: WebUI.delay(1)

WebUI.click(findTestObject('ID/ID from SD/Serial Numbers/button_OK'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementClickable(findTestObject('ID/ID from SD/Create_GR/input_CompleteHandover'), 20)

WebUI.delay(5)

WebUI.click(findTestObject('ID/ID from SD/Create_GR/input_CompleteHandover'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

not_run: WebUI.scrollToElement(findTestObject('ID/ID from SD/GR Close/input_SerialID'), 1, FailureHandling.OPTIONAL)

String randomNumbers = Math.abs(new Random().nextInt() % 9999)

WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_Delivery Company'), 'DHL')

not_run: String dateNow = CustomKeywords.'dates.DateGenerate.date'()

not_run: WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_Document from date_form'), dateNow)

not_run: CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('ID/ID from SD/GR Close/input_Attach Delivery Protocol'), 
    'C:\\\\\\\\Users\\\\\\\\daniel.donose\\\\\\\\git\\\\\\\\GAS_V4\\\\\\\\Data Files\\\\\\\\toupload.pdf')

WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_Delivery Responsible'), 'Curier_name')

WebUI.setText(findTestObject('ID/ID from SD/GR Close/input_SerialID'), randomNumbers)

WebUI.setText(findTestObject('ID/ID from SD/GR Close/SerialNBhandover'), randomNumbers)

WebUI.scrollToElement(findTestObject('ID/ID from SD/GR Close/input_Close'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('ID/ID from SD/GR Close/a_Generate_pdfHandover'))

WebUI.delay(2)

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('ID/ID from SD/GR Close/input_Signed Handover_MUST'), 
    'C:\\\\\\\\Users\\\\\\\\daniel.donose\\\\\\\\git\\\\\\\\GAS_V4\\\\\\\\Data Files\\\\\\\\toupload.pdf')

WebUI.delay(2)

WebUI.click(findTestObject('ID/ID from SD/GR Close/input_Close'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.navigateToUrl('http://web7.egt-bg.ro:7955/?#!/main_dashboard')

''', 'Test Cases/SD FLOW/SD FLOW SN_FN/SD FLOW ID_GI_GR_SN_FN_Passport', new TestCaseBinding('Test Cases/SD FLOW/SD FLOW SN_FN/SD FLOW ID_GI_GR_SN_FN_Passport',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
