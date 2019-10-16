import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.reader.ExcelFactory

vendors = ExcelFactory.getExcelDataWithDefaultSheet('./Data Files/Providers.xlsx', 'Sheet1', true)
int count = 20
for (int i = 1; i <=count; i++) {
    WebUI.delay(1)

    WebUI.click(findTestObject('VendorAdd/a_Add Vendor'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('VendorAdd/input_Company Name_inputText'), findTestData('Vendors').getValue(1, i))

    WebUI.setText(findTestObject('VendorAdd/input_Brand Name'), findTestData('Vendors').getValue(2, i++))

    WebUI.setText(findTestObject('VendorAdd/input_Company Email_inputText'), findTestData('Vendors').getValue(3, i))

    WebUI.selectOptionByIndex(findTestObject('VendorAdd/select_Type'), 1, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('VendorAdd/input_Country'), findTestData('Vendors').getValue(5, i))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('VendorAdd/input_Country'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

    WebUI.setText(findTestObject('VendorAdd/input_County'), findTestData('Vendors').getValue(6, i))

    WebUI.setText(findTestObject('VendorAdd/input_City'), findTestData('Vendors').getValue(7, i))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('VendorAdd/input_City'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

    WebUI.setText(findTestObject('VendorAdd/input_District'), findTestData('Vendors').getValue(8, i))

    WebUI.setText(findTestObject('VendorAdd/input_Street'), findTestData('Vendors').getValue(9, i))

    WebUI.setText(findTestObject('VendorAdd/input_Number'), findTestData('Vendors').getValue(10, i))

    WebUI.setText(findTestObject('VendorAdd/input_Building(Block)'), findTestData('Vendors').getValue(11, i))

    WebUI.setText(findTestObject('VendorAdd/input_Entrance'), findTestData('Vendors').getValue(12, i))

    WebUI.setText(findTestObject('VendorAdd/input_Floor'), findTestData('Vendors').getValue(13, i))

    WebUI.setText(findTestObject('VendorAdd/input_Apartment(Office)'), findTestData('Vendors').getValue(14, i))

    WebUI.setText(findTestObject('VendorAdd/input_Post Code'), findTestData('Vendors').getValue(15, i))

    WebUI.setText(findTestObject('VendorAdd/input_Web Page'), findTestData('Vendors').getValue(16, i))

    WebUI.setText(findTestObject('VendorAdd/input_Phone'), findTestData('Vendors').getValue(17, i))

    WebUI.setText(findTestObject('VendorAdd/input_Fax'), findTestData('Vendors').getValue(18, i))

    WebUI.selectOptionByIndex(findTestObject('VendorAdd/select_Currency'), 1)

    WebUI.setText(findTestObject('VendorAdd/input_Trade Register number'), findTestData('Vendors').getValue(20, i))

    WebUI.setText(findTestObject('VendorAdd/input_Fiscal Code'), findTestData('Vendors').getValue(21, i))

    WebUI.setText(findTestObject('VendorAdd/input_VAT Number'), findTestData('Vendors').getValue(22, i))

    WebUI.setText(findTestObject('VendorAdd/input_BANK account (IBAN)'), findTestData('Vendors').getValue(23, i))

    WebUI.setText(findTestObject('VendorAdd/input_BANK_'), findTestData('Vendors').getValue(24, i))

    WebUI.setText(findTestObject('VendorAdd/input_BIC Code (SWIFT)'), findTestData('Vendors').getValue(25, i))

    WebUI.setText(findTestObject('VendorAdd/input_Agency'), findTestData('Vendors').getValue(26, i))

    WebUI.click(findTestObject('VendorAdd/button_Create'))

    WebUI.delay(5)

    WebUI.scrollToPosition(0, 0)
}

