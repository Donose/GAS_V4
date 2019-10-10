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

WebUI.delay(2)

String CT = WebUI.getText(findTestObject('Object Repository/Notifications/OF-CT/div_OF-CT')).substring(18, 25)

CustomKeywords.'outputExcel.NotificationOutput.writeCT'(CT, 'Contract')

System.out.println(CT)

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT1'), findTestData('Test Data').getValue(3, 1), FailureHandling.OPTIONAL)

WebUI.getText(findTestObject('Link Processes/SO-CT/button_CT1'))

CustomKeywords.'checkers.TextCheckOF.checkMyTextCT'()

