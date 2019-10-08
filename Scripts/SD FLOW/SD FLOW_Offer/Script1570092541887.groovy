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

WebUI.click(findTestObject('Link Processes/ME to SO/button_OF1'))

WebUI.click(findTestObject('SO/Status Open/input_Sale Offer_Open'))

WebUI.rightClick(findTestObject('POR_V2/Content Information/input_Deadline'))

CustomKeywords.'checkers.TextCheckOF.checkMyTxt'()

WebUI.acceptAlert()

CustomKeywords.'com.kms.katalon.keyword.datetime.DateTimeUtility.formatStringDate'('', '', '')

WebUI.sendKeys(findTestObject('POR_V2/Content Information/input_Deadline'), '2019-10-08')

