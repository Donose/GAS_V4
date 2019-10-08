package checkers

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class TextCheckOF {

	@Keyword
	def checkMyTxt(){


		if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME1'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF1'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME2'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF2'))
		} else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME3'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF3'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME4'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF4'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME5'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF5'))
		} else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME6'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF6'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME7'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF7'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME8'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF8'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME9'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF9'))
		} else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME10'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF10'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME11'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF11'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME12'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF12'))
		} else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME13'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF13'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME14'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF14'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME15'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF15'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME16'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF16'))
		} else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME17'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF17'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME18'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF18'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME19'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF19'))
		} else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME20'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF20'))
		}else if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME21'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF21'))
		}
		
	}
}
