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

CustomKeywords.'mainDashboardSelections.Selectors.selectPOR'()

CustomKeywords.'randomNumber.RandomDropDownProjectInfo.randomPOR'()

WebUI.click(findTestObject('POR_V2/Content Information/Materials/span_Select material'))

WebUI.setText(findTestObject('POR_V2/Content Information/Materials/input_Select material'), findTestData('POR Test data').getValue(
        1, 6))

WebUI.selectOptionByLabel(findTestObject('POR_V2/Content Information/select_Warehous'), findTestData('POR Test data').getValue(
        2, 1), false)

WebUI.selectOptionByLabel(findTestObject('POR_V2/Content Information/input_Deadline'), '2019-10-04', false)

WebUI.verifyElementText(findTestObject('SO/Status Open/input_Sale Offer_Cancel'), '', FailureHandling.CONTINUE_ON_FAILURE)

